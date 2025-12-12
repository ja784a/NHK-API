package nhk.api.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import nhk.api.domain.programs.model.AreasDB;

@Mapper
public interface AreasDBMapper {
	public List<AreasDB> selectAreas();
	
	public AreasDB selectArea(String areaId);
}