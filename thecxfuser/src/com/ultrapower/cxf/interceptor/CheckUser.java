package com.ultrapower.cxf.interceptor;

import java.util.List;

import javax.xml.namespace.QName;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.apache.xml.utils.DOMHelper;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.ultrapower.cxf.util.PwdUtil;
import com.ultrapower.cxf.util.Test3DES;

/**
 * 
 * 检查用户的拦截器
 * @author Administrator
 * @since Feb 2, 2016
 * @version v3.0
 */
public class CheckUser extends AbstractPhaseInterceptor<SoapMessage> {
	
	public CheckUser() {
		//准备协议化拦截
		super(Phase.PRE_PROTOCOL);
		System.out.println("checkUser()...."); 
	}

	public void handleMessage(SoapMessage msg) throws Fault {
		/*<atguigu>
			<name>xfzhang</name>
			<password>123456</password>
		</atguigu>*/
		Header header = msg.getHeader(new QName("ultra"));
		if(header==null){
			System.out.println("收不到header请求");
		}
		if(header!=null){
			Element root = (Element)header.getObject();
			String name = root.getElementsByTagName("name").item(0).getTextContent();
			String password = root.getElementsByTagName("password").item(0).getTextContent();
			System.out.println(name+"======"+password);
			
			//3DES解密
			name = PwdUtil.revertSeed(name, "liyang");
			password= PwdUtil.revertSeed(password, "123");
			if("liyang".equals(name)&&"123123".equals(password)){
				System.out.println("通过拦截器");
				return;
			}
		}
		System.out.println("server 没有通过拦截器...");
		throw new Fault(new RuntimeException("请求账号或密码错误"));
	}

}
