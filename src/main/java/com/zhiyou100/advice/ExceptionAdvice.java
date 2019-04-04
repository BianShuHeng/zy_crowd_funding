package com.zhiyou100.advice;

import com.zhiyou100.exception.ProjectException;
import com.zhiyou100.exception.UserException;
import com.zhiyou100.vo.ResponseVo;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author BianGe
 * @ClassName ExceptionAdvice
 * @Description 处理所 controller 层接收到的异常
 * @create 2019/3/27 19:49
 * @Version 1.0
 **/
@RestControllerAdvice
class ExceptionAdvice {

    /**
     *  说明方法用于处理所有UserException异常
     * @param ex
     * @return ResponseVo
     */
    @ExceptionHandler(UserException.class)
    public ResponseVo userException(UserException ex) {

        // 取出 errorCode 和 errorMessage 封装为 ResponseVo 发送给客户端
        return new ResponseVo(ex.getErrorCode(),ex.getErrorMessage());
    }

    @ExceptionHandler(ProjectException.class)
    public ResponseVo projectException(UserException ex) {

        // 取出 errorCode 和 errorMessage 封装为 ResponseVo 发送给客户端
        return new ResponseVo(ex.getErrorCode(),ex.getErrorMessage());
    }

}