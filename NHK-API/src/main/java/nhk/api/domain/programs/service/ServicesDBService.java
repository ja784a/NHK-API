package nhk.api.domain.programs.service;

import java.util.List;

import nhk.api.domain.programs.model.ServicesDB;

public interface ServicesDBService {
	public List<ServicesDB> getServices();
	
	public ServicesDB getService(String serviceId);
}