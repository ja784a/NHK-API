package nhk.api.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import nhk.api.domain.programs.model.DatesDB;

@Mapper
public interface DatesDBMapper {
	public List<DatesDB> selectDates();
}