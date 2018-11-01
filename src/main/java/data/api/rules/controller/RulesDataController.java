package data.api.rules.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import data.api.rules.entities.Rule;
import data.api.rules.services.RulesDataService;

@RestController
@RequestMapping(value="/JFC2/Rules")
public class RulesDataController {

	@Autowired
	private RulesDataService iotDataService;
	
	@RequestMapping(value="/getRules/{ruleGrpName}")
	public List<Rule> getRules(@PathVariable String ruleGrpName)
	{
		return iotDataService.getRules(ruleGrpName);
	}
	
	@RequestMapping(value="/getRule/{ruleGrpName}/{ruleName}")
	public Rule getRule(@PathVariable String ruleGrpName,@PathVariable String ruleName)
	{
		return iotDataService.getRule(ruleGrpName,ruleName);	
	}
	
	@RequestMapping(value="/evaluateRule/{ruleGrpName}/{ruleName}/{inputMap}")
	public boolean evaluateRule(@PathVariable String ruleGrpName,@PathVariable String ruleName,@PathVariable Map<String,String> inputMap)
	{
		return iotDataService.evaluateRule(ruleGrpName,ruleName,inputMap);	
	}
	
}
