package cn.finte.code.service.Interceptor;

import cn.finte.code.core.config.Constants;
import cn.finte.code.entity.user.User;
import cn.finte.code.service.service.UserService;
import org.assertj.core.util.Strings;
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
        String requestUri = httpServletRequest.getRequestURI();
        for(String uri : URIS){
            if(Objects.equals(uri,requestUri)){
                return true;
            }
        }
        String token = httpServletRequest.getHeader(Constants.HEADER);
        if(Strings.isNullOrEmpty(token))
            return false;
        HttpSession session = httpServletRequest.getSession();
        String userId = (String) session.getAttribute(Constants.SESSION_ATT);
        if(Strings.isNullOrEmpty(userId)){
            return false;
        }
        User user = userService.selectById(userId);
        if(Objects.isNull(user) || !Objects.equals(token,user.getToken())){
            return false;
        }
        return true;
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

