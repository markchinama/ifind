package com.IFind.sys;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

import com.IFind.Entity.BasicEntity;

public class EntityFactory {

	public final static String ENTITYPATH = "com.IFind.Entity.";
	public final static String SETTER = "set";

	@SuppressWarnings("unchecked")
	public static Object newInstance(String entityname, Map map) {
		try {
			System.out.println(ENTITYPATH + entityname );
			Class<BasicEntity> cla = (Class<BasicEntity>) Class
					.forName(ENTITYPATH + entityname);
			Object obj = cla.newInstance();
			System.out.println("the result is "+obj==null);
			Method[] methods = cla.getMethods();
			for (Method method : methods) {
				String methodName = method.getName();
				if (methodName.substring(0, 3).equalsIgnoreCase(SETTER)) {
					String field = methodName.substring(3, methodName.length()).toLowerCase();
					method.invoke(obj, map.get(field));
				}
			}
			return obj;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			return null;
		}

	}
}
