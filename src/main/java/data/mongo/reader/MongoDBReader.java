package data.mongo.reader;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.Logger;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.Query;
import org.mongodb.morphia.query.QueryResults;
import org.springframework.context.annotation.Bean;

import com.mongodb.MongoCredential;
import data.api.entities.Rule;

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
	
	public List<Rule> getIOTData() {
		List<Rule> rules = mongoDatastore.find(Rule.class).asList();
		return rules;
	}
	
	public List<Rule> getRules(String ruleGroupName) {
		  List<Rule> rules = mongoDatastore.find(Rule.class).field("RULE_KPI_GROUPNAME").equalIgnoreCase(ruleGroupName).asList();
		  return rules;
	}
	   
	public Rule getRule(String ruleGroupName,String ruleName) {
		  Rule rule = mongoDatastore.find(Rule.class).field("RULE_KPI_GROUPNAME").equalIgnoreCase(ruleGroupName).field("RULE_KPI_NAME").equalIgnoreCase(ruleName).get();
		  return rule;  
		
	}
	   
	public boolean evaluateRule(String ruleGroupName,String ruleName,Map<String,String> inputMap) {
			//to be implemented
			return true;
	}
	
}
