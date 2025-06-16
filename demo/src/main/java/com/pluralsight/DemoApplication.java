package com.pluralsight;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.pluralsight.service.RegistrationService;
import com.pluralsight.model.Student;

@SpringBootApplication
public class DemoApplication {

	
	public static void main(String[] args) {
		ApplicationContext context;

		//SpringApplication.run(DemoApplication.class, args);
		context = (ApplicationContext) SpringApplication.run(DemoApplication.class, args);

		for (String name : context.getBeanDefinitionNames()) {
			System.out.println(name);
		}
		
		RegistrationService registrationService = context.getBean(RegistrationService.class);

		Student s = registrationService.getStudentById(44L);
		System.out.println("Estudiante encontrado: " + s.getFirstName() + " " + s.getLastName());

		CLI cli = context.getBean(CLI.class);
		cli.run("Hello", "World", "!");
	}


}
