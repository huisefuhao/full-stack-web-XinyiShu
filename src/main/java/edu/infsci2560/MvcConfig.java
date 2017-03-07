package edu.infsci2560;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/recipe").setViewName("recipe");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/tip").setViewName("tip");
        registry.addViewController("/good").setViewName("good");
        registry.addViewController("/masterpiece").setViewName("masterpiece");
    }

}