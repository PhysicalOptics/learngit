package com.ultrapower.cxf.util;

import com.ultrapower.algorithm.Algorithm;
import com.ultrapower.encrypt.EncryptManager;
import com.ultrapower.encrypt.encryptkey.KeyGenerator;
import com.ultrapower.exception.EncryptException;


/**
 * @Classname PwdUtil.java
 * @ClassDescription 提供对密码进行加密解密的操作 
 * @author liuxiangsong
 * @Date Aug 7, 2013
 * @Version V1.0
 */
public class PwdUtil {


    /**
     * @method 对密码进行加密操�?
     * @param pwd �?要加密的密码
     * @param key 加密的key
     * @param generatorkey  统使用的生成加密key实现类的key�?
     * @param algorithmKey  系统使用的加密算法实现类的key�?
     * @return
     */
    public static String setEncryptPwd(String pwd, String key,String generatorkey, String algorithmKey) {
        if (StrUtil.isNullStr(pwd)) {
            return pwd;
        }
        String confusePwd = pwd;
        try {
            EncryptManager manager = EncryptManager.getInstance();
            // 获得生成加密key的实现类
            KeyGenerator keyGenerator = manager.getKeyGenerator(generatorkey);
            // 获得加密算法实现�?
            Algorithm algorithm = manager.getAlgorithm(algorithmKey);
            if (keyGenerator != null && algorithm != null) {
                // 获得加密种子
                String seed = keyGenerator.getEncryptSeed(key);
                // 获得加密�?
                String salt = keyGenerator.getEncryptSalt(key);
                // 加密
                confusePwd = algorithm.encrypt(pwd, seed, salt);
            }
        } catch (EncryptException e) {
            e.printStackTrace();
        }
        return confusePwd;
    }
    
    /**
     * @method 默认使用AMS系统使用的加密实现类及加密算法进行加密操�?
     * @param pwd �?要加密的密码
     * @param key 加密的key
     * @return
     */
    public static String setEncryptPwd(String pwd, String key) {
        if (StrUtil.isNullStr(pwd)) {
            return pwd;
        }
        String confusePwd = pwd;
        try {
            EncryptManager manager = EncryptManager.getInstance();
            // 获得生成加密key的实现类
            KeyGenerator keyGenerator = manager.getKeyGenerator(Constants.ENCRTY_KEYGENERATOR_AMS);
            // 获得加密算法实现�?
            Algorithm algorithm = manager.getAlgorithm(Constants.ENCRTY_ALGORITHM_AMS);
            if (keyGenerator != null && algorithm != null) {
                // 获得加密种子
                String seed = keyGenerator.getEncryptSeed(key);
                // 获得加密�?
                String salt = keyGenerator.getEncryptSalt(key);
                // 加密
                confusePwd = algorithm.encrypt(pwd, seed, salt);
            }
        } catch (EncryptException e) {
            e.printStackTrace();
        }
        return confusePwd;
    }
    
    /**
     * @method 对密码进行解密密操作
     * @param pwd �?要解密的密码
     * @param key 解密的key
     * @param generatorkey  统使用的生成加密key实现类的key�?
     * @param algorithmKey  系统使用的加密算法实现类的key�?
     * @return
     */
    public static  String revertSeed(String pwd, String key,String generatorkey, String algorithmKey) {
        String result = pwd;
        try {
            //=============使用AMS自定义算法加�?======================
            EncryptManager manager = EncryptManager.getInstance();
            //获得生成加密key的实现类
            KeyGenerator keyGenerator = manager.getKeyGenerator(generatorkey);
            //获得加密算法实现�?
            Algorithm algorithm = manager.getAlgorithm(algorithmKey);
            //=============使用AMS自定义算法解�?======================
            //获得解密时�?�使用的种子
            String  decryptSeed = keyGenerator.revertSeed(pwd,key);
            //获得解密时�?�使用的�?
            String  decryptSalt = keyGenerator.revertSalt(pwd,key);
            //解密
            result = algorithm.decrypt(pwd,decryptSeed,decryptSalt);
        } catch (EncryptException e) {
            e.printStackTrace();
        }
        return result;
    }
    
    /**
     * @method 默认使用AMS系统使用的加密实现类及加密算法进行解密密操作
     * @param pwd �?要解密的密码
     * @param key 解密的key
     * @return
     */
    public static  String revertSeed(String pwd, String key) {
        String result = pwd;
        try {
            //=============使用AMS自定义算法加�?======================
            EncryptManager manager = EncryptManager.getInstance();
            //获得生成加密key的实现类
            KeyGenerator keyGenerator = manager.getKeyGenerator(Constants.ENCRTY_KEYGENERATOR_AMS);
            //获得加密算法实现�?
            Algorithm algorithm = manager.getAlgorithm(Constants.ENCRTY_ALGORITHM_AMS);
            //=============使用AMS自定义算法解�?======================
            //获得解密时�?�使用的种子
            String  decryptSeed = keyGenerator.revertSeed(pwd,key);
            //获得解密时�?�使用的�?
            String  decryptSalt = keyGenerator.revertSalt(pwd,key);
            //解密
            result = algorithm.decrypt(pwd,decryptSeed,decryptSalt);
        } catch (EncryptException e) {
            e.printStackTrace();
        }
        return result;
    }
    
    
    
    
}
