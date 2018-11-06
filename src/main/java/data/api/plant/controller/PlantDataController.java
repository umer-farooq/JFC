package data.api.plant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import data.api.plant.entities.Plant;
import data.api.plant.services.PlantDataService;

@RestController
@RequestMapping(value="/JFC2/IndustryData/Plant")
public class PlantDataController {

	@Autowired
	private PlantDataService plantDataService;
	
	
	@RequestMapping(value="/getPlantsData/{itemId}")
	public List<Plant> getPlantData(@PathVariable String itemId)
	{
		return plantDataService.getPlantData(itemId);
	}
	
	@RequestMapping(value="/getPlantsDataByRange/{itemId}/{fromDate}/{toDate}")
	public List<Plant> getPlantData(@PathVariable String itemId,@PathVariable Long fromDate,@PathVariable Long toDate)
	{
		return plantDataService.getPlantData(itemId,fromDate,toDate);
	}
}
