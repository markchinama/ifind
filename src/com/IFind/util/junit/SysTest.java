package com.IFind.util.junit;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.IFind.Entity.BasicEntity;
import com.IFind.Entity.User;
import com.IFind.api.Sys;
import com.IFind.sys.EntityFactory;

public class SysTest {
	@Test
	public void sysUrlTest() {
		assert (Sys.getService(new StringBuffer(
				"http://localhost/infind/sss?sss=sss")).equals("sss"));
	}
	@Test
	public void basicEntityDataTest()
	{
		BasicEntity be = new BasicEntity();
		be.setCreated_date(null);
		System.out.println(be.getCreated_date());
		
	}
	@Test
	public void entityFactory(){
		Map map = new HashMap();
		map.put("username", "mark");
		map.put("password", "machao");
		map.put("neckname", "mark_ma");
		map.put("mailaddress", "mark.chinama@gmail.com");
		map.put("liveaddress", "shanghai");
		User user = (User)EntityFactory.newInstance("User", map);
		System.out.println(user.getLiveAddress());
		System.out.println(user.getMailAddress());
		System.out.println(user.getNeckName());
		System.out.println(user.getPassword());
		System.out.println(user.getUserName());
		System.out.println(user.getCreated_date());
		
	}
} 