package data.api.lims.entities;

import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Property;

@Embedded
public class Results {
	
	@Property("name")
	private String name;
	
	@Property("units")
	private String units;
	
	@Property("type")
	private String type;
	
	@Property("value")
	private String value;

	public Results() {
		
	}
	
	public Results(String name, String units, String type, String value) {
		this.name = name;
		this.units = units;
		this.type = type;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
