package com.IFind.Entity.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.IFind.Entity.User;
import com.IFind.exception.NoEntityException;
import com.IFind.sys.EntityFactory;

public class RegisterService implements IService {

	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Map map = request.getParameterMap();
		User user = (User) EntityFactory.newInstance("User", map);
		if (null == user)
			throw new NoEntityException("can not find user");
		else {
			System.out.println(user.getNickName());
		}
	}

}
