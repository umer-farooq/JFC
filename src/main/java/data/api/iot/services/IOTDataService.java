package data.api.iot.services;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import data.api.iot.model.Rule;

@Service
public class IOTDataService {
   
	private List<Rule> rules;
	
	public IOTDataService() {
		this.rules = new ArrayList<Rule>();
		rules.add(new Rule(1,"testRuleGroupName1","testRuleName1","RULE","Lorem","ENCODE_TAG_TEMP * 40 > 1000",null,"Umer",new Date(),"Umer",new Date(),"N",new Date()));
		rules.add(new Rule(2,"testRuleGroupName1","testRuleName2","RULE","Lorem","ENCODE_TAG_TEMP * 40 > 1000",null,"Umer",new Date(),"Umer",new Date(),"N",new Date()));
		rules.add(new Rule(3,"testRuleGroupName2","testRuleName3","RULE","Lorem","ENCODE_TAG_TEMP * 40 > 1000",null,"Umer",new Date(),"Umer",new Date(),"N",new Date()));
	}
	
	public List<Rule> getIOTData(){
		return this.rules;
	}
	
	public List<Rule> getRules(String ruleGroupName) {
		return this.rules.stream().filter(x -> x.getRuleGroupName().equalsIgnoreCase(ruleGroupName)).collect(Collectors.toList());
	}
	
	public Rule getRule(String ruleGroupName,String ruleName) {
		return this.rules.stream().filter(x -> x.getRuleGroupName().equalsIgnoreCase(ruleGroupName) && x.getRuleName().equalsIgnoreCase(ruleName)).findFirst().get();
	}
	
	public boolean evaluateRule(String ruleGroupName,String ruleName,Map<String,String> inputMap) {
		//to be implemented
		return true;
	}
}
