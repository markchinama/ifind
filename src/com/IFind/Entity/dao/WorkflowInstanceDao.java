package com.IFind.Entity.dao;

import com.IFind.Entity.WorkflowInstance;

public interface WorkflowInstanceDao {
	public WorkflowInstance selectById(int instanceid);

	public void insertWorkflowInstance(WorkflowInstance workflowinstance);

	public void deleteWorkflowInstance(WorkflowInstance workflowinstance);

	public void updateWorkflowInstance(int instanceid,
			WorkflowInstance workflowinstance);
}
