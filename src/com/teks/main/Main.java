package com.teks.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 import com.teks.beans.Student;
public class Main {

	 public static void main(String[] args) {

	        ApplicationContext context =
	            new ClassPathXmlApplicationContext(
	                "/com/teks/resource/applicationContext.xml"
	            		
	            );

	        Student std = (Student) context.getBean("stdid");
	        std.display();
	    }
	}
// 1.spring-bean
//2.spring-core
//3.spring-context
//4.common logging
//5.spring-expression