package cn.finte.code.service.Interceptor;

import cn.finte.code.core.config.Constants;
import cn.finte.code.entity.user.User;
import cn.finte.code.service.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Objects;

/**
 * Created by lijian on 2017/5/15.
 */
@Component
public class AccessInterceptor implements HandlerInterceptor {

    private static final String[] URIS = {"/api/systemController/login","/api/systemController/regist"};


    @Inject
    private UserService userService;

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("----------------------拦截前");
        if(true){
            return true;
        }
        String requestUri = httpServletRequest.getRequestURI();
        for(String uri : URIS){
            if(Objects.equals(uri,requestUri)){
                return true;
            }
        }
        String token = httpServletRequest.getHeader(Constants.HEADER);
        HttpSession session = httpServletRequest.getSession();
        String userId = (String) session.getAttribute(Constants.SESSION_ATT);
        User user = userService.selectById(userId);
        if(Objects.nonNull(user) && Objects.equals(token,user.getToken())){
            return true;
        }
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("----------------------放过请求后");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("----------------------拦截后");
    }
}

