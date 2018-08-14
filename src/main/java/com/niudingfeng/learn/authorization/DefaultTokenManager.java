package com.niudingfeng.learn.authorization;

import com.niudingfeng.learn.utils.CodecUtil;
import com.niudingfeng.learn.utils.StringUtil;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**        
 * Title: TokenManager的默认实现    
 * Description: 管理 Token
 * @author lin
 * @created 2017年7月4日 下午4:41:32    
 */
@Component
public class DefaultTokenManager implements TokenManager {

	/** 将token存储到JVM内存(ConcurrentHashMap)中   (@author: lin) */
	private static Map<String, String> tokenMap = new ConcurrentHashMap<String, String>();

	/** 
	 * @description 利用UUID创建Token(用户登录时，创建Token)
	 * @author lin
	 * @created 2017年7月4日 下午4:46:46      
	 * @param username
	 * @return     
	 *
	 */
	public String createToken(String username) {
		String token = CodecUtil.createUUID();
		tokenMap.put(token, username);
		return token;
	}


	/**
	 * @description Token验证(用户登录验证)
	 * @author lin
	 * @created 2017年7月4日 下午4:46:50
	 * @param token
	 * @return
	 *
	 */
	public boolean checkToken(String token) {
		return !StringUtil.isEmpty(token) && tokenMap.containsKey(token);
	}


	/**
	 * @description Token删除(用户登出时，删除Token)
	 * @author lin
	 * @created 2017年7月4日 下午4:46:54
	 * @param token
	 *
	 */  
	@Override
	public void deleteToken(String token) {
		// TODO Auto-generated method stub
		tokenMap.remove(token);
	}
}
