package data.api.iot.entities;

import java.util.Date;

import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Property;

@Embedded
public class DevEUIUplink {
    
	
	@Property("ADRbit")
	private Long adrBit;
	
	@Property("Channel")
	private String channel;
	
	@Embedded
	private CustomerData CustomerData;
	
	
	@Property("CustomerID")
	private String customerId;
	
	@Property("DevAddr")
	private String devAddr;
	
	@Property("DevEUI")
	private String devEUI;
	
	@Property("DevLrrCnt")
	private String devLrrCnt;
	
	@Property("FCntDn")
	private Long fcntDn;
	
	@Property("FCntUp")
	private Long fcntUp;
	
	@Property("FPort")
	private Long fPort;
	
	@Property("InstantPER")
	private Double instantPer;
	
	@Property("Late")
	private String late;
	
	@Property("Lrcid")
	private String lrcid;
	
	@Property("LrrRSSI")
	private String lrrRssi;
	
	@Property("LrrSNR")
	private String lrrSnr;
	
	@Property("Lrrid")
	private String lrrId;
	
	@Embedded
	private Lrrs lrrs;
	
	@Property("MType")
	private Long mType;
	
	@Property("MeanPER")
	private String meanPer;
	
	@Property("ModelCfg")
	private String modelCFg;
	
	@Property("NbTrans")
	private Long nbTrans;
	
	@Property("SpFact")
	private Long spFact;
	
	@Property("SubBand")
	private String subBand;
	
	@Property("Time")
	private Date time;
	
	@Property("TxPower")
	private String txPower;
	
	@Property("mic_hex")
	private String micHex;
	
	@Property("payload_hex")
	private String payloadHex;
	
	@Embedded
	private Payload payload;
	
	
	public DevEUIUplink(){
		
	}
	
    
	public DevEUIUplink(Long adrBit,String channel, CustomerData customerData,String customerId,String devAddr,String devEUI,String devLrrCnt,Long fcntDn,Long fcntUp,Long fPort,Double instantPer,String late,String lrcid,String lrrRssi,String lrrSnr,String lrrId,Lrrs lrrs,Long mType,String meanPer,String modelCFg,Long nbTrans,Long spFact,String subBand,Date time,String txPower,String micHex,String payloadHex,Payload payload) {
		
		this.adrBit = adrBit;
		this.channel = channel;
		this.CustomerData = customerData;
		this.customerId = customerId;
		this.devAddr = devAddr;
		this.devEUI = devEUI;
		this.devLrrCnt = devLrrCnt;
		this.fcntDn = fcntDn;
		this.fcntUp = fcntUp;
		this.fPort = fPort;
		this.instantPer = instantPer;
		this.late = late;
		this.lrcid = lrcid;
		this.lrrRssi = lrrRssi;
		this.lrrSnr = lrrSnr;
		this.lrrId = lrrId;
		this.lrrs = lrrs;
		this.mType = mType;
		this.meanPer = meanPer;
		this.modelCFg = modelCFg;
		this.nbTrans = nbTrans;
		this.spFact = spFact;
		this.subBand = subBand;
		this.time = time;
		this.txPower = txPower;
		this.micHex = micHex;
		this.payloadHex = payloadHex;
		this.payload = payload;
		
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
		return CustomerData;
	}

	
	public void setCustomerData(CustomerData customerData) {
		this.CustomerData = customerData;
	}
	
	
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getDevAddr() {
		return devAddr;
	}

	public void setDevAddr(String devAddr) {
		this.devAddr = devAddr;
	}

	public String getDevEUI() {
		return devEUI;
	}

	public void setDevEUI(String devEUI) {
		this.devEUI = devEUI;
	}

	public String getDevLrrCnt() {
		return devLrrCnt;
	}

	public void setDevLrrCnt(String devLrrCnt) {
		this.devLrrCnt = devLrrCnt;
	}

	public Long getFcntDn() {
		return fcntDn;
	}

	public void setFcntDn(Long fcntDn) {
		this.fcntDn = fcntDn;
	}

	public Long getFcntUp() {
		return fcntUp;
	}

	public void setFcntUp(Long fcntUp) {
		this.fcntUp = fcntUp;
	}

	public Long getfPort() {
		return fPort;
	}

	public void setfPort(Long fPort) {
		this.fPort = fPort;
	}

	public Double getInstantPer() {
		return instantPer;
	}

	public void setInstantPer(Double instantPer) {
		this.instantPer = instantPer;
	}

	public String getLate() {
		return late;
	}

	public void setLate(String late) {
		this.late = late;
	}

	public String getLrcid() {
		return lrcid;
	}

	public void setLrcid(String lrcid) {
		this.lrcid = lrcid;
	}

	public String getLrrRssi() {
		return lrrRssi;
	}

	public void setLrrRssi(String lrrRssi) {
		this.lrrRssi = lrrRssi;
	}

	public String getLrrSnr() {
		return lrrSnr;
	}

	public void setLrrSnr(String lrrSnr) {
		this.lrrSnr = lrrSnr;
	}

	public String getLrrId() {
		return lrrId;
	}

	public void setLrrId(String lrrId) {
		this.lrrId = lrrId;
	}

	public Lrrs getLrrs() {
		return lrrs;
	}

	public void setLrrs(Lrrs lrrs) {
		this.lrrs = lrrs;
	}
   
	public Long getmType() {
		return mType;
	}

	public void setmType(Long mType) {
		this.mType = mType;
	}

	public String getMeanPer() {
		return meanPer;
	}

	public void setMeanPer(String meanPer) {
		this.meanPer = meanPer;
	}

	public String getModelCFg() {
		return modelCFg;
	}

	public void setModelCFg(String modelCFg) {
		this.modelCFg = modelCFg;
	}

	public Long getNbTrans() {
		return nbTrans;
	}

	public void setNbTrans(Long nbTrans) {
		this.nbTrans = nbTrans;
	}

	public Long getSpFact() {
		return spFact;
	}

	public void setSpFact(Long spFact) {
		this.spFact = spFact;
	}

	public String getSubBand() {
		return subBand;
	}

	public void setSubBand(String subBand) {
		this.subBand = subBand;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	
	public String getTxPower() {
		return txPower;
	}

	public void setTxPower(String txPower) {
		this.txPower = txPower;
	}

	public String getMicHex() {
		return micHex;
	}

	public void setMicHex(String micHex) {
		this.micHex = micHex;
	}

	public String getPayloadHex() {
		return payloadHex;
	}

	public void setPayloadHex(String payloadHex) {
		this.payloadHex = payloadHex;
	}

	public Payload getPayload() {
		return payload;
	}

	public void setPayload(Payload payload) {
		this.payload = payload;
	}
	
	
}
