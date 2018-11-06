package data.api.gmao.services;

import java.util.List;

import data.api.gmao.entites.Gmao;

public interface GmaoDataService {

	List<Gmao> getGmaoDataByCreationTime(Long creationTime);

	List<Gmao> getGmaoDataByMasterType(Long creationTime, String masterType);

	List<Gmao> getGmaoDataByEquipmentOl(Long creationTime, String equipmentOl);

	List<Gmao> getGmaoDataByEquipmentNo(Long creationTime, String equipmentNo);

	List<Gmao> getGmaoDataByEquipmentGroup(Long creationTime, String equipmentGroup);

	List<Gmao> getGmaoDataByEquipmentGroupDesc(Long creationTime, String equipmentGroupDesc);

	List<Gmao> getGmaoDataBySiteId(Long creationTime, String siteId);

	List<Gmao> getGmaoDataByFactoryId(Long creationTime, String factoryId);

	List<Gmao> getGmaoData(Long creationTime, String masterDataType, String equipmentOl, String equipmentNo,
			String equipmentGroup, String equipmentGroupDesc, String siteId, String factoryId);

}
