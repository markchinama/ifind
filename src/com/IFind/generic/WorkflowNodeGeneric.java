package com.IFind.generic;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.IFind.Entity.WorkflowNode;
import com.IFind.Entity.dao.WorkflowNodeDao;
import com.IFind.db.DbUtils;
import com.IFind.db.SqlStore;
import com.IFind.exception.DatabaseException;
import com.IFind.workflow.WorkflowContext;

public class WorkflowNodeGeneric implements WorkflowNodeDao {

	public WorkflowNode selectByIdSeqNum(int workflowId, int seqNum) {

		PreparedStatement p = null;
		ResultSet rs = null;
		try {
			p = WorkflowContext.getConnection().prepareStatement(
					SqlStore.getSql("WorkFlowNode.selectByIdSeqNum"));
			p.setLong(1, workflowId);

			rs = p.executeQuery();
			WorkflowNode wfn = new WorkflowNode();
			if (rs.next()) {
				wfn = this.getWorkflowNode(rs);
			}

			return wfn;

		} catch (SQLException e) {
			throw new DatabaseException(e.getMessage());
		} finally {
			DbUtils.close(rs, p);
		}
	}

	public WorkflowNode selectById(int nodeId) {
		PreparedStatement p = null;
		ResultSet rs = null;
		try {
			p = WorkflowContext.getConnection().prepareStatement(
					SqlStore.getSql("WorkFlowNode.selectById"));
			p.setLong(1, nodeId);

			rs = p.executeQuery();
			WorkflowNode wfn = new WorkflowNode();
			if (rs.next()) {
				wfn = this.getWorkflowNode(rs);
			}

			return wfn;

		} catch (SQLException e) {
			throw new DatabaseException(e.getMessage());
		} finally {
			DbUtils.close(rs, p);
		}
	}

	protected WorkflowNode getWorkflowNode(ResultSet rs) throws SQLException {
		WorkflowNode wfn = new WorkflowNode();

		wfn.setWorkflowId(rs.getInt("WORKFLOW_ID"));
		wfn.setNodeId(rs.getInt("NODE_ID"));
		wfn.setSequenceNum(rs.getInt("SEQUENCE_NUM"));
		wfn.setRecipientType(rs.getInt("RECIPIENT_TYPE"));
		wfn.setIsDataLimited(rs.getInt("IS_DATE_LIMITED"));
		wfn.setApprovalType(rs.getInt("APPROVAL_TYPE"));
		wfn.setNodeName(rs.getString("NODE_NAME"));
		wfn.setDescription(rs.getString("DESCRIPTION"));
		wfn.setCanDeliver(rs.getInt("CAN_DELIVER_TO"));
		wfn.setCanAutoPass(rs.getInt("CAN_AUTO_PASS"));
		wfn.setCanNoApprover(rs.getInt("CAN_NO_APPROVER"));
		wfn.setCanAddApprover(rs.getInt("CAN_ADD_APPROVER"));
		wfn.setCreatedBy(rs.getInt("CREATED_BY"));
		wfn.setCreatedDate(rs.getString("CREATION_DATE"));
		return wfn;
	}

	public void insertWorkflowNode(WorkflowNode wfn) {
		PreparedStatement p = null;
		try {
			p = WorkflowContext.getConnection().prepareStatement(
					SqlStore.getSql("WorkFlowNode.insert"));
			p.setInt(1, wfn.getWorkflowId());
			p.setInt(2, wfn.getSequenceNum());
			p.setInt(3, wfn.getRecipientType());
			p.setInt(4, wfn.getIsDataLimited());
			p.setString(5, wfn.getNodeName());
			p.setString(6, wfn.getDescription());
			p.setInt(7, wfn.getCanDeliver());
			p.setInt(8, wfn.getCanAutoPass());
			p.setInt(9, wfn.getCanNoApprover());
			p.setInt(10, wfn.getCanAddApprover());
			p.setInt(11, wfn.getCreatedBy());
			p.setString(12, wfn.getCreatedDate());
			p.execute();
		} catch (SQLException e) {
			throw new DatabaseException(e.getMessage());
		} finally {
			DbUtils.close(p);
		}

	}
}
