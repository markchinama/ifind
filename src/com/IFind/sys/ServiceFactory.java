package com.IFind.sys;

import com.IFind.Entity.service.IService;

public class ServiceFactory {
	public static IService getService(String servicename) {
		try {
			Class cla = Class.forName(servicename);
			Object obj = cla.newInstance();
			return (IService) obj;
		} catch (Exception e) {
			return null;
		}

	}

}
