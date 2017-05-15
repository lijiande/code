package cn.finte.code.service.config;

import cn.finte.code.service.Interceptor.AccessInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by lijian on 2017/5/15.
 */
@Configuration
public class AddInterceptor extends WebMvcConfigurerAdapter{
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(new AccessInterceptor()).addPathPatterns("/api/**");
    }
}
