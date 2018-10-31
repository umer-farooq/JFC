package data.api.entities;

import java.time.Instant;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;
import org.mongodb.morphia.converters.TimestampConverter;


@Entity(value="rulesengine")
public class Rule {
	
	@Id
	private ObjectId id;
	
	@Property("RULE_KPI_GROUPNAME")
	private String ruleGroupName;
	
	@Property("RULE_KPI_NAME")
	private String ruleName;
	
	@Property("KPI_EXPRESSION")
	private String expression;

	

	/*
	@Property("MASTER_TYPE")
	private String masterType;
	
	@Property("RULE_CONDITION")
	private String ruleCondition;
	
	@Embedded
	private RuleAction[] actions;
	
	
	@Property("CREATEDBY")
	private String createdBy;
	
	@Property("WHENCREATED")
	private TimestampConverter whenCreated;
	
	@Property("UPDATEDBY")
	private String updatedBy;
	
	@Property("WHENUPDATED")
	private TimestampConverter whenUpdated;
	
	@Property("isDocumentDeleted")
	private String isDocumentDeleted;
	
	@Property("RULE_KPI_START_DATE")
	private TimestampConverter ruleStartDate;

  */
	public Rule() {

	}

	public Rule(ObjectId id, String ruleGroupName, String ruleName, String masterType, String expression,
			String ruleCondition, RuleAction[] rulesaction, String createdBy, TimestampConverter whenCreated, String updatedBy,
			TimestampConverter whenUpdated, String isDocumentDeleted, TimestampConverter ruleStartDate) {
		this.id = id;
		this.ruleGroupName = ruleGroupName;
		this.ruleName = ruleName;
		this.expression = expression;
		
		/*
		this.masterType = masterType;
		this.ruleCondition = ruleCondition;
		this.actions = rulesaction;
		this.createdBy = createdBy;
		this.whenCreated = whenCreated;
		this.updatedBy = updatedBy;
		this.whenUpdated = whenUpdated;
		this.isDocumentDeleted = isDocumentDeleted;
		this.ruleStartDate = ruleStartDate;
		*/
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
	
	/*
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

	
	public RuleAction[] getActions() {
		return actions;
	}

	public void setActions(RuleAction[] actions) {
		this.actions = actions;
	}
	

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public TimestampConverter getWhenCreated() {
		return whenCreated;
	}

	public void setWhenCreated(TimestampConverter whenCreated) {
		this.whenCreated = whenCreated;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public TimestampConverter getWhenUpdated() {
		return whenUpdated;
	}

	public void setWhenUpdated(TimestampConverter whenUpdated) {
		this.whenUpdated = whenUpdated;
	}

	public String isDocumentDeleted() {
		return isDocumentDeleted;
	}

	public void setDocumentDeleted(String isDocumentDeleted) {
		this.isDocumentDeleted = isDocumentDeleted;
	}

	public TimestampConverter getRuleStartDate() {
		return ruleStartDate;
	}

	public void setRuleStartDate(TimestampConverter ruleStartDate) {
		this.ruleStartDate = ruleStartDate;
	}
	
	*/

}
