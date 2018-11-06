package data.api.gmao.entites;

import java.util.Date;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

@Entity("gmaos")
public class Gmao {

	@Id
	private ObjectId id;
	
	@Property("master_data_type")
	private String masterDataType;
	
	@Property("equipment_ol")
	private String equipmentOl;
	
	@Property("equipment_no")
	private String equipmentNo;
	
	@Property("equipment_group")
	private String equipmentGroup;
	
	@Property("equipment_group_description")
	private String equipmentGroupDescription;
	
	@Property("site_id")
	private String siteId;
	
	@Property("factory_id")
	private String factoryId;
	
	@Property("createdby")
	private String createdBy;
	
	@Property("whencreated")
	private Date whenCreated;
	
	@Property("updatedby")
	private String updatedBy;
	
	@Property("whenupdated")
	private String whenUpdated;
	
	@Property("_class")
	private String className;
	
	public Gmao() {
		
	}
	
	public Gmao(ObjectId id, String masterDataType, String equipmentOl,String equipmentNo,String equipmentGroup,String equipmentGroupDescription,String siteId,String factoryId,String createdBy,Date whenCreated,String updatedBy,String whenUpdated,String className) {
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

	public Date getWhenCreated() {
		return whenCreated;
	}

	public void setWhenCreated(Date whenCreated) {
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
