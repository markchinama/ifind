package com.IFind.util.junit;

import java.io.IOException;
import java.sql.Connection;

import org.junit.Test;

import com.IFind.Entity.Workflow;
import com.IFind.config.DbConfig;
import com.IFind.db.DBConnection;
import com.IFind.db.SqlStore;
import com.IFind.exception.DatabaseException;
import com.IFind.generic.WorkflowGeneric;
import com.IFind.workflow.WorkflowContext;

public class EntityTest {

	protected static void init() throws IOException {
		String dbconfigfile = "C:\\smtp\\IFind\\IFind\\WebRoot\\WEB-INF\\c3p0.properties";
		DbConfig.init(dbconfigfile);
		String sqlcofigfile = "C:\\smtp\\IFind\\IFind\\WebRoot\\WEB-INF\\sql.properties";
		SqlStore.init(sqlcofigfile);
	}

	@Test
	public void EntityTest() throws IOException {
		init();
		try {
			if (DBConnection.createInstance()) {
				DBConnection.getImplementation().init();

				Connection conn = DBConnection.getImplementation()
						.getConnection();
				System.out.println(conn.isClosed());
				WorkflowContext wc = new WorkflowContext();
				wc.setConnection(conn);
				wc.set(wc);
				Workflow wf = new Workflow();
				wf.setCreatedDate(null);
				wf.setCanCancel(1);
				wf.setWorkflowCode("123");
				wf.setWorlflowName("onetwothree");
				wf.setDescription("test");
				wf.setCreateBy(1);
				WorkflowGeneric wg = new WorkflowGeneric();
				wg.insertWorkflow(wf);
			}
		} catch (Exception e) {
			throw new DatabaseException(
					"Error while trying to start the database: " + e);
		}

	}

}
