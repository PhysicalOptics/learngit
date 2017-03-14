package com.ultrapower.cxf.util;

public class Test {
	public static void main(String[] args) {
		String pwd = PwdUtil.setEncryptPwd("liyang", "qwer");
		System.out.println(pwd);
		String depwd = PwdUtil.revertSeed(pwd, "12");
		System.out.println(depwd);
	}
}
