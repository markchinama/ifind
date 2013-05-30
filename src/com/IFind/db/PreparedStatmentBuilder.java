package com.IFind.db;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface PreparedStatmentBuilder {
	public PreparedStatement buildPreparedStatment(PreparedStatement ps) throws SQLException;
}
