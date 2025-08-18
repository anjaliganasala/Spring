package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.Config;
import com.dao.EmployeeDao;
public class Test {
	
	public static void main(String[] args) {
		ApplicationContext  container = new AnnotationConfigApplicationContext(Config.class);
		EmployeeDao employeeDao = container.getBean("dao",EmployeeDao.class);
	
		Employee employee = employeeDao.getEmployee(1);
		System.out.println(employee);
		
//		employeeDao.saveEmployee(new Employee("kasyap@gmail.com",300));
	}
}
