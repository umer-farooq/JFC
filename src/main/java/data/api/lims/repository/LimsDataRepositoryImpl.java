package data.api.lims.repository;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.stereotype.Repository;

import data.api.lims.entities.Lims;
import data.mongo.reader.MongoDBReader;

@Repository
public class LimsDataRepositoryImpl implements LimsDataRepository{
	
	@Autowired
	private MongoProperties configuration;
	MongoDBReader mongoDBReader = new MongoDBReader();
	private static final Logger LimsDataDAOLogger = LogManager.getLogger(LimsDataRepositoryImpl.class);
	@Override
	public List<Lims> getLimsDataByRange(Long fromDate, Long toDate) throws Exception {
		List<Lims> lims = new ArrayList<Lims>();
		mongoDBReader.prepareConnection(configuration.getUri(),configuration.getDatabase(),configuration.getUsername(), configuration.getPassword().toString(),LimsDataDAOLogger);
		lims = mongoDBReader.getLimsDataByRange(fromDate,toDate);
		return lims;
	}
	@Override
	public List<Lims> getLimsDataBySite(Long fromDate, Long toDate, String site) throws Exception {
		List<Lims> lims = new ArrayList<Lims>();
		mongoDBReader.prepareConnection(configuration.getUri(),configuration.getDatabase(),configuration.getUsername(), configuration.getPassword().toString(),LimsDataDAOLogger);
		lims = mongoDBReader.getLimsDataBySite(fromDate,toDate,site);
		return lims;
	}
	@Override
	public List<Lims> getLimsDataByFactory(Long fromDate, Long toDate, String factory) throws Exception {
		List<Lims> lims = new ArrayList<Lims>();
		mongoDBReader.prepareConnection(configuration.getUri(),configuration.getDatabase(),configuration.getUsername(), configuration.getPassword().toString(),LimsDataDAOLogger);
		lims = mongoDBReader.getLimsDataByFactory(fromDate,toDate,factory);
		return lims;
	}
	@Override
	public List<Lims> getLimsDataByWorkshop(Long fromDate, Long toDate, String workshop) throws Exception {
		List<Lims> lims = new ArrayList<Lims>();
		mongoDBReader.prepareConnection(configuration.getUri(),configuration.getDatabase(),configuration.getUsername(), configuration.getPassword().toString(),LimsDataDAOLogger);
		lims = mongoDBReader.getLimsDataByWorkshop(fromDate,toDate,workshop);
		return lims;
	}
	@Override
	public List<Lims> getLimsDataByProductLine(Long fromDate, Long toDate, String productLine) throws Exception {
		List<Lims> lims = new ArrayList<Lims>();
		mongoDBReader.prepareConnection(configuration.getUri(),configuration.getDatabase(),configuration.getUsername(), configuration.getPassword().toString(),LimsDataDAOLogger);
		lims = mongoDBReader.getLimsDataByProductLine(fromDate,toDate,productLine);
		return lims;
	}
	@Override
	public List<Lims> getLimsData(Long fromDate, Long toDate, String site, String factory, String workshop,
			String productLine) throws Exception {
		List<Lims> lims = new ArrayList<Lims>();
		mongoDBReader.prepareConnection(configuration.getUri(),configuration.getDatabase(),configuration.getUsername(), configuration.getPassword().toString(),LimsDataDAOLogger);
		lims = mongoDBReader.getLimsData(fromDate,toDate,site,factory,workshop,productLine);
		return lims;
	}	


}
