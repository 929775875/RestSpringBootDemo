package com.niudingfeng.learn.utils;

import java.util.UUID;


/**        
 * Title: 生成UUID    
 * @author lin
 * @created 2017年7月4日 下午5:13:16    
 */      
public class CodecUtil {
	
	public static String createUUID(){
		return UUID.randomUUID().toString();
	}
}
