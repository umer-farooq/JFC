package data.api.lims.repository;

import java.util.List;

import data.api.lims.entities.Lims;

public interface LimsDataRepository {

	List<Lims> getLimsDataByRange(Long fromDate, Long toDate) throws Exception;

	List<Lims> getLimsDataBySite(Long fromDate, Long toDate, String site) throws Exception;

	List<Lims> getLimsDataByFactory(Long fromDate, Long toDate, String factory) throws Exception;

	List<Lims> getLimsDataByWorkshop(Long fromDate, Long toDate, String workshop) throws Exception;

	List<Lims> getLimsDataByProductLine(Long fromDate, Long toDate, String productLine) throws Exception;

	List<Lims> getLimsData(Long fromDate, Long toDate, String site, String factory, String workshop,
			String productLine) throws Exception;

}
