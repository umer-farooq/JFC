package data.api.rules.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import data.api.rules.entities.Rule;
import data.api.rules.respository.RulesDataRepository;;


@Service
public class RulesDataServiceImpl implements RulesDataService{
   
	@Autowired
	private RulesDataRepository iotDataRepository;
	
	
	public List<Rule> getRules(String ruleGroupName) {
		List<Rule> rules = new ArrayList<Rule>();
		try {
			rules = iotDataRepository.getRules(ruleGroupName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rules;
		
	}
	
	public Rule getRule(String ruleGroupName,String ruleName) {
		Rule rule = new Rule();
		try {
			rule = iotDataRepository.getRule(ruleGroupName,ruleName);
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
