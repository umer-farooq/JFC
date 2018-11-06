package data.api.iot.entities;

import org.mongodb.morphia.annotations.Embedded;

@Embedded
public class Payload {

	private String temp;
	private String pressure;
	
	public Payload() {
		
	}
	
	public Payload(String temp, String pressure) {
		this.temp = temp;
		this.pressure = pressure;
	}

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	public String getPressure() {
		return pressure;
	}

	public void setPressure(String pressure) {
		this.pressure = pressure;
	}
	
	
}
