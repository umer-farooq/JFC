package data.api.gmao.repository;

import java.util.List;

import data.api.gmao.entites.Gmao;

public interface GmaoDataRepository {

	List<Gmao> getGmaoDataByCreationTime(Long creationTime) throws Exception;

	List<Gmao> getGmaoDataByMasterType(Long creationTime, String masterType) throws Exception;

	List<Gmao> getGmaoDataByEquipmentOl(Long creationTime, String equipmentOl) throws Exception;

	List<Gmao> getGmaoDataByEquipmentNo(Long creationTime, String equipmentNo) throws Exception;

	List<Gmao> getGmaoDataByEquipmentGroup(Long creationTime, String equipmentGroup) throws Exception;

	List<Gmao> getGmaoDataByEquipmentGroupDesc(Long creationTime, String equipmentGroupDesc) throws Exception;

	List<Gmao> getGmaoDataBySiteId(Long creationTime, String siteId) throws Exception;

	List<Gmao> getGmaoDataByFactoryId(Long creationTime, String factoryId) throws Exception;

	List<Gmao> getGmaoData(Long creationTime, String masterDataType, String equipmentOl, String equipmentNo,
			String equipmentGroup, String equipmentGroupDesc, String siteId, String factoryId) throws Exception;

}
