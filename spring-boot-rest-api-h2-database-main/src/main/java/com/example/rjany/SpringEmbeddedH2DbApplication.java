package com.example.rjany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringEmbeddedH2DbApplication {



	public static void main(String[] args) {

			SpringApplication.run(SpringEmbeddedH2DbApplication.class, args);



	}

}
