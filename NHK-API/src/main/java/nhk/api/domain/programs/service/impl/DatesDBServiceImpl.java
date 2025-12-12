package nhk.api.domain.programs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nhk.api.domain.programs.model.DatesDB;
import nhk.api.domain.programs.service.DatesDBService;
import nhk.api.repository.DatesDBMapper;

@Service
public class DatesDBServiceImpl implements DatesDBService {
	@Autowired
	private DatesDBMapper mapper;
	
	@Override
	public List<DatesDB> getDates() {
		return mapper.selectDates();
	}
}