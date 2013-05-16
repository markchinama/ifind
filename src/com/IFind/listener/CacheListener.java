package com.IFind.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.IFind.Inti.InitService;

public class CacheListener implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void contextInitialized(ServletContextEvent event) {
		// TODO Auto-generated method stub
		try {
			String filename = event.getServletContext().getRealPath("WEB-INF/service.properties");
			InitService.init(filename);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
