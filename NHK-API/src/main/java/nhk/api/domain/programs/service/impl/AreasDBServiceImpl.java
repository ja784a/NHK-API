package nhk.api.domain.programs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nhk.api.domain.programs.model.AreasDB;
import nhk.api.domain.programs.service.AreasDBService;
import nhk.api.repository.AreasDBMapper;

@Service
public class AreasDBServiceImpl implements AreasDBService {
	@Autowired
	private AreasDBMapper mapper;
	
	@Override
	public List<AreasDB> getAreas() {
		return mapper.selectAreas();
	}
	
	@Override
	public AreasDB getArea(String areaId) {
		return mapper.selectArea(areaId);
	}
}