package com.push.springdbconn;

import org.springframework.beans.factory.annotation.Value;

public class Mysql {
	
	@Value("${mysql.driver}")
	private String driver;
	
	@Value("${mysql.url}")
	private String url;
	
	@Value("${mysql.user}")
	private String user;
	
	@Value("${mysql.pwd}")
	private String pwd;
	
	public void display() {
		System.out.println(driver);
		System.out.println("url: "+url+" user: "+user+" pwd: "+pwd);
	}
	
	public void getConnection() {
		System.out.println(url+","+user+","+pwd);
	}

}
