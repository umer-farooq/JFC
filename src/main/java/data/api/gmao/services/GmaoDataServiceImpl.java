package data.api.gmao.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import data.api.gmao.repository.GmaoDataRepository;


@Service
public class GmaoDataServiceImpl implements GmaoDataService{

	@Autowired
	private GmaoDataRepository gmaoDataRepository;
}
