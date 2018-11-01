package data.api.rules.services;

import java.util.List;
import java.util.Map;

import data.api.rules.entities.Rule;

public interface RulesDataService {
	
	List<Rule> getRules(String ruleGroupName);
	public Rule getRule(String ruleGroupName,String ruleName);
	boolean evaluateRule(String ruleGroupName,String ruleName,Map<String,String> inputMap);
}
