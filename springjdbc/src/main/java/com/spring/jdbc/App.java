package com.spring.jdbc;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("My Program started......");
		// spring jdbc=> JdbcTemplate
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
		
		StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
		
		Student student = new Student();
		//******Insert******
//		student.setId(4);
//		student.setName("Vegeta");
//		student.setCity("Haryana");
//		
//		int result = studentDao.insert(student);
//		System.out.println("student added"+result);
		
		
		
		//******Update******
//		student.setId(102);
//		student.setName("Hello");
//		student.setCity("Jaipur");
//		int result = studentDao.change(student);
//		System.out.println("updated student : "+result);
//		
		
		
		//******Delete******
//		student.setId(102);
//		int result = studentDao.delete(student);
//		System.out.println("deleted student : "+result);
		
		
		//******Select******
		Student student1 = studentDao.getStudent(1);
		System.out.println(student1);
		
		//******Multiple Students******
		List<Student> allStudent = studentDao.getAllStudent();
		for (Student student2 : allStudent) {
			System.out.println(student2);
		}
	}
}
