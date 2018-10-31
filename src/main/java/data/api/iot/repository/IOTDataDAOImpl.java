package data.api.iot.repository;

import java.util.List;
import java.util.Map;

import org.mongodb.morphia.DAO;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.dao.BasicDAO;
import org.mongodb.morphia.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import data.api.entities.Rule;

@Repository
public class IOTDataDAOImpl implements IOTDataDAO{


	/*
	 @Autowired
	 private Datastore ds;
    */
	
	   public List<Rule> getIOTData() {
	      //return ds.find(Rule.class).asList();
		   return null;
	   }

	   public List<Rule> getRules(String ruleGroupName) {
		  /*
		  Query<Rule> query = ds.createQuery(Rule.class);
		  query.criteria("RULE_KPI_GROUPNAME").equalIgnoreCase(ruleGroupName);
	      return query.order("RULE_KPI_GROUPNAME").asList();
	      */
		   return null;
	   }
	   
	   public Rule getRule(String ruleGroupName,String ruleName) {
		   /*
		   Query<Rule> query = ds.createQuery(Rule.class);
		   query.and(query.criteria("RULE_KPI_GROUPNAME").equalIgnoreCase(ruleGroupName),
				     query.criteria("RULE_KPI_NAME").equalIgnoreCase(ruleName)); 

		   return query.get();
		   */
		   return null;
	   }
	   
	   public boolean evaluateRule(String ruleGroupName,String ruleName,Map<String,String> inputMap) {
			//to be implemented
			return true;
		}

}
