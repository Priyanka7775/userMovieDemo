package com.example.userMovieDemo;

import com.example.userMovieDemo.filter.JwtFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserMovieDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserMovieDemoApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean jwtFilter(){
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean<>();
		filterRegistrationBean.setFilter(new JwtFilter());
		filterRegistrationBean.addUrlPatterns("/usermovieapp/user/addmovie/*");
		return filterRegistrationBean;
	}


}
