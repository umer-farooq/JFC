package data.api.gmao.repository;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.stereotype.Repository;

import data.api.gmao.entites.Gmao;
import data.mongo.reader.MongoDBReader;

@Repository
public class GmaoDataRespositoryImpl implements GmaoDataRepository{

	@Autowired
	private MongoProperties configuration;
	MongoDBReader mongoDBReader = new MongoDBReader();
	private static final Logger GmaoDataDAOLogger = LogManager.getLogger(GmaoDataRespositoryImpl.class);
	@Override
	public List<Gmao> getGmaoDataByCreationTime(Long creationTime) throws Exception {
		List<Gmao> gmaos = new ArrayList<Gmao>();
		mongoDBReader.prepareConnection(configuration.getUri(),configuration.getDatabase(),configuration.getUsername(), configuration.getPassword().toString(),GmaoDataDAOLogger);
		gmaos = mongoDBReader.getGmaoDataByCreationTime(creationTime);
		return gmaos;
	}
	@Override
	public List<Gmao> getGmaoDataByMasterType(Long creationTime, String masterType) throws Exception {
		List<Gmao> gmaos = new ArrayList<Gmao>();
		mongoDBReader.prepareConnection(configuration.getUri(),configuration.getDatabase(),configuration.getUsername(), configuration.getPassword().toString(),GmaoDataDAOLogger);
		gmaos = mongoDBReader.getGmaoDataByMasterType(creationTime,masterType);
		return gmaos;
	}
	@Override
	public List<Gmao> getGmaoDataByEquipmentOl(Long creationTime, String equipmentOl) throws Exception {
		List<Gmao> gmaos = new ArrayList<Gmao>();
		mongoDBReader.prepareConnection(configuration.getUri(),configuration.getDatabase(),configuration.getUsername(), configuration.getPassword().toString(),GmaoDataDAOLogger);
		gmaos = mongoDBReader.getGmaoDataByEquipmentOl(creationTime,equipmentOl);
		return gmaos;
	}
	@Override
	public List<Gmao> getGmaoDataByEquipmentNo(Long creationTime, String equipmentNo) throws Exception {
		List<Gmao> gmaos = new ArrayList<Gmao>();
		mongoDBReader.prepareConnection(configuration.getUri(),configuration.getDatabase(),configuration.getUsername(), configuration.getPassword().toString(),GmaoDataDAOLogger);
		gmaos = mongoDBReader.getGmaoDataByEquipmentNo(creationTime,equipmentNo);
		return gmaos;
	}
	@Override
	public List<Gmao> getGmaoDataByEquipmentGroup(Long creationTime, String equipmentGroup) throws Exception {
		List<Gmao> gmaos = new ArrayList<Gmao>();
		mongoDBReader.prepareConnection(configuration.getUri(),configuration.getDatabase(),configuration.getUsername(), configuration.getPassword().toString(),GmaoDataDAOLogger);
		gmaos = mongoDBReader.getGmaoDataByEquipmentGroup(creationTime,equipmentGroup);
		return gmaos;
	}
	@Override
	public List<Gmao> getGmaoDataByEquipmentGroupDesc(Long creationTime, String equipmentGroupDesc) throws Exception {
		List<Gmao> gmaos = new ArrayList<Gmao>();
		mongoDBReader.prepareConnection(configuration.getUri(),configuration.getDatabase(),configuration.getUsername(), configuration.getPassword().toString(),GmaoDataDAOLogger);
		gmaos = mongoDBReader.getGmaoDataByEquipmentGroupDesc(creationTime,equipmentGroupDesc);
		return gmaos;
	}
	@Override
	public List<Gmao> getGmaoDataBySiteId(Long creationTime, String siteId) throws Exception {
		List<Gmao> gmaos = new ArrayList<Gmao>();
		mongoDBReader.prepareConnection(configuration.getUri(),configuration.getDatabase(),configuration.getUsername(), configuration.getPassword().toString(),GmaoDataDAOLogger);
		gmaos = mongoDBReader.getGmaoDataBySiteId(creationTime,siteId);
		return gmaos;
	}
	@Override
	public List<Gmao> getGmaoDataByFactoryId(Long creationTime, String factoryId) throws Exception {
		List<Gmao> gmaos = new ArrayList<Gmao>();
		mongoDBReader.prepareConnection(configuration.getUri(),configuration.getDatabase(),configuration.getUsername(), configuration.getPassword().toString(),GmaoDataDAOLogger);
		gmaos = mongoDBReader.getGmaoDataByFactoryId(creationTime,factoryId);
		return gmaos;
	}
	@Override
	public List<Gmao> getGmaoData(Long creationTime, String masterDataType, String equipmentOl, String equipmentNo,
			String equipmentGroup, String equipmentGroupDesc, String siteId, String factoryId) throws Exception {
		List<Gmao> gmaos = new ArrayList<Gmao>();
		mongoDBReader.prepareConnection(configuration.getUri(),configuration.getDatabase(),configuration.getUsername(), configuration.getPassword().toString(),GmaoDataDAOLogger);
		gmaos = mongoDBReader.getGmaoData(creationTime,masterDataType,equipmentOl,equipmentNo,equipmentGroup,equipmentGroupDesc,siteId,factoryId);
		return gmaos;
	}	
	
	 
}
