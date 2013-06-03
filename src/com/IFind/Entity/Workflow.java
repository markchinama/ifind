package com.IFind.Entity;

public class Workflow extends BasicEntity {
	private int workflowId;
	private String workflowCode;
	public String getWorkflowCode() {
		return workflowCode;
	}

	public void setWorkflowCode(String workflowCode) {
		this.workflowCode = workflowCode;
	}

	public String getWorlflowName() {
		return worlflowName;
	}

	public void setWorlflowName(String worlflowName) {
		this.worlflowName = worlflowName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCanCancel() {
		return canCancel;
	}

	public void setCanCancel(int canCancel) {
		this.canCancel = canCancel;
	}

	public int getCreateBy() {
		return createBy;
	}

	public void setCreateBy(int createBy) {
		this.createBy = createBy;
	}

	

	private String worlflowName;
	private String description;
	private int canCancel;
	private int createBy;
	private String createDate;

	public int getWorkflowId() {
		return workflowId;
	}

	public void setWorkflowId(int workflowId) {
		this.workflowId = workflowId;
	}

}
