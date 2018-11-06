package data.api.plant.repository;

import java.util.List;

import data.api.plant.entities.Plant;

public interface PlantDataRepository {

	List<Plant> getPlantData(String itemId, Long fromDate, Long toDate) throws Exception;

	List<Plant> getPlantData(String itemId) throws Exception;

}
