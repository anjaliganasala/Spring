package com;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class Test {

	public static void main(String[] args) {
		
	
	ApplicationContext  container = new ClassPathXmlApplicationContext("beans.xml");
	JdbcTemplate template = container.getBean("jdbcTemplate", JdbcTemplate.class);
	
	// template.update("Insert into employee values(?,?,?)",9,"ansible@gmail.com",10000);
	
	// template.update("Update employee set email=? where emp_id = ?","spring@gmail.com",10);
	
	// template.update("delete from employee where emp_id = ?",10);
	
	   //select  - RowMapper ..
	 
  Employee employee = template.queryForObject("select * from employee where emp_id=?", new RowMapper<Employee>() {
		
		@Override
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			return new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3) );
		}
	}, 2);
   
    System.out.println(employee);
    
    List<Employee> empList = template.query("select * from employee", new RowMapper<Employee>() {
		
		@Override
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			return new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3) );
		}
	});
    
    System.out.println(empList);
    List<Employee> empList2 = template.query("select * from employee",(rs,num)-> new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3)));
    System.out.println(empList2);
	}
}
