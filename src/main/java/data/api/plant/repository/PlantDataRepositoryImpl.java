package data.api.plant.repository;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.stereotype.Repository;

import data.api.rules.respository.RulesDataRepository;
import data.api.rules.respository.RulesDataRepositoryImpl;
import data.mongo.reader.MongoDBReader;

@Repository
public class PlantDataRepositoryImpl implements PlantDataRepository{

		@Autowired
		private MongoProperties configuration;
		MongoDBReader mongoDBReader = new MongoDBReader();
		private static final Logger PlantDataDAOLogger = LogManager.getLogger(PlantDataRepositoryImpl.class);	

}
