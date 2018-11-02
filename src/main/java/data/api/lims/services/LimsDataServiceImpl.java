package data.api.lims.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import data.api.lims.repository.LimsDataRepository;

@Service
public class LimsDataServiceImpl implements LimsDataService{

	@Autowired
	private LimsDataRepository limsDataRepository;
}
