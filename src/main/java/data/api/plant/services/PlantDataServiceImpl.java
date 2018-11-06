package data.api.plant.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import data.api.plant.entities.Plant;
import data.api.plant.repository.PlantDataRepository;
import data.api.rules.entities.Rule;

@Service
public class PlantDataServiceImpl implements PlantDataService{
	
	@Autowired
	private PlantDataRepository plantDataRepository;
	
	public List<Plant> getPlantData(String itemId) {
		List<Plant> plants = new ArrayList<Plant>();
		try {
			plants = plantDataRepository.getPlantData(itemId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return plants;	
	}
	
	public List<Plant> getPlantData(String itemId,Long fromDate,Long toDate) {
		List<Plant> plants = new ArrayList<Plant>();
		try {
			plants = plantDataRepository.getPlantData(itemId,fromDate,toDate);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return plants;	
	}

}
