package com.globomart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

import com.globamart.config.JpaConfiguration;
import com.globamart.config.SecurityConfiguration;

@SpringBootApplication
@ComponentScan(basePackages="com.globamart.config")
@EnableAutoConfiguration
public class GloboMartApplication {

	public static void main(String[] args){
		ApplicationContext context =  SpringApplication.run(GloboMartApplication.class, args);
		System.out.println("Beans Count :"+context.getBeanDefinitionCount());
		/*for(String beanName : context.getBeanDefinitionNames()){
		      System.out.println(beanName);
		}*/
		 
		System.out.println("auth Bean:"+context.getBeansOfType(AuthenticationManagerBuilder.class));
		System.out.println("Jpa Bean:"+context.getBeansOfType(JpaConfiguration.class));
		System.out.println("Security Bean:"+context.getBeansOfType(SecurityConfiguration.class));
		
	}
}
