package data.api.gmao.entites;

import org.bson.types.ObjectId;

public class Gmao {

	private ObjectId id;
	private String masterDataType;
	private String equipmentOl;
	private String equipmentNo;
	private String equipmentGroup;
	private String equipmentGroupDescription;
	private String siteId;
	private String factoryId;
	private String createdBy;
	private String whenCreated;
	private String updatedBy;
	private String whenUpdated;
	private String className;
	
	public Gmao() {
		
	}
	
	public Gmao(ObjectId id, String masterDataType, String equipmentOl,String equipmentNo,String equipmentGroup,String equipmentGroupDescription,String siteId,String factoryId,String createdBy,String whenCreated,String updatedBy,String whenUpdated,String className) {
          this.id = id;
          this.masterDataType =masterDataType;
          this.equipmentOl = equipmentOl;
          this.equipmentNo = equipmentNo;
          this.equipmentGroup = equipmentGroup;
          this.equipmentGroupDescription = equipmentGroupDescription;
          this.siteId = siteId;
          this.factoryId = factoryId;
          this.createdBy = createdBy;
          this.whenCreated = whenCreated;
          this.updatedBy = updatedBy;
          this.whenUpdated = whenUpdated;
          this.className = className;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getMasterDataType() {
		return masterDataType;
	}

	public void setMasterDataType(String masterDataType) {
		this.masterDataType = masterDataType;
	}

	public String getEquipmentOl() {
		return equipmentOl;
	}

	public void setEquipmentOl(String equipmentOl) {
		this.equipmentOl = equipmentOl;
	}

	public String getEquipmentNo() {
		return equipmentNo;
	}

	public void setEquipmentNo(String equipmentNo) {
		this.equipmentNo = equipmentNo;
	}

	public String getEquipmentGroup() {
		return equipmentGroup;
	}

	public void setEquipmentGroup(String equipmentGroup) {
		this.equipmentGroup = equipmentGroup;
	}

	public String getEquipmentGroupDescription() {
		return equipmentGroupDescription;
	}

	public void setEquipmentGroupDescription(String equipmentGroupDescription) {
		this.equipmentGroupDescription = equipmentGroupDescription;
	}

	public String getSiteId() {
		return siteId;
	}

	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}

	public String getFactoryId() {
		return factoryId;
	}

	public void setFactoryId(String factoryId) {
		this.factoryId = factoryId;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getWhenCreated() {
		return whenCreated;
	}

	public void setWhenCreated(String whenCreated) {
		this.whenCreated = whenCreated;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getWhenUpdated() {
		return whenUpdated;
	}

	public void setWhenUpdated(String whenUpdated) {
		this.whenUpdated = whenUpdated;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
	
	
	
}
