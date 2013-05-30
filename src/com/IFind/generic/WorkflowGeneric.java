package com.IFind.generic;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.IFind.Entity.Workflow;
import com.IFind.Entity.dao.WorkflowDao;
import com.IFind.db.PreparedStatmentBuilder;
import com.IFind.db.ResultMapper;
import com.IFind.workflow.WorkFlowContext;

public class WorkflowGeneric implements WorkflowDao {

	@Override
	public Workflow selectById(final Long workflowId) {

		final Workflow resultWorkflow = new Workflow();

		PreparedStatmentBuilder psBuilder = new PreparedStatmentBuilder() {
			@Override
			public PreparedStatement buildPreparedStatment(PreparedStatement ps)
					throws SQLException {
				ps.setLong(0, workflowId.longValue());
				return ps;
			}
		};

		ResultMapper mapper = new ResultMapper() {
			@Override
			public void processResultSet(ResultSet rs) throws SQLException {
				resultWorkflow.setWorkflowId(rs.getLong(0));
			}
		};

		WorkFlowContext.executeSql(psBuilder, mapper);
		return resultWorkflow;
	}

}
