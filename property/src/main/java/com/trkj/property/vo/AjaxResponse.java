package com.trkj.property.vo;

import com.trkj.property.exception.CustomError;
import com.trkj.property.exception.CustomErrorType;
import lombok.Data;


@Data
public class AjaxResponse {


    private boolean isSuccess;
    private int code;
    private String message;
    private Object data;

    private AjaxResponse() {

    }

    /**
     * 请求出现异常时的响应数据封装
     * @param e:异常
     * @return AjaxResponse 封闭后的响应对象
     */
    public static com.trkj.property.vo.AjaxResponse error(CustomError e) {

        com.trkj.property.vo.AjaxResponse resultBean = new com.trkj.property.vo.AjaxResponse();
        resultBean.setSuccess(false);
        resultBean.setCode(e.getCode());
        if(e.getCode() == CustomErrorType.USER_INPUT_ERROR.getCode()){
            resultBean.setMessage(e.getMessage());
        }else if(e.getCode() == CustomErrorType.SYSTEM_ERROR.getCode()){
            resultBean.setMessage(e.getMessage() + "系统异常!");
        }else if(e.getCode()== CustomErrorType.PAGE_NOT_FOUND_ERROR.getCode()){
            resultBean.setMessage("未能找到所请求的资源！");
        }else if(e.getCode()== CustomErrorType.ACCOUNT_ERROR.getCode()){
            resultBean.setMessage(e.getMessage());
        }else if(e.getCode()== CustomErrorType.ACCOUNT_ERROR1.getCode()){
            resultBean.setMessage(e.getMessage());
        }
        else {
            resultBean.setMessage("系统出现未知异常，请联系管理员电话!");
        }
        return resultBean;
    }
    /**
     * 请求正常的响应时进行数据封装
     * @return AjaxResponse 封闭后的响应对象
     */
    public static com.trkj.property.vo.AjaxResponse success() {
        com.trkj.property.vo.AjaxResponse resultBean = new com.trkj.property.vo.AjaxResponse();
        resultBean.setSuccess(true);
        resultBean.setCode(200);
        resultBean.setMessage("success");
        return resultBean;
    }
    /**
     * 请求正常的响应时进行数据封装
     * @param data:要封装到响应对象的数据
     * @return AjaxResponse 封闭后的响应对象
     */
    public static com.trkj.property.vo.AjaxResponse success(Object data) {
        com.trkj.property.vo.AjaxResponse resultBean = new com.trkj.property.vo.AjaxResponse();
        resultBean.setSuccess(true);
        resultBean.setCode(200);
        resultBean.setMessage("success");
        resultBean.setData(data);
        return resultBean;
    }



}