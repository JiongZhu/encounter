package com.jiong.encounter.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author: JiongZhu
 * @Description:
 * @Date: Created in 23:59 2018/6/4
 * @Modified By:
 */
public class DescribeException extends RuntimeException{

    private static final long serialVersionUID = 1L;
    
	@Getter
    @Setter
    private Integer stateCode;

    /**
     * @Author: JingZhu
     * @param:  * @param exceptionEnum
     * @Description: 继承exception，加入错误状态值
     * @Date: 0:03 2018/6/5
     */
    public DescribeException(ExceptionEnums exceptionEnum) {
        super(exceptionEnum.getMessage());
        this.stateCode = exceptionEnum.getStateCode();
    }

    /**
     * @Author: JingZhu
     * @param:  * @param message
     * @param stateCode
     * @Description: 自定义错误信息
     * @Date: 0:03 2018/6/5
     */
    public DescribeException(String message, Integer stateCode) {
        super(message);
        this.stateCode = stateCode;
    }
}
