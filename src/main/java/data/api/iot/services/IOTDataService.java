package data.api.iot.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import data.api.entities.Rule;
import data.mongo.reader.MongoDBReader;

@Service
public class IOTDataService {
   
	private List<Rule> rules;
	
	private static final Logger IOTDataServiceLogger = LogManager.getLogger(IOTDataService.class);
	
	public IOTDataService() {
		this.rules = new ArrayList<Rule>();
		//rules.add(new Rule(new ObjectId("569ed8269353e9f4c51617aa"),"testRuleGroupName1","testRuleName1","RULE","Lorem","ENCODE_TAG_TEMP * 40 > 1000",null,"Umer",new Date(),"Umer",new Date(),"N",new Date()));
		//rules.add(new Rule(new ObjectId("569ed8269353e9f4c51617ab"),"testRuleGroupName1","testRuleName2","RULE","Lorem","ENCODE_TAG_TEMP * 40 > 1000",null,"Umer",new Date(),"Umer",new Date(),"N",new Date()));
		//rules.add(new Rule(new ObjectId("569ed8269353e9f4c51617ac"),"testRuleGroupName2","testRuleName3","RULE","Lorem","ENCODE_TAG_TEMP * 40 > 1000",null,"Umer",new Date(),"Umer",new Date(),"N",new Date()));
	}
	
	public List<Rule> getIOTData(){
		MongoDBReader mongoDBReader = new MongoDBReader();
		List<Rule> rules = new ArrayList<Rule>();
		try {
			mongoDBReader.prepareConnection("mongodb://localhost:27017", "rulesengine", "test", "test",IOTDataServiceLogger);
			rules = mongoDBReader.getIOTData();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rules;
		
	}
	
	public List<Rule> getRules(String ruleGroupName) {
		MongoDBReader mongoDBReader = new MongoDBReader();
		List<Rule> rules = new ArrayList<Rule>();
		try {
			mongoDBReader.prepareConnection("mongodb://localhost:27017", "rulesengine", "test", "test",IOTDataServiceLogger);
			rules = mongoDBReader.getRules(ruleGroupName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rules;
		
		
		//return this.rules.stream().filter(x -> x.getRuleGroupName().equalsIgnoreCase(ruleGroupName)).collect(Collectors.toList());
	}
	
	public Rule getRule(String ruleGroupName,String ruleName) {
		MongoDBReader mongoDBReader = new MongoDBReader();
		Rule rule = new Rule();
		try {
			mongoDBReader.prepareConnection("mongodb://localhost:27017", "rulesengine", "test", "test",IOTDataServiceLogger);
			rule = mongoDBReader.getRule(ruleGroupName,ruleName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rule;
		
		//return this.rules.stream().filter(x -> x.getRuleGroupName().equalsIgnoreCase(ruleGroupName) && x.getRuleName().equalsIgnoreCase(ruleName)).findFirst().get();
	}
	
	public boolean evaluateRule(String ruleGroupName,String ruleName,Map<String,String> inputMap) {
		//to be implemented
		return true;
	}
}
