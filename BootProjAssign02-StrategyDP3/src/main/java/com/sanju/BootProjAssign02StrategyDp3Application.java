package com.sanju;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sanju.sbeans.Mobile;

@SpringBootApplication
public class BootProjAssign02StrategyDp3Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BootProjAssign02StrategyDp3Application.class,
				args);
		Mobile mobile = context.getBean("mobile", Mobile.class);
		mobile.call();

		context.close();
	}

}
