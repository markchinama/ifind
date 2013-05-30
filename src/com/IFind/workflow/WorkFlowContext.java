package com.IFind.workflow;

import java.sql.Connection;

import org.apache.log4j.Logger;

import com.IFind.db.C3P0PooledConnection;

public class WorkFlowContext {
	private static ThreadLocal workflowData = new ThreadLocal();
	private static Logger logger = Logger.getLogger(WorkFlowContext.class);
	private Connection conn;

	public static WorkFlowContext get() {
		WorkFlowContext ex = (WorkFlowContext) workflowData.get();

		if (ex == null) {
			ex = new WorkFlowContext();
			workflowData.set(ex);
		}

		return ex;
	}

	public static boolean exists() {
		return (workflowData.get() != null);
	}

	public static void set(WorkFlowContext ex) {
		workflowData.set(ex);
	}

	public void setConnection(Connection conn) {
		this.conn = conn;
	}

	/**
	 * Gets the current thread's connection
	 * 
	 * @return Connection
	 */
	public static Connection getConnection() {
		return getConnection(true);
	}

	public static Connection getConnection(boolean validate) {
		WorkFlowContext ex = get();
		Connection c = ex.conn;

		if (validate && c == null) {
			C3P0PooledConnection cp = new C3P0PooledConnection();
			c = cp.getConnection();
			/*
			 * try {c.setAutoCommit(!SystemGlobals.getBoolValue(ConfigKeys.
			 * DATABASE_USE_TRANSACTIONS)); } catch (Exception e) { //catch
			 * error autocommit }
			 */
			ex.setConnection(c);
			set(ex);
		}

		return c;
	}
}
