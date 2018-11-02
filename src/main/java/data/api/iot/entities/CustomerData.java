package data.api.iot.entities;

public class CustomerData {	
	private String pro;
	private String ver;
	
	public CustomerData() {
		
	}
	
	public CustomerData(String pro,String ver) {
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
