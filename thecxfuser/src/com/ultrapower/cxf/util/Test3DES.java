package com.ultrapower.cxf.util;

import java.io.ByteArrayOutputStream;
import java.security.Security;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class Test3DES {
	// ���� �����㷨,���� DES,DESede,Blowfish
	private static final String Algorithm = "DESede"; 
	private static final String hexString = "0123456789ABCDEF";

	/**
	 *                                                   
	 * @param keybyte  ������Կ������Ϊ24�ֽ�
	 * @param src     �ֽ�����(���ݸ������ֽ����鹹��һ����Կ�� )
	 * @return
	 */
	public static byte[] encryptMode(byte[] keybyte, byte[] src) {
		try {
			// ���ݸ������ֽ�������㷨����һ����Կ
			SecretKey deskey = new SecretKeySpec(keybyte, Algorithm);
			// ����
			Cipher c1 = Cipher.getInstance(Algorithm);
			c1.init(Cipher.ENCRYPT_MODE, deskey);
			return c1.doFinal(src);
		} catch (java.security.NoSuchAlgorithmException e1) {
			e1.printStackTrace();
		} catch (javax.crypto.NoSuchPaddingException e2) {
			e2.printStackTrace();
		} catch (java.lang.Exception e3) {
			e3.printStackTrace();
		}
		return null;
	}

	/**
	 * 
	 * @param keybyte ��Կ
	 * @param src       ��Ҫ���ܵ�����
	 * @return
	 */
	public static byte[] decryptMode(byte[] keybyte, byte[] src) {
		try {
			// ������Կ
			SecretKey deskey = new SecretKeySpec(keybyte, Algorithm);
			// ����
			Cipher c1 = Cipher.getInstance(Algorithm);
			c1.init(Cipher.DECRYPT_MODE, deskey);
			return c1.doFinal(src);
		} catch (java.security.NoSuchAlgorithmException e1) {
			e1.printStackTrace();
		} catch (javax.crypto.NoSuchPaddingException e2) {
			e2.printStackTrace();
		} catch (java.lang.Exception e3) {
			e3.printStackTrace();
		}
		return null;
	}

	/**
	 * �ַ���תΪ16����
	 * @param str
	 * @return
	 */
	public static String encode(String str) {
		//����Ĭ�ϱ����ȡ�ֽ����� 
		byte[] bytes = str.getBytes();
		/*for (int i = 0; i < bytes.length; i++){
			System.out.print("["+bytes[i]+"]");
		}
		System.out.println("-----");*/
		StringBuilder sb = new StringBuilder(bytes.length * 2);

		//���ֽ�������ÿ���ֽڲ���2λ16�������� 
		for (int i = 0; i < bytes.length; i++) {
			//bytes[i] & 0xf0��λ�����0&1=0 1&1=1 0&0=0			
			sb.append(hexString.charAt((bytes[i] & 0xf0) >> 4));
			sb.append(hexString.charAt((bytes[i] & 0x0f) >> 0));
		}
		return sb.toString();
	}

	/**
	 * 
	 * @param bytes
	 * @return
	 * ��16�������ֽ�����ַ���,�����������ַ����������ģ� 
	 */
	public static String decode(String bytes) {
		ByteArrayOutputStream baos = new ByteArrayOutputStream(
				bytes.length() / 2);
		//��ÿ2λ16����������װ��һ���ֽ� 
		for (int i = 0; i < bytes.length(); i += 2){
			baos.write((hexString.indexOf(bytes.charAt(i)) << 4 | hexString.indexOf(bytes.charAt(i + 1))));			
		}
		return new String(baos.toByteArray());
	}

	// ת����ʮ�������ַ���
	public static String byte2hex(byte[] b) {
		String hs = "";
		String stmp = "";
		for (int n = 0; n < b.length; n++) {
			stmp = (java.lang.Integer.toHexString(b[n] & 0XFF));
			if (stmp.length() == 1)
				hs = hs + "0" + stmp;
			else
				hs = hs + stmp;
			if (n < b.length - 1)
				hs = hs + ":";
		}
		return hs.toUpperCase();
	}

	public static void main(String[] args) {
		// ����°�ȫ�㷨,�����JCE��Ҫ������ӽ�ȥ
		//����addProvider����������һ���µļ����㷨�ṩ��(�������û���ҵ��õĴ�,�󲹳�)
		Security.addProvider(new com.sun.crypto.provider.SunJCE());
		//byte����(����������Կ��)
		final byte[] keyBytes = { 0x11, 0x22, 0x4F, 0x58, (byte) 0x88, 0x10,
				0x40, 0x38, 0x28, 0x25, 0x79, 0x51, (byte) 0xCB, (byte) 0xDD,
				0x55, 0x66, 0x77, 0x29, 0x74, (byte) 0x98, 0x30, 0x40, 0x36,
				(byte) 0xE2 };
		String szSrc = "This is a 3DES test. ����";
		System.out.println("����ǰ���ַ���:" + szSrc);

		byte[] encoded = encryptMode(keyBytes, szSrc.getBytes());
		System.out.println("���ܺ���ַ���:" + new String(encoded));

		byte[] srcBytes = decryptMode(keyBytes, encoded);
		System.out.println("���ܺ���ַ���:" + new String(srcBytes));
		//------------------------------------------------------------
		String byt = "�ַ���ת��Ϊ16����";
		byt = encode(byt);
		System.out.println(byt);
		byt = decode(byt);
		System.out.println(byt);

	}
}
