package com.IFind.generic;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.IFind.Entity.Workflow;
import com.IFind.Entity.dao.WorkflowDao;
import com.IFind.db.DbUtils;
import com.IFind.exception.DatabaseException;
import com.IFind.workflow.WorkFlowContext;

public class WorkflowGeneric implements WorkflowDao {

	public Workflow selectById(Long workflowId) {
		
		PreparedStatement p = null;
		ResultSet rs = null;
		try {
			p = WorkFlowContext.getConnection()
					.prepareStatement(SystemGlobals.getSql("WorkFlow.selectById"));
			p.setLong(1, workflowId);

			rs = p.executeQuery();
			Workflow wf = new Workflow();
			if (rs.next()) {
				wf = this.getWorkflow(rs);
			}

			return wf;

		}
		catch (SQLException e) {
			throw new DatabaseException(e.getMessage());
		}
		finally {
			DbUtils.close(rs, p);
		}
	}
	protected Workflow getWorkflow(ResultSet rs) throws SQLException
	{
		Workflow w = new Workflow();

		w.setWorkflowId(rs.getLong("workflowid"));
		

		return w;
	}
}
