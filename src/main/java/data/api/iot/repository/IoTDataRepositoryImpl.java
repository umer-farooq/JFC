package data.api.iot.repository;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.stereotype.Repository;

import data.api.gmao.entites.Gmao;
import data.api.iot.entities.Iot;
import data.mongo.reader.MongoDBReader;

@Repository
public class IoTDataRepositoryImpl implements IoTDataRepository{
	
	@Autowired
	private MongoProperties configuration;
	
	MongoDBReader mongoDBReader = new MongoDBReader();
	
	private static final Logger IoTDataDAOLogger = LogManager.getLogger(IoTDataRepositoryImpl.class);
	
	@Override
	public List<Iot> getIoTDataByRange(Long fromDate, Long toDate) throws Exception {
		List<Iot> iots = new ArrayList<Iot>();
		mongoDBReader.prepareConnection(configuration.getUri(),configuration.getDatabase(),configuration.getUsername(), configuration.getPassword().toString(),IoTDataDAOLogger);
		iots = mongoDBReader.getIoTDataByRange(fromDate,toDate);
		return iots;
	}
	
	@Override
	public List<Iot> getIoTDataByChannel(Long fromDate, Long toDate, String channel) throws Exception {
		List<Iot> iots = new ArrayList<Iot>();
		mongoDBReader.prepareConnection(configuration.getUri(),configuration.getDatabase(),configuration.getUsername(), configuration.getPassword().toString(),IoTDataDAOLogger);
		iots = mongoDBReader.getIoTDataByChannel(fromDate,toDate,channel);
		return iots;
	}
	
	@Override
	public List<Iot> getIoTDataByDevAddr(Long fromDate, Long toDate, String devAddr) throws Exception {
		List<Iot> iots = new ArrayList<Iot>();
		mongoDBReader.prepareConnection(configuration.getUri(),configuration.getDatabase(),configuration.getUsername(), configuration.getPassword().toString(),IoTDataDAOLogger);
		iots = mongoDBReader.getIoTDataByDevAddr(fromDate,toDate,devAddr);
		return iots;
	}

	@Override
	public List<Iot> getIoTDataByDevEUI(Long fromDate, Long toDate, String devEUI) throws Exception {
		List<Iot> iots = new ArrayList<Iot>();
		mongoDBReader.prepareConnection(configuration.getUri(),configuration.getDatabase(),configuration.getUsername(), configuration.getPassword().toString(),IoTDataDAOLogger);
		iots = mongoDBReader.getIoTDataByDevEUI(fromDate,toDate,devEUI);
		return iots;
	}

	
	@Override
	public List<Iot> getIoTData(Long fromDate, Long toDate, String channel, String devAddr, String devEUI)
			throws Exception {
		List<Iot> iots = new ArrayList<Iot>();
		mongoDBReader.prepareConnection(configuration.getUri(),configuration.getDatabase(),configuration.getUsername(), configuration.getPassword().toString(),IoTDataDAOLogger);
		iots = mongoDBReader.getIoTData(fromDate,toDate,channel,devAddr,devEUI);
		return iots;
	}

}
