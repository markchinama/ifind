package com.IFind.generic;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.IFind.Entity.WorkflowInstance;
import com.IFind.Entity.WorkflowNode;
import com.IFind.Entity.dao.WorkflowInstanceDao;
import com.IFind.db.DbUtils;
import com.IFind.db.SqlStore;
import com.IFind.exception.DatabaseException;
import com.IFind.workflow.WorkflowContext;

public class WorkflowInstanceGeneric implements WorkflowInstanceDao {

	public void deleteWorkflowInstance(int instanceid) {
		PreparedStatement p = null;
		try {
			p = WorkflowContext.getConnection().prepareStatement(
					SqlStore.getSql("WorkflowInstance.delete"));
			p.setInt(1, instanceid);
			p.execute();
		} catch (SQLException e) {
			throw new DatabaseException(e.getMessage());
		} finally {
			DbUtils.close(p);
		}
	}

	public void insertWorkflowInstance(WorkflowInstance workflowinstance) {
		PreparedStatement p = null;
		try {
			p = WorkflowContext.getConnection().prepareStatement(
					SqlStore.getSql("WorkflowInstance.insert"));
			p.setInt(1, workflowinstance.getWorkflowId());
			p.setInt(2, workflowinstance.getStatus());
			p.setInt(3, workflowinstance.getCurrentNode());
			p.setString(4, workflowinstance.getReason());
			p.setInt(5, workflowinstance.getCurrentHandler());
			p.setString(6, workflowinstance.getStatusDesc());
			p.setInt(7, workflowinstance.getApproveCount());
			p.setInt(8, workflowinstance.getAttachmentId());
			p.setInt(9, workflowinstance.getCreatedBy());
			p.setString(10, workflowinstance.getCreatedDate());
			p.execute();
		} catch (SQLException e) {
			throw new DatabaseException(e.getMessage());
		} finally {
			DbUtils.close(p);
		}

	}

	public WorkflowInstance selectById(int instanceid) {
		PreparedStatement p = null;
		ResultSet rs = null;
		try {
			p = WorkflowContext.getConnection().prepareStatement(
					SqlStore.getSql("WorkFlowInstance.selectById"));
			p.setInt(1, instanceid);

			rs = p.executeQuery();
			WorkflowInstance wfi = new WorkflowInstance();
			if (rs.next()) {
				wfi = this.getWorkflowInstance(rs);
			}

			return wfi;

		} catch (SQLException e) {
			throw new DatabaseException(e.getMessage());
		} finally {
			DbUtils.close(rs, p);
		}
	}

	public void updateWorkflowInstance(int instanceid,
			WorkflowInstance workflowinstance) {
		PreparedStatement p = null;
		try {
			p = WorkflowContext.getConnection().prepareStatement(
					SqlStore.getSql("WorkflowInstance.update"));
			p.setInt(1, workflowinstance.getWorkflowId());
			p.setInt(2, workflowinstance.getStatus());
			p.setInt(3, workflowinstance.getCurrentNode());
			p.setString(4, workflowinstance.getReason());
			p.setInt(5, workflowinstance.getCurrentHandler());
			p.setString(6, workflowinstance.getStatusDesc());
			p.setInt(7, workflowinstance.getApproveCount());
			p.setInt(8, workflowinstance.getAttachmentId());
			p.setInt(9, workflowinstance.getInstanceId());
			p.execute();
		} catch (SQLException e) {
			throw new DatabaseException(e.getMessage());
		} finally {
			DbUtils.close(p);
		}

	}

	public WorkflowInstance getWorkflowInstance(ResultSet rs)
			throws SQLException {

		WorkflowInstance wi = new WorkflowInstance();

		wi.setId(rs.getInt("INSTANCE_ID"));
		wi.setWorkflowId(rs.getInt("WORKFLOW_ID"));
		wi.setStatus(rs.getInt("STATUS"));
		wi.setCurrentNode(rs.getInt("CURRENT_NODE"));
		wi.setReason(rs.getString("REASON"));
		wi.setCurrentHandler(rs.getInt("CURRENT_HANDLER"));
		wi.setStatusDesc(rs.getString("STATUS_DESC"));
		wi.setApproveCount(rs.getInt("APPROVE_COUNT"));
		wi.setAttachmentId(rs.getInt("ATTACHMENT_ID"));
		wi.setCreatedBy(rs.getInt("CREATED_BY"));
		wi.setCreatedDate(rs.getString("CREATION_DATE"));

		return wi;

	}
}
