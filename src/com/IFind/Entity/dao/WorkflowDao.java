package com.IFind.Entity.dao;

import com.IFind.Entity.Workflow;

public interface WorkflowDao {
	public Workflow selectById(int workflowId);
	public void insertWorkflow(Workflow workflow);
}
