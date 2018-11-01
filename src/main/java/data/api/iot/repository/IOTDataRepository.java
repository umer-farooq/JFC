package data.api.iot.repository;

import java.util.List;
import java.util.Map;
import data.api.entities.Rule;

public interface IOTDataRepository {
	
	List<Rule> getIOTData() throws Exception;
	
	List<Rule> getRules(String ruleGroupName) throws Exception;
	
	Rule getRule(String ruleGroupName,String ruleName) throws Exception;
	
	boolean evaluateRule(String ruleGroupName,String ruleName,Map<String,String> inputMap);

}
