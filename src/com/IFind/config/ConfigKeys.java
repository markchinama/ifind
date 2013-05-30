/*
 * Copyright (c) JForum Team
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, 
 * with or without modification, are permitted provided 
 * that the following conditions are met:
 * 
 * 1) Redistributions of source code must retain the above 
 * copyright notice, this list of conditions and the 
 * following  disclaimer.
 * 2)  Redistributions in binary form must reproduce the 
 * above copyright notice, this list of conditions and 
 * the following disclaimer in the documentation and/or 
 * other materials provided with the distribution.
 * 3) Neither the name of "Rafael Steil" nor 
 * the names of its contributors may be used to endorse 
 * or promote products derived from this software without 
 * specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT 
 * HOLDERS AND CONTRIBUTORS "AS IS" AND ANY 
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, 
 * BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF 
 * MERCHANTABILITY AND FITNESS FOR A PARTICULAR 
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL 
 * THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE 
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, 
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES 
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF 
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, 
 * OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER 
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER 
 * IN CONTRACT, STRICT LIABILITY, OR TORT 
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN 
 * ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF 
 * ADVISED OF THE POSSIBILITY OF SUCH DAMAGE
 * 
 * Created on May 29, 2004 by pieter
 * The JForum Project
 * http://www.jforum.net
 */
package com.IFind.config;

public class ConfigKeys 
{
	public static final String LOGGED = "logged";
	public static final String APPLICATION_PATH = "application.path";
	public static final String INSTALLATION = "installation";
	public static final String INSTALLED = "installed";

	public static final String INSTALLATION_CONFIG = "installation.config";
	public static final String CACHEABLE_OBJECTS = "cacheable.objects";
	
	public static final String FILECHANGES_DELAY = "file.changes.delay";
	public static final String DATABASE_PING_DELAY = "database.ping.delay";
	public static final String DATABASE_CONNECTION_IMPLEMENTATION = "database.connection.implementation";
	public static final String DATABASE_DRIVER_NAME = "database.driver.name";
	public static final String DATABASE_DRIVER_CONFIG = "database.driver.config";
	public static final String DATABASE_CONNECTION_HOST = "database.connection.host";
	public static final String DATABASE_CONNECTION_USERNAME = "database.connection.username";
	public static final String DATABASE_CONNECTION_PASSWORD = "database.connection.password";
	public static final String DATABASE_CONNECTION_DBNAME = "database.connection.dbname";
	public static final String DATABASE_CONNECTION_ENCODING = "dbencoding";
	public static final String DATABASE_CONNECTION_DRIVER = "database.connection.driver";
	public static final String DATABASE_CONNECTION_STRING = "database.connection.string";
	public static final String DATABASE_CONNECTION_PORT = "database.connection.port";
	public static final String DATABASE_POOL_MIN = "database.connection.pool.min";
	public static final String DATABASE_POOL_MAX = "database.connection.pool.max";
	public static final String DATABASE_USE_TRANSACTIONS = "database.use.transactions";
	public static final String DATABASE_DATASOURCE_NAME = "database.datasource.name";
	public static final String DATABASE_ERROR_PAGE = "database.error.page";
	public static final String DATABASE_MYSQL_UNICODE = "mysql.unicode";
	public static final String DATABASE_MYSQL_ENCODING = "mysql.encoding";
	public static final String DATABASE_AUTO_KEYS = "database.support.autokeys";
	public static final String DATABASE_SUPPORT_SUBQUERIES = "database.support.subqueries";
	public static final String C3P0_EXTRA_PARAMS = "c3p0.extra.params";

	private ConfigKeys() {}
}
