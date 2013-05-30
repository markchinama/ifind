package com.IFind.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.IFind.config.DbConfig;

public class ConfigListener implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void contextInitialized(ServletContextEvent event) {
		// TODO Auto-generated method stub
		try {
			String filename = event.getServletContext().getRealPath("WEB-INF/dbconfig.properties");
			DbConfig.init(filename);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
