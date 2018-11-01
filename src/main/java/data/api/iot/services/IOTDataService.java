package data.api.iot.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import data.api.entities.Rule;
import data.api.iot.repository.IOTDataRepository;;


@Service
public class IOTDataService {
   
	@Autowired
	private IOTDataRepository iotDataRepository;
	
	
	public IOTDataService() {
		
	}
	
	public List<Rule> getIOTData(){
		List<Rule> rules = new ArrayList<Rule>();
		try {
			rules = iotDataRepository.getIOTData();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rules;
		
	}
	
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
