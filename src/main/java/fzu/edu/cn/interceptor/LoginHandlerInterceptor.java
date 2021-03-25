package fzu.edu.cn.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Component
public class LoginHandlerInterceptor implements HandlerInterceptor {
    // 进入Handler方法之前执行。可以用于身份认证、身份授权。
    // 比如如果认证没有通过表示用户没有登陆，需要此方法拦截不再往下执行（return false），
    // 否则就放行（return true）
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle：" + request.getRequestURI());
        HttpSession session = request.getSession(false); //如果不存在则不会产生一个session,而是返回null
        if(session!= null) { //session不为空
            System.out.println(session.getId());
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    }
}
