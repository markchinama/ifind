package com.IFind.cache;

import java.util.Properties;

public class ApplicationCache {

	public static Properties ServiceMap ;

	public static Properties getServiceMap() {
		return ServiceMap;
	}

	public static void setServiceMap(Properties serviceMap) {
		ServiceMap = serviceMap;
	}

	
}
