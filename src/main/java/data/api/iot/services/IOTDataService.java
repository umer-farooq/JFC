package data.api.iot.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.stereotype.Service;
import data.api.entities.Rule;
import data.mongo.reader.MongoDBReader;

@Service
public class IOTDataService {
   
	private List<Rule> rules;
	
	
	@Autowired
	private MongoProperties configuration;
	MongoDBReader mongoDBReader = new MongoDBReader();
	private static final Logger IOTDataServiceLogger = LogManager.getLogger(IOTDataService.class);
	
	public IOTDataService() {
		
	}
	
	public List<Rule> getIOTData(){
		List<Rule> rules = new ArrayList<Rule>();
		try {
			mongoDBReader.prepareConnection(configuration.getUri(),configuration.getDatabase(),configuration.getUsername(), configuration.getPassword().toString(),IOTDataServiceLogger);
			rules = mongoDBReader.getIOTData();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rules;
		
	}
	
	public List<Rule> getRules(String ruleGroupName) {
		List<Rule> rules = new ArrayList<Rule>();
		try {
			mongoDBReader.prepareConnection(configuration.getUri(),configuration.getDatabase(),configuration.getUsername(), configuration.getPassword().toString(),IOTDataServiceLogger);
			rules = mongoDBReader.getRules(ruleGroupName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rules;
		
	}
	
	public Rule getRule(String ruleGroupName,String ruleName) {
		Rule rule = new Rule();
		try {
			mongoDBReader.prepareConnection(configuration.getUri(),configuration.getDatabase(),configuration.getUsername(), configuration.getPassword().toString(),IOTDataServiceLogger);
            rule = mongoDBReader.getRule(ruleGroupName,ruleName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rule;	
	}
	
	public boolean evaluateRule(String ruleGroupName,String ruleName,Map<String,String> inputMap) {
		//to be implemented
		return true;
	}
}
