package data.api.plant.entities;

import java.util.Date;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

@Entity(value="plants")
public class Plant {
    
	@Id
	private ObjectId id;
	
	@Property("ITEM_ID")
	private String itemId;
	
	@Property("ITEM_QUALITY")
	private String itemQuality;
	
	@Property("ITEM_TIMESTAMP")
	private Date itemTimeStamp;
	
	@Property("ITEM_VALUE")
	private String itemValue;

	
	public Plant() {
		
	}
	
	public Plant(ObjectId objectId,String itemId,String itemQuality,Date itemTimeStamp,String itemValue) {
		this.id = objectId;
		this.itemId = itemId;
		this.itemQuality = itemQuality;
		this.itemTimeStamp = itemTimeStamp;
		this.itemValue = itemValue;
	}
	
	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemQuality() {
		return itemQuality;
	}

	public void setItemQuality(String itemQuality) {
		this.itemQuality = itemQuality;
	}

	public Date getItemTimeStamp() {
		return itemTimeStamp;
	}

	public void setItemTimeStamp(Date itemTimeStamp) {
		this.itemTimeStamp = itemTimeStamp;
	}

	public String getItemValue() {
		return itemValue;
	}

	public void setItemValue(String itemValue) {
		this.itemValue = itemValue;
	}
	
	
}
