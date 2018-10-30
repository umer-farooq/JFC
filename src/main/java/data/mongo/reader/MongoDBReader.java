package data.mongo.reader;

import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.Logger;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.Query;

import com.mongodb.MongoCredential;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;


public class MongoDBReader {
	
	private MongoClient mongoClient;
	private Datastore mongoDatastore;
	private Morphia morphia;

	public synchronized void prepareConnection (String uri, String dbname, String username, String password, Logger logger) throws Exception
	{
		if (mongoClient == null)
		{
			try
			{
				logger.info( "Creating new connection to mongodb using URI: " + uri + " and database " + dbname);
				MongoClientURI mongoUri = new MongoClientURI(uri);
				mongoClient = new MongoClient(mongoUri);  
		      	// Creating Credentials 
				if (username != null && !username.isEmpty())
				{
					MongoCredential credential; 
					credential = MongoCredential.createCredential(username, dbname, password.toCharArray());
				}

				morphia = new Morphia();
				morphia.mapPackage("data.api.entities");
				mongoDatastore = morphia.createDatastore(mongoClient, dbname) ;
				logger.info( "Connected successfully mongodb...");
			}
			catch (Exception e)
			{
				logger.error("Failed to connect to mongodb...", e);
				throw e;
			}
		}
		else
			logger.info("Connection already exist");
	}
	
	public void getData(String id, Logger logger)
	{
		
		
	}

}
