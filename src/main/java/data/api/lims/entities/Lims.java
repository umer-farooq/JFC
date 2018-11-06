package data.api.lims.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

@Entity("lims")
public class Lims {

	@Id
	private ObjectId id;
	
	@Property("site")
	private String siteId;
	
	@Property("factory")
	private String factory;
	
	@Property("workshop")
	private String workshop;
	
	@Property("product_line")
	private String productline;
	
	@Property("ITEM_TIMESTAMP")
	private Date itemTimeStamp;
	
	@Embedded
	private List<Results> results = new ArrayList<Results>();
	
	@Property("_class")
	private String className;
	
	public Lims() {
		
	}
	
	public Lims(ObjectId id, String siteId, String factory, String workshop, String productLine, Date itemTimeStamp, List<Results> results, String className) {
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

	public Date getItemTimeStamp() {
		return itemTimeStamp;
	}

	public void setItemTimeStamp(Date itemTimeStamp) {
		this.itemTimeStamp = itemTimeStamp;
	}

	public List<Results> getResults() {
		return results;
	}

	public void setResults(List<Results> results) {
		this.results = results;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
	
}
