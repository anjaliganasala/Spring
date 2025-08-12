package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;



public class Test {	
	
	public static void main(String[] args) {
			
	ApplicationContext  container = new AnnotationConfigApplicationContext(Config.class);
	
	JdbcTemplate template = container.getBean(JdbcTemplate.class);
	
	
	template.update("Insert into employee values(?,?,?)",11,"ansi@gmail.com",10000);
	
	// template.update("Update employee set email=? where emp_id = ?","spring@gmail.com",10);
	
	// template.update("delete from employee where emp_id = ?",10);
	
	   //select  - RowMapper ..
	 
//  Employee employee = template.queryForObject("select * from employee where emp_id=?", new RowMapper<Employee>() {
//		
//		@Override
//		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
//			
//			return new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3) );
//		}
//	}, 2);
//   
//    System.out.println(employee);
//    
//    List<Employee> empList = template.query("select * from employee", new RowMapper<Employee>() {
//		
//		@Override
//		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
//			
//			return new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3) );
//		}
//	});
//    
//    System.out.println(empList);
//    List<Employee> empList2 = template.query("select * from employee",(rs,num)-> new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3)));
//    System.out.println(empList2);
	}
}
