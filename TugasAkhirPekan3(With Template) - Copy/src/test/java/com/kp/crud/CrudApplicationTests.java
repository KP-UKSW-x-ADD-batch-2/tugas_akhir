package com.kp.crud;

import com.kp.crud.entities.Employee;
import com.kp.crud.services.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CrudApplicationTests {
    @Autowired
    EmployeeService empService;

	@Test
	void contextLoads() {
            System.out.println("Plish!");
            
	}

}
