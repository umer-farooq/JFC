package data.api.iot.entities;

import org.mongodb.morphia.annotations.Embedded;

@Embedded
public class CustomerData {	
	
	@Embedded
	private Alr alr;
	
	public CustomerData() {
		
	}
	
    public CustomerData(Alr alr) {
		this.alr = alr;
	}

	public Alr getAlr() {
		return alr;
	}

	public void setAlr(Alr alr) {
		this.alr = alr;
	}
	
	
	
}
