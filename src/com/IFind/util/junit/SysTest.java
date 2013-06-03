package com.IFind.util.junit;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.IFind.Entity.BasicEntity;
import com.IFind.Entity.User;
import com.IFind.Entity.service.IService;
import com.IFind.api.Sys;
import com.IFind.cache.ApplicationCache;
import com.IFind.sys.EntityFactory;
import com.IFind.sys.ServiceFactory;

public class SysTest {
	@Test
	public void sysUrlTest() {
		assert (Sys.getService(new StringBuffer(
				"http://localhost/infind/sss.en?sss=sss")).equals("sss.en"));
	}
	@Test
	public void basicEntityDataTest()
	{
		BasicEntity be = new BasicEntity();
		be.setCreatedDate(null);
		System.out.println(be.getCreatedDate());
		
	}
	@Test
	public void entityFactory(){
		Map map = new HashMap();
		map.put("username", "mark");
		map.put("password", "machao");
		map.put("nickname", "mark_ma");
		map.put("mailaddress", "mark.chinama@gmail.com");
		map.put("liveaddress", "shanghai");
		User user = (User)EntityFactory.newInstance("User", map);
		System.out.println(user.getLiveAddress());
		System.out.println(user.getMailAddress());
		System.out.println(user.getNickName());
		System.out.println(user.getPassword());
		System.out.println(user.getUserName());
		System.out.println(user.getCreatedDate());
	}
	@Test 
	public void serviceFactory() throws Exception{
	   String filename ="C:\\smtp\\IFind\\IFind\\WebRoot\\WEB-INF\\service.properties";
	   ApplicationCache.init(filename);
	   IService is = ServiceFactory.getService("register");
	   System.out.println(is==null);
	   
	   
	}
} 