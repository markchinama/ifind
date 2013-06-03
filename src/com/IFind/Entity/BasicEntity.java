package com.IFind.Entity;

import com.IFind.api.Sys;

public class BasicEntity {
	private String createdDate;

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {

		if (null == createdDate)
			this.createdDate = Sys.getNowDate();
		else
			this.createdDate = createdDate;
	}

	public BasicEntity() {

	}

}
