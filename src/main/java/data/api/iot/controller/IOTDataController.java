package data.api.iot.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import data.api.entities.Rule;
import data.api.iot.services.IOTDataService;

@RestController
public class IOTDataController {

	
	@Autowired
	private IOTDataService iotDataService;
	
	//change return type according to actual object
	@RequestMapping(value="/getIOTData", method = RequestMethod.POST)
	public void getIOTData()
	{
		//parse params and call MongoDBReader.getData to get the records and return data
		
		iotDataService.getIOTData();
	}
	
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
