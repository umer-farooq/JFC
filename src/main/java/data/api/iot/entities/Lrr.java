package data.api.iot.entities;

import org.mongodb.morphia.annotations.Embedded;

@Embedded
public class Lrr {
	private Long chain;
	private String lrrESP;
	private String lrrRSSI;
	private String lrrSNR;
	private String lrrId;
	
	public Lrr() {
		
	}
	
	public Lrr(Long chain,String lrrESP,String lrrRSSI,String lrrSNR,String lrrId) {
		this.chain = chain;
		this.lrrESP = lrrESP;
		this.lrrRSSI = lrrRSSI;
		this.lrrSNR = lrrSNR;
		this.lrrId = lrrId;
	}

	public Long getChain() {
		return chain;
	}

	public void setChain(Long chain) {
		this.chain = chain;
	}

	public String getLrrESP() {
		return lrrESP;
	}

	public void setLrrESP(String lrrESP) {
		this.lrrESP = lrrESP;
	}

	public String getLrrRSSI() {
		return lrrRSSI;
	}

	public void setLrrRSSI(String lrrRSSI) {
		this.lrrRSSI = lrrRSSI;
	}

	public String getLrrSNR() {
		return lrrSNR;
	}

	public void setLrrSNR(String lrrSNR) {
		this.lrrSNR = lrrSNR;
	}

	public String getLrrId() {
		return lrrId;
	}

	public void setLrrId(String lrrId) {
		this.lrrId = lrrId;
	}

	
}
