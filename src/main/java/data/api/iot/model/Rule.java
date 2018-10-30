package data.api.iot.model;

import java.util.Date;

public class Rule {
	private int Id;
	private String ruleGroupName;
	private String ruleName;
	private String masterType;
	private String expression;
	private String ruleCondition;
	private RuleAction[] actions;
	private String createdBy;
	private Date whenCreated;
	private String updatedBy;
	private Date whenUpdated;
	private String isDocumentDeleted;
	private Date ruleStartDate;

	public Rule() {

	}

	public Rule(int id, String ruleGroupName, String ruleName, String masterType, String expression,
			String ruleCondition, RuleAction[] rulesaction, String createdBy, Date whenCreated, String updatedBy,
			Date whenUpdated, String isDocumentDeleted, Date ruleStartDate) {
		this.Id = id;
		this.ruleGroupName = ruleGroupName;
		this.ruleName = ruleName;
		this.masterType = masterType;
		this.expression = expression;
		this.ruleCondition = ruleCondition;
		this.actions = rulesaction;
		this.createdBy = createdBy;
		this.whenCreated = whenCreated;
		this.updatedBy = updatedBy;
		this.whenUpdated = whenUpdated;
		this.isDocumentDeleted = isDocumentDeleted;
		this.ruleStartDate = ruleStartDate;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
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

	public String getMasterType() {
		return masterType;
	}

	public void setMasterType(String masterType) {
		this.masterType = masterType;
	}

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
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

	public Date getWhenCreated() {
		return whenCreated;
	}

	public void setWhenCreated(Date whenCreated) {
		this.whenCreated = whenCreated;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getWhenUpdated() {
		return whenUpdated;
	}

	public void setWhenUpdated(Date whenUpdated) {
		this.whenUpdated = whenUpdated;
	}

	public String isDocumentDeleted() {
		return isDocumentDeleted;
	}

	public void setDocumentDeleted(String isDocumentDeleted) {
		this.isDocumentDeleted = isDocumentDeleted;
	}

	public Date getRuleStartDate() {
		return ruleStartDate;
	}

	public void setRuleStartDate(Date ruleStartDate) {
		this.ruleStartDate = ruleStartDate;
	}

}
