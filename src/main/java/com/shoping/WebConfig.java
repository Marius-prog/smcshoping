package com.shoping;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/").setViewName("home");
//    }

//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry){
//        registry
//                .addResourceHandler("/media/**")     //may be **
//                .addResourceLocations("/Users/macbookpro/Documents/imagesOfShop");
//    }

}

///problem with images if i uncomment