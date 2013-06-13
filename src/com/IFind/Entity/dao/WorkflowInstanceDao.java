package com.IFind.Entity.dao;

import com.IFind.Entity.WorkflowInstance;

public interface WorkflowInstanceDao {
	public WorkflowInstance selectById(int instanceid);

	public void insertWorkflowInstance(WorkflowInstance workflowinstance);

	public void deleteWorkflowInstance(int instanceid);

	public void updateWorkflowInstance(int instanceid,
			WorkflowInstance workflowinstance);
}
