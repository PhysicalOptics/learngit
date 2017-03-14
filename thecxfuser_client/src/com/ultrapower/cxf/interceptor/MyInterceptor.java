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


public class MyInterceptor extends AbstractPhaseInterceptor<SoapMessage> {
	private String name;
	private String password;
	
	public MyInterceptor(String name,String password) {
		//׼��Э�黯����
		super(Phase.PRE_PROTOCOL);
		this.name=name;
		this.password=password;
	}

	public void handleMessage(SoapMessage msg) throws Fault {
		
		List<Header> headers = msg.getHeaders();
		/*<ultra>
			<name>xfzhang</name>
			<password>123456</password>
		</ultra>*/
		Document document = DOMHelper.createDocument();
		Element rootEle = document.createElement("ultra");
		//дһ��nameEle
		Element nameEle = document.createElement("name");
		//3DES����
		name = PwdUtil.setEncryptPwd(name, "liyang");
		//��nameEle��ֵ�Լ��������
//		nameEle.setAttribute("name", name);
		nameEle.setTextContent(name);
		rootEle.appendChild(nameEle);
		
		Element pswEle = document.createElement("password");
		//3DES����
		password = PwdUtil.setEncryptPwd(password, "123");
		//pswEle.setAttribute("password",password);
		
		pswEle.setTextContent(password);
		rootEle.appendChild(pswEle);
		
		headers.add(new Header(new QName("ultrapower"), rootEle));
		
		System.out.println("client MyInterceptor....");
	}

}
