package com.madhulika.mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.WriteConcern;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.DBCursor;

import com.mongodb.ServerAddress;
import java.util.Arrays;

public class MongoConnector {

   public static void main( String args[] ) {
	MongoDatabase db = null;
      try{
		
         // To connect to mongodb server
         MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
         db=mongoClient.getDatabase("mondb");
         // Now connect to your databases
               
         System.out.println("Connect to database successfully");
         MongoCollection col=db.getCollection("Demo1");
         System.out.println("Collection created successfully");

         
			
      }catch(Exception e){
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      }
   }
}