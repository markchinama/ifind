package com.IFind.Entity;

public class WorkflowNode extends BasicEntity {

	private int nodeId;
	private int workflowId;
	private int sequenceNum;
	private int recipientType;
	private int isDataLimited;
	private int approvalType;
	private String nodeName;
	private String Description;
	private int canDeliver;
	private int canAutoPass;
	private int canNoApprover;
	private int canAddApprover;
	private int createdBy;

	public int getNodeId() {
		return nodeId;
	}

	public void setNodeId(int nodeId) {
		this.nodeId = nodeId;
	}

	public int getWorkflowId() {
		return workflowId;
	}

	public void setWorkflowId(int workflowId) {
		this.workflowId = workflowId;
	}

	public int getSequenceNum() {
		return sequenceNum;
	}

	public void setSequenceNum(int sequenceNum) {
		this.sequenceNum = sequenceNum;
	}

	public int getRecipientType() {
		return recipientType;
	}

	public void setRecipientType(int recipientType) {
		this.recipientType = recipientType;
	}

	public int getIsDataLimited() {
		return isDataLimited;
	}

	public void setIsDataLimited(int isDataLimited) {
		this.isDataLimited = isDataLimited;
	}

	public int getApprovalType() {
		return approvalType;
	}

	public void setApprovalType(int approvalType) {
		this.approvalType = approvalType;
	}

	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public int getCanDeliver() {
		return canDeliver;
	}

	public void setCanDeliver(int canDeliver) {
		this.canDeliver = canDeliver;
	}

	public int getCanAutoPass() {
		return canAutoPass;
	}

	public void setCanAutoPass(int canAutoPass) {
		this.canAutoPass = canAutoPass;
	}

	public int getCanNoApprover() {
		return canNoApprover;
	}

	public void setCanNoApprover(int canNoApprover) {
		this.canNoApprover = canNoApprover;
	}

	public int getCanAddApprover() {
		return canAddApprover;
	}

	public void setCanAddApprover(int canAddApprover) {
		this.canAddApprover = canAddApprover;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
}
