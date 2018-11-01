package data.api.rules.entities;

import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Property;

@Embedded
public class Actions {
	
	@Property("BCC")
	private String bcc;
	
	@Property("CC")
	private String cc;
	
	@Property("NAME")
	private String name;
	
	@Property("TO")
	private String to;

	public Actions() {

	}

	public Actions(String bcc, String cc, String name, String to) {
          this.bcc = bcc;
          this.cc = cc;
          this.name = name;
          this.to= to;
	}

	public String getBcc() {
		return bcc;
	}

	public void setBcc(String bcc) {
		this.bcc = bcc;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

}
