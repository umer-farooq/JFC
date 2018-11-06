package data.api.iot.services;

import java.util.List;

import data.api.iot.entities.Iot;

public interface IoTDataService {

	List<Iot> getIoTDataByRange(Long fromDate, Long toDate);

	List<Iot> getIoTDataByChannel(Long fromDate, Long toDate, String channel);

	List<Iot> getIoTDataByDevAddr(Long fromDate, Long toDate, String devAddr);

	List<Iot> getIoTDataByDevEUI(Long fromDate, Long toDate, String devEUI);

	List<Iot> getIoTData(Long fromDate, Long toDate, String channel, String devAddr, String devEUI);

}
