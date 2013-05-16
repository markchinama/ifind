package com.IFind.Inti;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import com.IFind.cache.ApplicationCache;

public class InitService {

	
	public static void init(String filename) throws Exception{
		File file =  new File (filename);
		FileInputStream is = new FileInputStream(file);
		Properties serviceMap = new Properties();
		serviceMap.load(is);
		ApplicationCache.setServiceMap(serviceMap);
		System.out.println("sss");
	}
}
