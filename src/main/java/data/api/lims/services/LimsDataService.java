package data.api.lims.services;

import java.util.List;

import data.api.lims.entities.Lims;

public interface LimsDataService {

	List<Lims> getLimsData(Long fromDate, Long toDate, String site, String factory, String workshop,
			String productLine);

	List<Lims> getLimsDataByProductLine(Long fromDate, Long toDate, String productLine);

	List<Lims> getLimsDataByWorkshop(Long fromDate, Long toDate, String workshop);

	List<Lims> getLimsDataByFactory(Long fromDate, Long toDate, String factory);

	List<Lims> getLimsDataBySite(Long fromDate, Long toDate, String site);

	List<Lims> getLimsDataByRange(Long fromDate, Long toDate);

}
