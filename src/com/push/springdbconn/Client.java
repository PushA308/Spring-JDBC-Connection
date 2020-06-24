package com.push.springdbconn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/push/springdbconn/beans.xml");
		Mysql driverManager = context.getBean("mysql",Mysql.class);
		driverManager.getConnection();
	}

}
