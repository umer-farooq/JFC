package data.api.iot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import data.api.iot.entities.Iot;
import data.api.iot.services.IoTDataService;

@RestController
@RequestMapping(value="/JFC2/IndustryData/IoT")
public class IoTDataController {
	
	@Autowired
	private IoTDataService iotDataService;

	@RequestMapping(value="/getIoTDataByRange/{fromDate}/{toDate}")
	public List<Iot> getIoTDataByRange(@PathVariable Long fromDate,@PathVariable Long toDate)
	{
		return iotDataService.getIoTDataByRange(fromDate,toDate);
	}
	
	@RequestMapping(value="/getIoTDataByChannel/{fromDate}/{toDate}/{channel}")
	public List<Iot> getIoTDataByChannel(@PathVariable Long fromDate,@PathVariable Long toDate,@PathVariable String channel)
	{
		return iotDataService.getIoTDataByChannel(fromDate,toDate,channel);
	}
	
	@RequestMapping(value="/getIoTDataByDevAddr/{fromDate}/{toDate}/{devAddr}")
	public List<Iot> getIoTDataByDevAddr(@PathVariable Long fromDate,@PathVariable Long toDate,@PathVariable String devAddr)
	{
		return iotDataService.getIoTDataByDevAddr(fromDate,toDate,devAddr);
	}
	
	@RequestMapping(value="/getIoTDataByDevEUI/{fromDate}/{toDate}/{devEUI}")
	public List<Iot> getIoTDataByDevEUI(@PathVariable Long fromDate,@PathVariable Long toDate,@PathVariable String devEUI)
	{
		return iotDataService.getIoTDataByDevEUI(fromDate,toDate,devEUI);
	}
	
	@RequestMapping(value="/getIoTData/{fromDate}/{toDate}/{channel}/{devAddr}/{devEUI}")
	public List<Iot> getIoTData(@PathVariable Long fromDate,@PathVariable Long toDate,@PathVariable String channel,@PathVariable String devAddr,@PathVariable String devEUI)
	{
		return iotDataService.getIoTData(fromDate,toDate,channel,devAddr,devEUI);
	}
}
