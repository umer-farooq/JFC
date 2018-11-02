package data.api.iot.entities;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;

@Entity(value="IOT")
public class Iot {

	private ObjectId id;
	private DevEUIUplink devEUIUplink;
	private String customerId;
	private String devAddr;
	private String devEUI;
	private String devLrrCnt;
	private Long fcntDn;
	private Long fcntUp;
	private Long fPort;
	private Double instantPer;
	private String late;
	private String lrcid;
	private String lrrRssi;
	private String lrrSnr;
	private String lrrId;
	private Lrrs lrrs;
	private Long mType;
	private String meanPer;
	private String modelCFg;
	private Long nbTrans;
	private Long spFact;
	private String subBand;
	private String time;
	private String txPower;
	private String micHex;
	private String payloadHex;
	private Payload payload;
	
	public Iot() {
		
	}
	
	public Iot(ObjectId id,DevEUIUplink devEUIUplink,String customerId,String devAddr,String devEUI,String devLrrCnt,Long fcntDn,Long fcntUp,Long fPort,Double instantPer,String late,String lrcid,String lrrRssi,String lrrSnr,String lrrId,Lrrs lrrs,Long mType,String meanPer,String modelCFg,Long nbTrans,Long spFact,String subBand,String time,String txPower,String micHex,String payloadHex,Payload payload) {
		this.id = id;
		this.devEUIUplink = devEUIUplink;
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

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public DevEUIUplink getDevEUIUplink() {
		return devEUIUplink;
	}

	public void setDevEUIUplink(DevEUIUplink devEUIUplink) {
		this.devEUIUplink = devEUIUplink;
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

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
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
