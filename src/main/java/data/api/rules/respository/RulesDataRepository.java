package data.api.rules.respository;

import java.util.List;
import java.util.Map;

import data.api.rules.entities.Rule;

public interface RulesDataRepository {
	
	List<Rule> getRules(String ruleGroupName) throws Exception;
	
	Rule getRule(String ruleGroupName,String ruleName) throws Exception;
	
	boolean evaluateRule(String ruleGroupName,String ruleName,Map<String,String> inputMap);

}
