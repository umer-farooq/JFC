package data.api.iot.entities;

import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Property;

@Embedded
public class Alr {

	@Property("pro")
	private String pro;
	
	@Property("ver")
	private String ver;
	
	public Alr() {
		
	}
	
	public Alr(String pro,String ver) {
		this.pro = pro;
		this.ver = ver;
	}

	public String getPro() {
		return pro;
	}

	public void setPro(String pro) {
		this.pro = pro;
	}

	public String getVer() {
		return ver;
	}

	public void setVer(String ver) {
		this.ver = ver;
	}

}
