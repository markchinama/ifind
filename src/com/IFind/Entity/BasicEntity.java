package com.IFind.Entity;

import java.text.SimpleDateFormat;
import java.util.Map;

import com.IFind.api.Sys;

public class BasicEntity {
	private String created_date;

	public String getCreated_date() {
		return created_date;
	}

	public void setCreated_date(String createdDate) {

		this.created_date = Sys.getNowDate();
	}

	public BasicEntity() {

	}

}
