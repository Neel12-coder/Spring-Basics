package com.example.Beginnerproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BeginnerprojectApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context= SpringApplication.run(BeginnerprojectApplication.class, args);
		//.run returns obj of class ConfigurableApplicationContext
		Alien a = context.getBean(Alien.class); //means bring that obj of Alien class from Spring container(by default singleton)
		a.show();
		//even if we make another object a1 of alien (it won't make another ob in spring container)

//		Alien a1 = context.getBean(Alien.class); // obj won't be created - constructor won't be called
//		a1.show();

		// Now, if we want to create another obj of Alien change the property from singleton to prototype by adding scope in alien class


	}

}
