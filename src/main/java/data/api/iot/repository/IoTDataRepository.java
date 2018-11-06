package data.api.iot.repository;

import java.util.List;

import data.api.iot.entities.Iot;

public interface IoTDataRepository {

	List<Iot> getIoTData(Long fromDate, Long toDate, String channel, String devAddr, String devEUI) throws Exception;

	List<Iot> getIoTDataByDevEUI(Long fromDate, Long toDate, String devEUI) throws Exception;

	List<Iot> getIoTDataByDevAddr(Long fromDate, Long toDate, String devAddr) throws Exception;

	List<Iot> getIoTDataByChannel(Long fromDate, Long toDate, String channel) throws Exception;

	List<Iot> getIoTDataByRange(Long fromDate, Long toDate) throws Exception;

}
