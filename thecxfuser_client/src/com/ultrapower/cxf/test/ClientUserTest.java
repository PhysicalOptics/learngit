package com.ultrapower.cxf.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ultrapower.cxf.ws.User;
import com.ultrapower.cxf.ws.UserWS;

public class ClientUserTest {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "client_beans.xml" });	//demo/**/client.xml
		UserWS userWS = (UserWS) context.getBean("userClient");
		User user = userWS.selectUserById(12);
		System.out.println(user.toString());
	}
}
