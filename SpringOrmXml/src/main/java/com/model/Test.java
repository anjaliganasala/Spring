package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.EmployeeDao;
import com.mysql.cj.xdevapi.SessionFactory;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext  container = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeDao employeeDao = container.getBean("employeeDao",EmployeeDao.class);
	
		Employee employee = employeeDao.getEmployee(1);
		System.out.println(employee);
		
		employeeDao.saveEmployee(new Employee("kasyap@gmail.com",300));
	}
}
