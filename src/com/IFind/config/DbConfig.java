package com.IFind.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DbConfig {

	private static Properties dbconfig;

	public static void init(String filename) throws IOException {
		InputStream inStream = new FileInputStream(filename);
		Properties properties = new Properties();
		properties.load(inStream);
		setDbconfig(properties);
	}

	public static String getValue(String key) {
		return dbconfig.getProperty(key);
	}

	public static Properties getDbconfig() {
		return dbconfig;
	}

	public static void setDbconfig(Properties dbconfig) {
		DbConfig.dbconfig = dbconfig;
	}

	public static int getIntValue(String key) {
		return Integer.parseInt(getValue(key));
	}

}
