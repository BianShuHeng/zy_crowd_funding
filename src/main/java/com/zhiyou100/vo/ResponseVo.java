package com.zhiyou100.vo;

/**
 * @author BianGe
 * @ClassName ResponseVo
 * @Description TODO
 * @create 2019/3/27 17:37
 * @Version 1.0
 **/
public class ResponseVo<T> {

    private Integer code;

    private  String message;

    private T data;

    public ResponseVo() {
    }

    /**
     *  请求失败时使用这个构造方法， 指定状态码和信息，不需要数据
     * @param: code message
     * @return:
     */
    public ResponseVo(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     *  请求成功时使用这个构造方法， 指定数据，状态码和信息使用默认值
     * @param: data
     * @return:
     */
    public ResponseVo(T data) {

        this.code = 200;

        this.message = "请求成功";

        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}