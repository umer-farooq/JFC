package data.mongo.reader;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

import org.apache.logging.log4j.Logger;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.converters.TimestampConverter;
import org.mongodb.morphia.query.Query;
import org.mongodb.morphia.query.QueryResults;
import org.springframework.context.annotation.Bean;

import com.mongodb.MongoCredential;

import data.api.gmao.entites.Gmao;
import data.api.iot.entities.Alr;
import data.api.iot.entities.CustomerData;
import data.api.iot.entities.DevEUIUplink;
import data.api.iot.entities.Iot;
import data.api.iot.entities.Lrr;
import data.api.iot.entities.Lrrs;
import data.api.iot.entities.Payload;
import data.api.lims.entities.Lims;
import data.api.plant.entities.Plant;
import data.api.rules.entities.Rule;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;


public class MongoDBReader {
	
	private MongoClient mongoClient;
	private Datastore mongoDatastore;
	private Morphia morphia;

	public synchronized void prepareConnection (String uri, String dbname, String username, String password, Logger logger) throws Exception
	{
		if (mongoClient == null)
		{
			try
			{
				logger.info( "Creating new connection to mongodb using URI: " + uri + " and database " + dbname);
				MongoClientURI mongoUri = new MongoClientURI(uri);
				mongoClient = new MongoClient(mongoUri);  
		      	// Creating Credentials 
				if (username != null && !username.isEmpty())
				{
					MongoCredential credential; 
					credential = MongoCredential.createCredential(username, dbname, password.toCharArray());
				}

				morphia = new Morphia();
				morphia.mapPackage("data.api.entities");
				mongoDatastore = morphia.createDatastore(mongoClient, dbname) ;
				logger.info( "Connected successfully mongodb...");
			}
			catch (Exception e)
			{
				logger.error("Failed to connect to mongodb...", e);
				throw e;
			}
		}
		else
			logger.info("Connection already exist");
	}
	
	public void getData(String id, Logger logger)
	{
		
		
	}
	
	public List<Rule> getIOTData() {
		List<Rule> rules = mongoDatastore.find(Rule.class).asList();
		return rules;
	}
	
	public List<Rule> getRules(String ruleGroupName) {
		  List<Rule> rules = mongoDatastore.find(Rule.class).field("RULE_KPI_GROUPNAME").equalIgnoreCase(ruleGroupName).asList();
		  return rules;
	}
	   
	public Rule getRule(String ruleGroupName,String ruleName) {
		  Rule rule = mongoDatastore.find(Rule.class).field("RULE_KPI_GROUPNAME").equalIgnoreCase(ruleGroupName).field("RULE_KPI_NAME").equalIgnoreCase(ruleName).get();
		  return rule;  
		
	}
	
	public boolean evaluateRule(String ruleGroupName,String ruleName,Map<String,String> inputMap) {
		//to be implemented
		return true;
    }

	public List<Plant> getPlantData(String itemId) throws ParseException{
		 List<Plant> plants = mongoDatastore.find(Plant.class).field("ITEM_ID").containsIgnoreCase(itemId).asList();
		  return plants;
	}
	
	public List<Plant> getPlantData(String itemId,Long fromDate,Long toDate) throws ParseException{
		 List<Plant> plants = mongoDatastore.find(Plant.class).field("ITEM_ID").containsIgnoreCase(itemId).field("ITEM_TIMESTAMP").greaterThanOrEq(new Date(fromDate)).field("ITEM_TIMESTAMP").lessThan(new Date(toDate)).asList();
		 return plants;
	}
	   
	public List<Gmao> getGmaoDataByCreationTime(Long creationTime) {
		List<Gmao> gmaos = mongoDatastore.find(Gmao.class).field("whencreated").greaterThanOrEq(new Date(creationTime)).asList();
		return gmaos;
	}
	
