package com.test.sfgdi;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.test.sfgdi.controllers.ConstructorInjectedController;
import com.test.sfgdi.controllers.MyController;
import com.test.sfgdi.controllers.PropertyInjectedController;
import com.test.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.Clock;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myC = (MyController) ctx.getBean("myController", MyController.class);

		System.out.println("hello from myController: "+myC.hello());

		PropertyInjectedController propertyInjectedController
				= (PropertyInjectedController) ctx.getBean("propertyInjectedController");


		System.out.println("hello from propertyInjectedController: "+propertyInjectedController.getGreeting());


		SetterInjectedController setterInjectedController
				= (SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println("hello from setterInjectedController: " +
				setterInjectedController.getGreeting());


		ConstructorInjectedController constructorInjectedController;
		constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println("Hello from constructorInjectedController "+ constructorInjectedController.getGreeting() );

	}

}
