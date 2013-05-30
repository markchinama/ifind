package com.IFind.db;

import java.sql.ResultSet;
import java.sql.SQLException; 

public interface ResultMapper {
	public void processResultSet(ResultSet rs) throws SQLException;
}
