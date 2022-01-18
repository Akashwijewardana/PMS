package com.assesment.PMS.PMS;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@Configuration
public class MVCConfig implements WebMvcConfigurer{

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {

		 String dir = "Imagers/Users";
	        Path uploadDir = Paths.get(dir);
	        String uploadPath = uploadDir.toFile().getAbsolutePath();
	        if(dir.startsWith("../")){
	            dir = dir.replace("../", "");
	        }
	        registry.addResourceHandler("/"+dir+"/**").addResourceLocations("file:/"+uploadPath+"/");
	}
}
