package com.devsuperior.ormjava.repositories;

import com.devsuperior.ormjava.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
