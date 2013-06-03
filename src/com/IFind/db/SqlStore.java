package com.IFind.db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SqlStore {

	private static Properties sqlstore;

	private static void setSqlStore(Properties sqlstroe) {
		SqlStore.sqlstore = sqlstroe;
	}

	public static void init(String filename) throws IOException {
		InputStream inStream = new FileInputStream(filename);
		Properties properties = new Properties();
		properties.load(inStream);
		setSqlStore(properties);
	}

	public static String getSql(String key) {
		return sqlstore.getProperty(key);
	}
}
