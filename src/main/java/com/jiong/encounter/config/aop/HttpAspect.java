package com.jiong.encounter.config.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
/**
 * @author jiongzhu
 * @since 2018-05-22 12:27
 * 监控controller的请求信息和响应信息
 */
@Aspect
@Component
public class HttpAspect {

    private final static Logger LOGGER = LoggerFactory.getLogger(HttpAspect.class);

    @Pointcut("execution(public * com.jiong.encounter.controller.*.*(..))")
    public void webLog(){}

    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        LOGGER.info("URL={}",request.getRequestURL().toString());
        LOGGER.info("HTTP_METHOD={}",request.getMethod());
        LOGGER.info("IP={}",request.getRemoteAddr());
        LOGGER.info("CLASS_METHOD={}",joinPoint.getSignature().getDeclaringTypeName() + "," + joinPoint.getSignature().getName());
        LOGGER.info("ARGS={}",joinPoint.getArgs());
    }

    @AfterReturning(pointcut = "webLog()",returning = "ret")//打印输出结果
    public void doAfterReturing(Object ret){
        LOGGER.info("RESPONSE={}",ret.toString());
    }
}
