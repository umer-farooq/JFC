package data.api.plant.repository;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.stereotype.Repository;

import data.api.plant.entities.Plant;
import data.api.rules.entities.Rule;
import data.api.rules.respository.RulesDataRepository;
import data.api.rules.respository.RulesDataRepositoryImpl;
import data.mongo.reader.MongoDBReader;

@Repository
public class PlantDataRepositoryImpl implements PlantDataRepository{

		@Autowired
		private MongoProperties configuration;
		MongoDBReader mongoDBReader = new MongoDBReader();
		
		private static final Logger PlantDataDAOLogger = LogManager.getLogger(PlantDataRepositoryImpl.class);	
		
		
		public List<Plant> getPlantData(String itemId) throws Exception{
			List<Plant> plants = new ArrayList<Plant>();
			   mongoDBReader.prepareConnection(configuration.getUri(),configuration.getDatabase(),configuration.getUsername(), configuration.getPassword().toString(),PlantDataDAOLogger);
			   plants = mongoDBReader.getPlantData(itemId);
			   return plants;
		}
		
		public List<Plant> getPlantData(String itemId, Long fromDate, Long toDate) throws Exception{
		List<Plant> plants = new ArrayList<Plant>();
		   mongoDBReader.prepareConnection(configuration.getUri(),configuration.getDatabase(),configuration.getUsername(), configuration.getPassword().toString(),PlantDataDAOLogger);
		   plants = mongoDBReader.getPlantData(itemId,fromDate,toDate);
		   return plants;
		}

}
