package data.api.iot.repository;

import java.util.List;
import java.util.Map;
import data.api.entities.Rule;

public interface IOTDataDAO {
	
	List<Rule> getIOTData();
	
	List<Rule> getRules(String ruleGroupName);
	
	Rule getRule(String ruleGroupName,String ruleName);
	
	boolean evaluateRule(String ruleGroupName,String ruleName,Map<String,String> inputMap);

}
