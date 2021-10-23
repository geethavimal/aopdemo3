package com.tulip.aopdemo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan(basePackages = {"com.tulip"})

public class Aopdemo3Application {

	public static void main(String[] args) {
		SpringApplication.run(Aopdemo3Application.class, args);
	}

}
