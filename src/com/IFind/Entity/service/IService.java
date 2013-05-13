package com.IFind.Entity.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IService {

	public abstract  void execute(HttpServletRequest request,HttpServletResponse response) throws Exception;
}
