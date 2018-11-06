package data.api.gmao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import data.api.gmao.entites.Gmao;
import data.api.gmao.services.GmaoDataService;

@RestController
@RequestMapping(value="/JFC2/Gmao")
public class GmaoDataController {

	@Autowired
	private GmaoDataService gmaoDataService;
	
	
	@RequestMapping(value="/getGmaoDataByCreationTime/{creationTime}")
	public List<Gmao> getGmaoDataByCreationTime(@PathVariable Long creationTime)
	{
		return gmaoDataService.getGmaoDataByCreationTime(creationTime);
	}
	
	@RequestMapping(value="/getGmaoDataByMasterType/{creationTime}/{masterType}")
	public List<Gmao> getGmaoDataByMasterType(@PathVariable Long creationTime,@PathVariable String masterType)
	{
		return gmaoDataService.getGmaoDataByMasterType(creationTime,masterType);
	}
	
	@RequestMapping(value="/getGmaoDataByEquipmentOl/{creationTime}/{equipmentOl}")
	public List<Gmao> getGmaoDataByEquipmentOl(@PathVariable Long creationTime,@PathVariable String equipmentOl)
	{
		return gmaoDataService.getGmaoDataByEquipmentOl(creationTime,equipmentOl);
	}
	
	@RequestMapping(value="/getGmaoDataByEquipmentNo/{creationTime}/{equipmentNo}")
	public List<Gmao> getGmaoDataByEquipmentNo(@PathVariable Long creationTime,@PathVariable String equipmentNo)
	{
		return gmaoDataService.getGmaoDataByEquipmentNo(creationTime,equipmentNo);
	}
	
	@RequestMapping(value="/getGmaoDataByEquipmentGroup/{creationTime}/{equipmentGroup}")
	public List<Gmao> getGmaoDataByEquipmentGroup(@PathVariable Long creationTime,@PathVariable String equipmentGroup)
	{
		return gmaoDataService.getGmaoDataByEquipmentGroup(creationTime,equipmentGroup);
	}
	
	@RequestMapping(value="/getGmaoDataByEquipmentGroupDesc/{creationTime}/{equipmentGroupDesc}")
	public List<Gmao> getGmaoDataByEquipmentGroupDesc(@PathVariable Long creationTime,@PathVariable String equipmentGroupDesc)
	{
		return gmaoDataService.getGmaoDataByEquipmentGroupDesc(creationTime,equipmentGroupDesc);
	}
	
	@RequestMapping(value="/getGmaoDataBySiteId/{creationTime}/{siteId}")
	public List<Gmao> getGmaoDataBySiteId(@PathVariable Long creationTime,@PathVariable String siteId)
	{
		return gmaoDataService.getGmaoDataBySiteId(creationTime,siteId);
	}
	
	@RequestMapping(value="/getGmaoDataByFactoryId/{creationTime}/{factoryId}")
	public List<Gmao> getGmaoDataByFactoryId(@PathVariable Long creationTime,@PathVariable String factoryId)
	{
		return gmaoDataService.getGmaoDataByFactoryId(creationTime,factoryId);
	}
	
	@RequestMapping(value="/getGmaoData/{creationTime}/{masterDataType}/{equipmentOl}/{equipmentNo}/{equipmentGroup}/{equipmentGroupDesc}/{siteId}/{factoryId}")
	public List<Gmao> getGmaoData(@PathVariable Long creationTime,@PathVariable String masterDataType,@PathVariable String equipmentOl,@PathVariable String equipmentNo,@PathVariable String equipmentGroup,@PathVariable String equipmentGroupDesc,@PathVariable String siteId,@PathVariable String factoryId)
	{
		return gmaoDataService.getGmaoData(creationTime,masterDataType,equipmentOl,equipmentNo,equipmentGroup,equipmentGroupDesc,siteId,factoryId);
	}
}
