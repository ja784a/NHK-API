package nhk.api.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import nhk.api.domain.programs.model.ServicesDB;

@Mapper
public interface ServicesDBMapper {
	public List<ServicesDB> selectServices();
	
	public ServicesDB selectService(String serviceId);
}