	public List<Gmao> getGmaoDataByMasterType(Long creationTime, String masterDataType) {
		List<Gmao> gmaos = mongoDatastore.find(Gmao.class).field("whencreated").greaterThanOrEq(new Date(creationTime)).field("master_data_type").equalIgnoreCase(masterDataType).asList();
		return gmaos;
	}
	
	public List<Gmao> getGmaoDataByEquipmentOl(Long creationTime, String equipmentOl) {
		List<Gmao> gmaos = mongoDatastore.find(Gmao.class).field("whencreated").greaterThanOrEq(new Date(creationTime)).field("equipment_ol").equalIgnoreCase(equipmentOl).asList();
		return gmaos;
	}
	
	public List<Gmao> getGmaoDataByEquipmentNo(Long creationTime, String equipmentNo) {
		List<Gmao> gmaos = mongoDatastore.find(Gmao.class).field("whencreated").greaterThanOrEq(new Date(creationTime)).field("equipment_no").equalIgnoreCase(equipmentNo).asList();
		return gmaos;
	}
	
	public List<Gmao> getGmaoDataByEquipmentGroup(Long creationTime, String equipmentGroup) {
		List<Gmao> gmaos = mongoDatastore.find(Gmao.class).field("whencreated").greaterThanOrEq(new Date(creationTime)).field("equipment_group").equalIgnoreCase(equipmentGroup).asList();
		return gmaos;
	}
	
	public List<Gmao> getGmaoDataByEquipmentGroupDesc(Long creationTime, String equipmentGroupDesc) {
		List<Gmao> gmaos = mongoDatastore.find(Gmao.class).field("whencreated").greaterThanOrEq(new Date(creationTime)).field("equipment_group_description").containsIgnoreCase(equipmentGroupDesc).asList();
		return gmaos;
	}
	
	public List<Gmao> getGmaoDataBySiteId(Long creationTime, String siteId) {
		List<Gmao> gmaos = mongoDatastore.find(Gmao.class).field("whencreated").greaterThanOrEq(new Date(creationTime)).field("site_id").containsIgnoreCase(siteId).asList();
		return gmaos;
	}
	
	public List<Gmao> getGmaoDataByFactoryId(Long creationTime, String factoryId) {
		List<Gmao> gmaos = mongoDatastore.find(Gmao.class).field("whencreated").greaterThanOrEq(new Date(creationTime)).field("factory_id").containsIgnoreCase(factoryId).asList();
		return gmaos;
	}

	public List<Gmao> getGmaoData(Long creationTime, String masterDataType, String equipmentOl, String equipmentNo,
		String equipmentGroup, String equipmentGroupDesc, String siteId, String factoryId) {
		List<Gmao> gmaos = mongoDatastore.find(Gmao.class).field("whencreated").greaterThanOrEq(new Date(creationTime)).field("master_data_type").equalIgnoreCase(masterDataType).field("equipment_ol").equalIgnoreCase(equipmentOl).field("equipment_no").equalIgnoreCase(equipmentNo).field("equipment_group").equalIgnoreCase(equipmentGroup).field("equipment_group_description").containsIgnoreCase(equipmentGroupDesc).field("site_id").containsIgnoreCase(siteId).field("factory_id").containsIgnoreCase(factoryId).asList();
		return gmaos;
	}

	public List<Iot> getIoTDataByRange(Long fromDate, Long toDate) {
		List<Iot> iots = mongoDatastore.find(Iot.class).field("DevEUI_uplink.Time").greaterThanOrEq(new Date(fromDate)).field("DevEUI_uplink.Time").lessThan(new Date(toDate)).asList();
		 return iots;
	}

	public List<Iot> getIoTDataByChannel(Long fromDate, Long toDate, String channel) {
		List<Iot> iots = mongoDatastore.find(Iot.class).field("DevEUI_uplink.Channel").equalIgnoreCase(channel).field("DevEUI_uplink.Time").greaterThanOrEq(new Date(fromDate)).field("DevEUI_uplink.Time").lessThan(new Date(toDate)).asList();
		 return iots;
	}
	
	
	public List<Iot> getIoTDataByDevAddr(Long fromDate, Long toDate, String devAddr) {
		List<Iot> iots = mongoDatastore.find(Iot.class).field("DevEUI_uplink.DevAddr").equalIgnoreCase(devAddr).field("DevEUI_uplink.Time").greaterThanOrEq(new Date(fromDate)).field("DevEUI_uplink.Time").lessThan(new Date(toDate)).asList();
		 return iots;
	}

