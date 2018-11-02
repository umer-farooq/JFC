package data.api.lims.entities;

import org.bson.types.ObjectId;

public class Lims {

	private ObjectId id;
	private String siteId;
	private String factory;
	private String workshop;
	private String productline;
	private String itemTimeStamp;
	private Results results;
	private String className;
	
	public Lims() {
		
	}
	
	public Lims(ObjectId id, String siteId, String factory, String workshop, String productLine, String itemTimeStamp, Results results, String className) {
		this.id = id;
		this.siteId = siteId;
		this.factory = factory;
		this.workshop = workshop;
		this.productline = productLine;
		this.itemTimeStamp = itemTimeStamp;
		this.results = results;
		this.className = className;
		
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getSiteId() {
		return siteId;
	}

	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}

	public String getFactory() {
		return factory;
	}

	public void setFactory(String factory) {
		this.factory = factory;
	}

	public String getWorkshop() {
		return workshop;
	}

	public void setWorkshop(String workshop) {
		this.workshop = workshop;
	}

	public String getProductline() {
		return productline;
	}

	public void setProductline(String productline) {
		this.productline = productline;
	}

	public String getItemTimeStamp() {
		return itemTimeStamp;
	}

	public void setItemTimeStamp(String itemTimeStamp) {
		this.itemTimeStamp = itemTimeStamp;
	}

	public Results getResults() {
		return results;
	}

	public void setResults(Results results) {
		this.results = results;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
	
	
}
