package com.trkj.property.exception;


/***
 * @author 胡志远
 * @date 2021-07-11
 */
public class CustomError extends RuntimeException {
    /*异常错误编码*/
    private int code ;
    /*异常信息*/
    private String message;

    private CustomError(){}

    public CustomError(CustomErrorType exceptionTypeEnum, String message) {
        this.code = exceptionTypeEnum.getCode();
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
