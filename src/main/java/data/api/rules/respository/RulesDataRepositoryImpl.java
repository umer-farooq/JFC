package data.api.rules.respository;

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

import data.api.rules.entities.Rule;
import data.api.rules.services.RulesDataService;
import data.mongo.reader.MongoDBReader;

@Repository
public class RulesDataRepositoryImpl implements RulesDataRepository{


	@Autowired
	private MongoProperties configuration;
	MongoDBReader mongoDBReader = new MongoDBReader();
	private static final Logger IOTDataDAOLogger = LogManager.getLogger(RulesDataRepositoryImpl.class);	
	
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
