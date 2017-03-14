package com.ultrapower.cxf.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.ultrapower.cxf.bean.User;
@WebService
public class UserWSImpl implements UserWS {
	
	public UserWSImpl(){
		System.out.println("UserWSImpl in server loading....");
	}
	@WebMethod
	public User selectUserById(@WebParam(name="id")Integer id) {
		System.out.println("server selectUserById("+id+") success invoke");
		return new User(id,"liyang","123123");
	}

}
