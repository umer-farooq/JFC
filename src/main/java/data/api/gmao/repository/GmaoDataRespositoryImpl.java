package data.api.gmao.repository;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import data.mongo.reader.MongoDBReader;

public class GmaoDataRespositoryImpl {

	@Autowired
	private MongoProperties configuration;
	MongoDBReader mongoDBReader = new MongoDBReader();
	private static final Logger GmaoDataDAOLogger = LogManager.getLogger(GmaoDataRespositoryImpl.class);	
	
	 
}
