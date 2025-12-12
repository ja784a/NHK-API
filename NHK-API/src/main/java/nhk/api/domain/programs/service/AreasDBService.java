package nhk.api.domain.programs.service;

import java.util.List;

import nhk.api.domain.programs.model.AreasDB;

public interface AreasDBService {
	public List<AreasDB> getAreas();
	
	public AreasDB getArea(String areaId);
}