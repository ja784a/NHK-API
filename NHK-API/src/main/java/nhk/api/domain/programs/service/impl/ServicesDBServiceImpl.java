package nhk.api.domain.programs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nhk.api.domain.programs.model.ServicesDB;
import nhk.api.domain.programs.service.ServicesDBService;
import nhk.api.repository.ServicesDBMapper;

@Service
public class ServicesDBServiceImpl implements ServicesDBService {
	@Autowired
	private ServicesDBMapper mapper;
	
	@Override
	public List<ServicesDB> getServices() {
		return mapper.selectServices();
	}
	
	@Override
	public ServicesDB getService(String serviceId) {
		return mapper.selectService(serviceId);
	}
}