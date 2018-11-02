package data.api.plant.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import data.api.plant.repository.PlantDataRepository;

@Service
public class PlantDataServiceImpl implements PlantDataService{
	
	@Autowired
	private PlantDataRepository plantDataRepository;
	

}
