package data.api.lims.entities;

public class Results {
	
	private String name;
	private String unit;
	private String type;
	private String value;

	public Results() {
		
	}
	
	public Results(String name, String unit, String type, String value) {
		this.name = name;
		this.unit = unit;
		this.type = type;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
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
