package com.IFind.sys;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.IFind.Entity.service.IService;
import com.IFind.api.Sys;

public class EntityService extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String servicename = Sys.getService(request.getRequestURL());
		IService is = ServiceFactory.getService(servicename);
		try {
			is.execute(request, response);
			//response.sendRedirect("index.jsp");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		super.service(request, response);
	}



}
