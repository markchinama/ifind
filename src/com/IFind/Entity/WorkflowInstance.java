package com.IFind.Entity;

public class WorkflowInstance extends BasicEntity {
	private int instanceid;
	private int workflowId;
	private int status;
	private int currentNode;
	private String reason;
	private int currentHandler;
	private String statusDesc;
	private int approveCount;
	private int attachmentId;
	private int createdBy;
	public int getInstanceId() {
		return instanceid;
	}
	public void setId(int instanceid) {
		this.instanceid = instanceid;
	}
	public int getWorkflowId() {
		return workflowId;
	}
	public void setWorkflowId(int workflowId) {
		this.workflowId = workflowId;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getCurrentNode() {
		return currentNode;
	}
	public void setCurrentNode(int currentNode) {
		this.currentNode = currentNode;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public int getCurrentHandler() {
		return currentHandler;
	}
	public void setCurrentHandler(int currentHandler) {
		this.currentHandler = currentHandler;
	}
	public String getStatusDesc() {
		return statusDesc;
	}
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}
	public int getApproveCount() {
		return approveCount;
	}
	public void setApproveCount(int approveCount) {
		this.approveCount = approveCount;
	}
	public int getAttachmentId() {
		return attachmentId;
	}
	public void setAttachmentId(int attachmentId) {
		this.attachmentId = attachmentId;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	}
