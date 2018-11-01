package data.api.rules.entities;

import java.util.List;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

@Entity(value="rules")
public class Rule {
	
	@Id
	private ObjectId id;
	
	@Property("RULE_KPI_GROUPNAME")
	private String ruleGroupName;
	
	@Property("RULE_KPI_NAME")
	private String ruleName;
	
	@Property("KPI_EXPRESSION")
	private String expression;

	
	@Property("MASTER_TYPE")
	private String masterType;
	
	@Property("RULE_CONDITION")
	private String ruleCondition;

	@Property("CREATEDBY")
	private String createdBy;

	
	@Property("WHENCREATED")
	private String whenCreated;
	
	
	@Property("UPDATEDBY")
	private String updatedBy;
	
	@Property("WHENUPDATED")
	private String whenUpdated;
	
	
	@Property("isDocumentDeleted")
	private String isDocumentDeleted;
	
	@Property("RULE_KPI_START_DATE")
	private String ruleStartDate;

	
	@Embedded
	private List<Actions> actions;
	

  
	public Rule() {

	}

	public Rule(ObjectId id, String ruleGroupName, String ruleName, String masterType, String expression,
			String ruleCondition, List<Actions> rulesaction, String createdBy, String whenCreated, String updatedBy,
			String whenUpdated, String isDocumentDeleted, String ruleStartDate) {
		this.id = id;
		this.ruleGroupName = ruleGroupName;
		this.ruleName = ruleName;
		this.expression = expression;
		
		
		this.masterType = masterType;
		this.ruleCondition = ruleCondition;
		
		this.createdBy = createdBy;
		
		this.whenCreated = whenCreated;
		
		
		this.updatedBy = updatedBy;
		this.whenUpdated = whenUpdated;
		
		this.isDocumentDeleted = isDocumentDeleted;
		this.ruleStartDate = ruleStartDate;
		
		this.actions = rulesaction;
		
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getRuleGroupName() {
		return ruleGroupName;
	}

	public void setRuleGroupName(String ruleGroupName) {
		this.ruleGroupName = ruleGroupName;
	}

	public String getRuleName() {
		return ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}
	
	
	public String getMasterType() {
		return masterType;
	}

	public void setMasterType(String masterType) {
		this.masterType = masterType;
	}

	public String getRuleCondition() {
		return ruleCondition;
	}

	public void setRuleCondition(String ruleCondition) {
		this.ruleCondition = ruleCondition;
	}

		
	
	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	
	public String getWhenCreated() {
		return whenCreated;
	}

	
	public void setWhenCreated(String whenCreated) {
		this.whenCreated = whenCreated;
	}

	
	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getWhenUpdated() {
		return whenUpdated;
	}

	public void setWhenUpdated(String whenUpdated) {
		this.whenUpdated = whenUpdated;
	}

	
	public String isDocumentDeleted() {
		return isDocumentDeleted;
	}

	public void setDocumentDeleted(String isDocumentDeleted) {
		this.isDocumentDeleted = isDocumentDeleted;
	}

	public String getRuleStartDate() {
		return ruleStartDate;
	}

	public void setRuleStartDate(String ruleStartDate) {
		this.ruleStartDate = ruleStartDate;
	}

	
	public List<Actions> getActions() {
		return actions;
	}

	
	public void setActions(List<Actions> actions) {
		this.actions = actions;
	}

	

}
