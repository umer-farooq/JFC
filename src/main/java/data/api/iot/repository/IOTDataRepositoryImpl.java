package data.api.iot.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mongodb.morphia.DAO;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.dao.BasicDAO;
import org.mongodb.morphia.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import data.api.entities.Rule;
import data.api.iot.services.IOTDataService;
import data.mongo.reader.MongoDBReader;

@Repository
public class IOTDataRepositoryImpl implements IOTDataRepository{


	@Autowired
	private MongoProperties configuration;
	MongoDBReader mongoDBReader = new MongoDBReader();
	private static final Logger IOTDataDAOLogger = LogManager.getLogger(IOTDataRepositoryImpl.class);	
	
	   public List<Rule> getIOTData() throws Exception {
		   List<Rule> rules = new ArrayList<Rule>();
		   mongoDBReader.prepareConnection(configuration.getUri(),configuration.getDatabase(),configuration.getUsername(), configuration.getPassword().toString(),IOTDataDAOLogger);
		   rules = mongoDBReader.getIOTData();
		   return rules;
	   }

	   public List<Rule> getRules(String ruleGroupName) throws Exception {
		   List<Rule> rules = new ArrayList<Rule>();
		   mongoDBReader.prepareConnection(configuration.getUri(),configuration.getDatabase(),configuration.getUsername(), configuration.getPassword().toString(),IOTDataDAOLogger);
		   rules = mongoDBReader.getRules(ruleGroupName);
		   return rules;	
	   }
	   
	   public Rule getRule(String ruleGroupName,String ruleName) throws Exception {
		   Rule rule = new Rule();
		   mongoDBReader.prepareConnection(configuration.getUri(),configuration.getDatabase(),configuration.getUsername(), configuration.getPassword().toString(),IOTDataDAOLogger);
	       rule = mongoDBReader.getRule(ruleGroupName,ruleName);
		   return rule;	
	   }
	   
	   public boolean evaluateRule(String ruleGroupName,String ruleName,Map<String,String> inputMap) {
			//to be implemented
			return true;
		}

}
