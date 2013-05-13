package com.IFind.mongodb;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;

public class Test {

	/**
	 * @param args
	 * @throws UnknownHostException
	 */
	public static String a = "aaaaaaaaaaaaaaaaaaaaaaaaa";
	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		Mongo mongo = new Mongo("localhost", 27017);
		DB db = mongo.getDB("IFind");
		DBCollection collection = db.getCollection("user");
		BasicDBObject document = new BasicDBObject();
		document.put("hosting", "hostA1");
		document.put("type", "vps1");
		document.put("clients", 10001);
		collection.insert(document);
		DBCursor cursor = collection.find();
		while (cursor.hasNext()) {
			System.out.println(cursor.next());
		} 
	}
}
