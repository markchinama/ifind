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
 * Created on 30/11/2005 17:07:51
 * The JForum Project
 * http://www.jforum.net
 */
package com.IFind.db;

import java.sql.Connection;

import com.IFind.config.ConfigKeys;
import com.IFind.config.DbConfig;
import com.IFind.exception.DatabaseException;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mchange.v2.c3p0.DataSources;

public class C3P0PooledConnection extends DBConnection
{
	private ComboPooledDataSource ds;
	
	/**
	 * 
	 * @see net.jforum.DBConnection#init()
	 */
	public void init() throws Exception
	{
		this.ds = new ComboPooledDataSource();
		System.out.println(ConfigKeys.DATABASE_CONNECTION_DRIVER);
		this.ds.setDriverClass(DbConfig.getValue(ConfigKeys.DATABASE_CONNECTION_DRIVER));
		this.ds.setJdbcUrl(DbConfig.getValue(ConfigKeys.DATABASE_CONNECTION_STRING));
		this.ds.setMinPoolSize(DbConfig.getIntValue(ConfigKeys.DATABASE_POOL_MIN));
		this.ds.setMaxPoolSize(DbConfig.getIntValue(ConfigKeys.DATABASE_POOL_MAX));
		this.ds.setUser(DbConfig.getValue(ConfigKeys.DATABASE_CONNECTION_USERNAME));
		this.ds.setPassword(DbConfig.getValue(ConfigKeys.DATABASE_CONNECTION_PASSWORD));
	}
	
	
	public Connection getConnection()
	{
		try {
			return this.ds.getConnection();
		}
		catch (Exception e) {
			throw new DatabaseException(e);
		}
	}

	/**
	 * @see net.jforum.DBConnection#releaseConnection(java.sql.Connection)
	 */
	public void releaseConnection(Connection conn)
	{
        if (conn==null) {
            return;
        }

        try {
			conn.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see net.jforum.DBConnection#realReleaseAllConnections()
	 */
	public void realReleaseAllConnections() throws Exception
	{
		DataSources.destroy(this.ds);
	}
}
