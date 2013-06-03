package com.IFind.Entity.dao;

import com.IFind.Entity.WorkflowNode;

public interface WorkflowNodeDao {
	public WorkflowNode selectByIdSeqNum(int  workflowId,int  seqNum);
	public WorkflowNode selectById(int  nodeId);
	public void insertWorkflowNode(WorkflowNode wn);
}
