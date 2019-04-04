package com.zhiyou100.interceptor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zhiyou100.entity.User;
import com.zhiyou100.vo.ResponseVo;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author BianGe
 * @ClassName LoginInterceptor
 * @Description TODO
 * @create 2019/3/27 20:18
 * @Version 1.0
 **/
@Component
public class LoginInterceptor extends HandlerInterceptorAdapter {

    /**
     * This implementation always returns {@code true}.
     *
     * @param request
     * @param response
     * @param handler
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        // 通过请求获取session
        HttpSession session = request.getSession();

        // 从session 中获取用户登录过的登录信息
        User User = (User) session.getAttribute("User");

        // 如果不为空，说明登陆过 放行
        if (User == null) {
            // 新建统一响应资源类
            ResponseVo vo = new ResponseVo(400304,"请先登录");

            // jackson 中使用 ObjectMapper 实现对象和 json 字符串之间的相互转化
            ObjectMapper objectMapper = new ObjectMapper();

            // 把 vo 对象 转换成 json
            String json = objectMapper.writeValueAsString(vo);

            // 设置响应的字符编码集
            response.setContentType("application/json;charset=UTF-8");

            // 将json 字符串写入响应的中
            response.getWriter().print(json);

             return  false;
        }
        // 拦截
        return true;
    }
}