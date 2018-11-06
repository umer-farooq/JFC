package data.api.lims.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import data.api.lims.entities.Lims;
import data.api.lims.services.LimsDataService;

@RestController
@RequestMapping(value="/JFC2/Lims")
public class LimsDataController {

	@Autowired
	private LimsDataService limsDataService;

	@RequestMapping(value="/getLimsDataByRange/{fromDate}/{toDate}")
	public List<Lims> getLimsDataByRange(@PathVariable Long fromDate,@PathVariable Long toDate)
	{
		return limsDataService.getLimsDataByRange(fromDate,toDate);
	}
	
	@RequestMapping(value="/getLimsDataBySite/{fromDate}/{toDate}/{site}")
	public List<Lims> getLimsDataBySite(@PathVariable Long fromDate,@PathVariable Long toDate,@PathVariable String site)
	{
		return limsDataService.getLimsDataBySite(fromDate,toDate,site);
	}
	
	@RequestMapping(value="/getLimsDataByFactory/{fromDate}/{toDate}/{factory}")
	public List<Lims> getLimsDataByFactory(@PathVariable Long fromDate,@PathVariable Long toDate,@PathVariable String factory)
	{
		return limsDataService.getLimsDataByFactory(fromDate,toDate,factory);
	}
	
	@RequestMapping(value="/getLimsDataByWorkshop/{fromDate}/{toDate}/{workshop}")
	public List<Lims> getLimsDataByWorkshop(@PathVariable Long fromDate,@PathVariable Long toDate,@PathVariable String workshop)
	{
		return limsDataService.getLimsDataByWorkshop(fromDate,toDate,workshop);
	}
	
	@RequestMapping(value="/getLimsDataByProductLine/{fromDate}/{toDate}/{productLine}")
	public List<Lims> getLimsDataByProductLine(@PathVariable Long fromDate,@PathVariable Long toDate,@PathVariable String productLine)
	{
		return limsDataService.getLimsDataByProductLine(fromDate,toDate,productLine);
	}
	
	@RequestMapping(value="/getLimsData/{fromDate}/{toDate}/{site}/{factory}/{workshop}/{productLine}")
	public List<Lims> getLimsData(@PathVariable Long fromDate,@PathVariable Long toDate,@PathVariable String site,@PathVariable String factory,@PathVariable String workshop,@PathVariable String productLine)
	{
		return limsDataService.getLimsData(fromDate,toDate,site,factory,workshop,productLine);
	}
}
