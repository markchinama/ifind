package com.IFind.sys;

import com.IFind.Entity.service.IService;
import com.IFind.cache.ApplicationCache;

public class ServiceFactory {

	public static IService getService(String servicename) {
		try {
			String classname = ApplicationCache.getServiceMap().get(servicename).toString();
			System.out.println(classname);
			System.out.println(classname == null);
			System.out.println(classname.equals(""));
			Class cla = Class.forName(classname);
			Object obj = cla.newInstance();
			return (IService) obj;
		} catch (Exception e) {
			return null;
		}

	}

}
