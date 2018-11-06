package data.api.lims.services;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import data.api.lims.entities.Lims;
import data.api.lims.repository.LimsDataRepository;

@Service
public class LimsDataServiceImpl implements LimsDataService{

	@Autowired
	private LimsDataRepository limsDataRepository;
	
	@Override
	public List<Lims> getLimsDataByRange(Long fromDate, Long toDate) {
		List<Lims> lims = new ArrayList<Lims>();
		try {
			lims = limsDataRepository.getLimsDataByRange(fromDate,toDate);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lims;
	}
	
	@Override
	public List<Lims> getLimsDataBySite(Long fromDate, Long toDate, String site) {
		List<Lims> lims = new ArrayList<Lims>();
		try {
			lims = limsDataRepository.getLimsDataBySite(fromDate,toDate,site);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lims;
	}
	
	@Override
	public List<Lims> getLimsDataByFactory(Long fromDate, Long toDate, String factory) {
		List<Lims> lims = new ArrayList<Lims>();
		try {
			lims = limsDataRepository.getLimsDataByFactory(fromDate,toDate,factory);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lims;
	}
	
	@Override
	public List<Lims> getLimsDataByWorkshop(Long fromDate, Long toDate, String workshop) {
		List<Lims> lims = new ArrayList<Lims>();
		try {
			lims = limsDataRepository.getLimsDataByWorkshop(fromDate,toDate,workshop);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lims;
	}


	@Override
	public List<Lims> getLimsDataByProductLine(Long fromDate, Long toDate, String productLine) {
		List<Lims> lims = new ArrayList<Lims>();
		try {
			lims = limsDataRepository.getLimsDataByProductLine(fromDate,toDate,productLine);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lims;
	}

	@Override
	public List<Lims> getLimsData(Long fromDate, Long toDate, String site, String factory, String workshop,
			String productLine) {
		List<Lims> lims = new ArrayList<Lims>();
		try {
			lims = limsDataRepository.getLimsData(fromDate,toDate,site,factory,workshop,productLine);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lims;
	}

}
