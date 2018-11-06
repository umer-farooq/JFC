package data.api.plant.services;

import java.util.List;

import data.api.plant.entities.Plant;

public interface PlantDataService {

	List<Plant> getPlantData(String itemId, Long fromDate, Long toDate);

	List<Plant> getPlantData(String itemId);

}
