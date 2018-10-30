package data.api.iot.model;

public class RuleAction {
	private String bcc;
	private String cc;
	private String name;
	private String to;

	public RuleAction() {

	}

	public RuleAction(String bcc, String cc, String name, String to) {
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
