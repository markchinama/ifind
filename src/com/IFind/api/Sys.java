package com.IFind.api;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Sys {
	public static String getService(StringBuffer url) {
		int ifparameter = url.lastIndexOf("?");
		int endIndex = -1 == ifparameter ? url.length() : ifparameter;
		return url.substring(url.lastIndexOf("/") + 1, endIndex);

	}

	public static String getNowDate() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return df.format(new Date());
	}
}
