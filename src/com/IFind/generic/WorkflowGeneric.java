package com.IFind.generic;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.IFind.Entity.Workflow;
import com.IFind.Entity.dao.WorkflowDao;
import com.IFind.db.DbUtils;
import com.IFind.db.SqlStore;
import com.IFind.exception.DatabaseException;
import com.IFind.workflow.WorkflowContext;

public class WorkflowGeneric implements WorkflowDao {

	public Workflow selectById(int workflowId) {

		PreparedStatement p = null;
		ResultSet rs = null;
		try {
			p = WorkflowContext.getConnection().prepareStatement(
					SqlStore.getSql("WorkFlow.selectById"));
			p.setLong(1, workflowId);

			rs = p.executeQuery();
			Workflow wf = new Workflow();
			if (rs.next()) {
				wf = this.getWorkflow(rs);
			}

			return wf;

		} catch (SQLException e) {
			throw new DatabaseException(e.getMessage());
		} finally {
			DbUtils.close(rs, p);
		}
	}

	protected Workflow getWorkflow(ResultSet rs) throws SQLException {
		Workflow w = new Workflow();

		w.setWorkflowId(rs.getInt("WORKFLOW_ID"));
		w.setWorkflowCode(rs.getString("WORKFLOW_CODE"));
		w.setWorlflowName(rs.getString("WORKFLOW_NAME"));
		w.setDescription(rs.getString("DESCRIPTION"));
		w.setCanCancel(rs.getInt("CAN_CANCEL"));
		w.setCreateBy(rs.getInt("CREATED_BY"));
		w.setCreatedDate(rs.getString("CREATED_DATE"));

		return w;
	}

	public void insertWorkflow(Workflow workflow) {
		PreparedStatement p = null;
		try {
			p = WorkflowContext.getConnection().prepareStatement(
					SqlStore.getSql("WorkFlow.insert"));
			p.setString(1, workflow.getWorkflowCode());
			p.setString(2, workflow.getWorlflowName());
			p.setString(3, workflow.getDescription());
			p.setInt(4, workflow.getCanCancel());
			p.setInt(5, workflow.getCreateBy());
			p.setString(6, workflow.getCreatedDate());
			p.execute();
		} catch (SQLException e) {
			throw new DatabaseException(e.getMessage());
		} finally {
			DbUtils.close(p);
		}
		
	}
}
