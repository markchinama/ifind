package com.IFind.util.junit;



import org.junit.Test;

import com.IFind.config.DbConfig;
import com.IFind.db.C3P0PooledConnection;

public class DbTest {

	@Test
	public void getConnection() throws Exception{
		 String filename ="C:\\smtp\\IFind\\IFind\\WebRoot\\WEB-INF\\c3p0.properties";
		 DbConfig.init(filename);
		 C3P0PooledConnection cp = new C3P0PooledConnection();
		 cp.init();
		 System.out.println( cp.getConnection()==null);
		 
	}
}
