package com.devsuperior.ormjava;

import com.devsuperior.ormjava.entities.Employee;
import com.devsuperior.ormjava.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class OrmJavaApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(OrmJavaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Employee> result = repository.findAll();

		for (Employee emp : result ){
			System.out.println(emp);
		}


	}
}
