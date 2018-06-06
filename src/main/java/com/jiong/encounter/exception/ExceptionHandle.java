package com.jiong.encounter.exception;

import com.jiong.encounter.unit.ResultUtil;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: JiongZhu
 * @Description:
 * @Date: Created in 0:05 2018/6/5
 * @Modified By:
 */
@RestControllerAdvice
public class ExceptionHandle {

    /**
     * 应用到所有@RequestMapping注解方法，在其执行之前初始化数据绑定器
     *
     * @param: binder
     */
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        System.out.println("请求有参数才进来");
    }

    /**
     * 判断错误是否是已定义的已知错误，不是则由未知错误代替
     *
     * @param: e
     */
    @ExceptionHandler(value = Exception.class)
    public Object exceptionGet(Exception e, HttpServletRequest req) {
        //使用HttpServletRequest中的header检测请求是否为ajax, 如果是ajax则返回json, 如果为非ajax则返回view(即ModelAndView)
        String contentTypeHeader = req.getHeader("Content-Type");
        String acceptHeader = req.getHeader("Accept");
        String xRequestedWith = req.getHeader("X-Requested-With");
        if ((contentTypeHeader != null && contentTypeHeader.contains("application/json"))
                || (acceptHeader != null && acceptHeader.contains("application/json"))
                || "XMLHttpRequest".equalsIgnoreCase(xRequestedWith)) {
            return (e instanceof DescribeException) ? (ResultUtil.returnFailReuslt(((DescribeException) e).getStateCode(), e.getMessage())) : (ResultUtil.returnFailReuslt(ExceptionEnums.UNKOWN_ERROR));
        } else {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.addObject("msg", e.getMessage());
            modelAndView.addObject("url", req.getRequestURL());
            modelAndView.addObject("stackTrace", e.getStackTrace());
            modelAndView.setViewName("error");
            return modelAndView;
        }
    }
}