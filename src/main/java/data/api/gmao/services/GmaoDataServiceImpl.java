package data.api.gmao.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import data.api.gmao.entites.Gmao;
import data.api.gmao.repository.GmaoDataRepository;


@Service
public class GmaoDataServiceImpl implements GmaoDataService{

	@Autowired
	private GmaoDataRepository gmaoDataRepository;
	
	
	public List<Gmao> getGmaoDataByCreationTime(Long creationTime) {
		List<Gmao> gmaos = new ArrayList<Gmao>();
		try {
			gmaos = gmaoDataRepository.getGmaoDataByCreationTime(creationTime);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return gmaos;
		
	}
	
	public List<Gmao> getGmaoDataByMasterType(Long creationTime, String masterType) {
		List<Gmao> gmaos = new ArrayList<Gmao>();
		try {
			gmaos = gmaoDataRepository.getGmaoDataByMasterType(creationTime,masterType);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return gmaos;
		
	}
	
	public List<Gmao> getGmaoDataByEquipmentOl(Long creationTime, String equipmentOl) {
		List<Gmao> gmaos = new ArrayList<Gmao>();
		try {
			gmaos = gmaoDataRepository.getGmaoDataByEquipmentOl(creationTime,equipmentOl);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return gmaos;
		
	}
	
	public List<Gmao> getGmaoDataByEquipmentNo(Long creationTime, String equipmentNo) {
		List<Gmao> gmaos = new ArrayList<Gmao>();
		try {
			gmaos = gmaoDataRepository.getGmaoDataByEquipmentNo(creationTime,equipmentNo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return gmaos;
		
	}
	
	public List<Gmao> getGmaoDataByEquipmentGroup(Long creationTime, String equipmentGroup) {
		List<Gmao> gmaos = new ArrayList<Gmao>();
		try {
			gmaos = gmaoDataRepository.getGmaoDataByEquipmentGroup(creationTime,equipmentGroup);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return gmaos;
		
	}
	
	public List<Gmao> getGmaoDataByEquipmentGroupDesc(Long creationTime, String equipmentGroupDesc) {
		List<Gmao> gmaos = new ArrayList<Gmao>();
		try {
			gmaos = gmaoDataRepository.getGmaoDataByEquipmentGroupDesc(creationTime,equipmentGroupDesc);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return gmaos;
		
	}
	
	public List<Gmao> getGmaoDataBySiteId(Long creationTime, String siteId) {
		List<Gmao> gmaos = new ArrayList<Gmao>();
		try {
			gmaos = gmaoDataRepository.getGmaoDataBySiteId(creationTime,siteId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return gmaos;
		
	}
	
	public List<Gmao> getGmaoDataByFactoryId(Long creationTime, String factoryId) {
		List<Gmao> gmaos = new ArrayList<Gmao>();
		try {
			gmaos = gmaoDataRepository.getGmaoDataByFactoryId(creationTime,factoryId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return gmaos;
		
	}
	
	public List<Gmao> getGmaoData(Long creationTime, String masterDataType,String equipmentOl,String equipmentNo,String equipmentGroup,String equipmentGroupDesc,String siteId,String factoryId) {
		List<Gmao> gmaos = new ArrayList<Gmao>();
		try {
			gmaos = gmaoDataRepository.getGmaoData(creationTime,masterDataType,equipmentOl,equipmentNo,equipmentGroup,equipmentGroupDesc,siteId,factoryId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return gmaos;
		
	}

}
