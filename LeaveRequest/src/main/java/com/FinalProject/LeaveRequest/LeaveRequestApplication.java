package com.FinalProject.LeaveRequest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
//@EnableWebMvc
//@ComponentScan(basePackages={"com.FinalProject"})
public class LeaveRequestApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeaveRequestApplication.class, args);
                System.out.println("Application has started");
	}

}