	public List<Iot> getIoTDataByDevEUI(Long fromDate, Long toDate, String devEUI) {
		List<Iot> iots = mongoDatastore.find(Iot.class).field("DevEUI_uplink.DevEUI").equalIgnoreCase(devEUI).field("DevEUI_uplink.Time").greaterThanOrEq(new Date(fromDate)).field("DevEUI_uplink.Time").lessThan(new Date(toDate)).asList();
		return iots;
	}

	public List<Iot> getIoTData(Long fromDate, Long toDate, String channel, String devAddr, String devEUI) {
		List<Iot> iots = mongoDatastore.find(Iot.class).field("DevEUI_uplink.DevAddr").equalIgnoreCase(devAddr).field("DevEUI_uplink.DevEUI").equalIgnoreCase(devEUI).field("DevEUI_uplink.Time").greaterThanOrEq(new Date(fromDate)).field("DevEUI_uplink.Time").lessThan(new Date(toDate)).asList();
		return iots;
	}

	public List<Lims> getLimsDataByRange(Long fromDate, Long toDate) {
		List<Lims> lims = mongoDatastore.find(Lims.class).field("ITEM_TIMESTAMP").greaterThanOrEq(new Date(fromDate)).field("ITEM_TIMESTAMP").lessThan(new Date(toDate)).asList();
		return lims;
	}

	public List<Lims> getLimsDataBySite(Long fromDate, Long toDate, String site) {
		List<Lims> lims = mongoDatastore.find(Lims.class).field("site").equalIgnoreCase(site).field("ITEM_TIMESTAMP").greaterThanOrEq(new Date(fromDate)).field("ITEM_TIMESTAMP").lessThan(new Date(toDate)).asList();
		return lims;
	}

	public List<Lims> getLimsDataByFactory(Long fromDate, Long toDate, String factory) {
		List<Lims> lims = mongoDatastore.find(Lims.class).field("factory").equalIgnoreCase(factory).field("ITEM_TIMESTAMP").greaterThanOrEq(new Date(fromDate)).field("ITEM_TIMESTAMP").lessThan(new Date(toDate)).asList();
		return lims;
	}

	public List<Lims> getLimsDataByWorkshop(Long fromDate, Long toDate, String workshop) {
		List<Lims> lims = mongoDatastore.find(Lims.class).field("workshop").equalIgnoreCase(workshop).field("ITEM_TIMESTAMP").greaterThanOrEq(new Date(fromDate)).field("ITEM_TIMESTAMP").lessThan(new Date(toDate)).asList();
		return lims;
	}

	public List<Lims> getLimsDataByProductLine(Long fromDate, Long toDate, String productLine) {
		List<Lims> lims = mongoDatastore.find(Lims.class).field("product_line").equalIgnoreCase(productLine).field("ITEM_TIMESTAMP").greaterThanOrEq(new Date(fromDate)).field("ITEM_TIMESTAMP").lessThan(new Date(toDate)).asList();
		return lims;
	}

	public List<Lims> getLimsData(Long fromDate, Long toDate, String site, String factory, String workshop,
			String productLine) {
		List<Lims> lims = mongoDatastore.find(Lims.class).field("site").equalIgnoreCase(site).field("factory").equalIgnoreCase(factory).field("workshop").equalIgnoreCase(workshop).field("product_line").equalIgnoreCase(productLine).field("ITEM_TIMESTAMP").greaterThanOrEq(new Date(fromDate)).field("ITEM_TIMESTAMP").lessThan(new Date(toDate)).asList();
		return lims;
	}

}
