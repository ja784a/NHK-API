package nhk.api.domain.programs.service.impl;

import org.springframework.stereotype.Service;

import nhk.api.client.ExternalApiClient;
import nhk.api.domain.programs.service.ProgramsService;

@Service 
public class ProgramsServiceImpl implements ProgramsService {
	
	private final ExternalApiClient apiClient;
	
	public ProgramsServiceImpl(ExternalApiClient apiClient) {
		this.apiClient = apiClient;
	}
	
	public String fetchPrograms(int area, String service, String date, String apikey) {
		return apiClient.getProgramList(area, service, date, apikey);
	}
}