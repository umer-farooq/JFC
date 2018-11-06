package data.api.iot.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import data.api.iot.entities.Iot;
import data.api.iot.repository.IoTDataRepository;

@Service
public class IoTDataServiceImpl implements IoTDataService{


	@Autowired
	private IoTDataRepository iotDataRepository;
	
	@Override
	public List<Iot> getIoTDataByRange(Long fromDate, Long toDate) {
		List<Iot> iots = new ArrayList<Iot>();
		try {
			iots = iotDataRepository.getIoTDataByRange(fromDate,toDate);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return iots;
	}

	@Override
	public List<Iot> getIoTDataByChannel(Long fromDate, Long toDate, String channel) {
		List<Iot> iots = new ArrayList<Iot>();
		try {
			iots = iotDataRepository.getIoTDataByChannel(fromDate,toDate,channel);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return iots;
	}

	@Override
	public List<Iot> getIoTDataByDevAddr(Long fromDate, Long toDate, String devAddr) {
		List<Iot> iots = new ArrayList<Iot>();
		try {
			iots = iotDataRepository.getIoTDataByDevAddr(fromDate,toDate,devAddr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return iots;
	}

	@Override
	public List<Iot> getIoTDataByDevEUI(Long fromDate, Long toDate, String devEUI) {
		List<Iot> iots = new ArrayList<Iot>();
		try {
			iots = iotDataRepository.getIoTDataByDevEUI(fromDate,toDate,devEUI);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return iots;
	}

	@Override
	public List<Iot> getIoTData(Long fromDate, Long toDate, String channel, String devAddr, String devEUI) {
		List<Iot> iots = new ArrayList<Iot>();
		try {
			iots = iotDataRepository.getIoTData(fromDate,toDate,channel,devAddr,devEUI);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return iots;
	}
	
}
