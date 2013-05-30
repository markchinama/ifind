package com.IFind.cache;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ApplicationCache {

	public static Properties ServiceMap ;

	public static Properties getServiceMap() {
		return ServiceMap;
	}

	public static void setServiceMap(Properties serviceMap) {
		ServiceMap = serviceMap;
	}
	public static void init(String filename) throws IOException {
		FileInputStream is = new FileInputStream(filename);
		Properties serviceMap = new Properties();
		serviceMap.load(is);
		setServiceMap(serviceMap);
	}
	
}
