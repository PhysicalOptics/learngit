package com.ultrapower.cxf.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.ultrapower.cxf.bean.User;
@WebService
public interface UserWS {
	@WebMethod
	public User selectUserById(@WebParam(name="id")Integer id);
	
}
