package data.api.iot.entities;

import java.util.Date;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

@Entity(value="iots")
public class Iot {

	@Id
	private ObjectId id;
	
	@Embedded
	private DevEUIUplink DevEUI_uplink;
	
	
	public Iot() {
		
	}
	
	public Iot(ObjectId id,DevEUIUplink DevEUI_uplink) {
		this.id = id;	
		this.DevEUI_uplink = DevEUI_uplink;

	}

	public ObjectId getId() {
		return id;
	}

	
	public void setId(ObjectId id) {
		this.id = id;
	}

	
	public DevEUIUplink getDevEUIUplink() {
		return DevEUI_uplink;
	}

	public void setDevEUIUplink(DevEUIUplink DevEUI_uplink) {
		this.DevEUI_uplink = DevEUI_uplink;
	}
	
	
}
