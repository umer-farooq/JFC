package data.api.iot.entities;

import org.mongodb.morphia.annotations.Entity;

@Entity
public class DevEUIUplink {
     
	private Long adrBit;
	private String channel;
	private CustomerData customerData;
	
	public DevEUIUplink(){
		
	}
	
	public DevEUIUplink(Long adrBit,String channel, CustomerData customerData) {
		this.adrBit = adrBit;
		this.channel = channel;
		this.customerData = customerData;
	}

	public Long getAdrBit() {
		return adrBit;
	}

	public void setAdrBit(Long adrBit) {
		this.adrBit = adrBit;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public CustomerData getCustomerData() {
		return customerData;
	}

	public void setCustomerData(CustomerData customerData) {
		this.customerData = customerData;
	}
	
	
	
	
}
