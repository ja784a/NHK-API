package nhk.api.domain.programs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nhk.api.client.ExternalApiClient;
import nhk.api.domain.programs.model.Description;
import nhk.api.domain.programs.model.DetailsFileData;
import nhk.api.domain.programs.service.DetailsService;
import tools.jackson.databind.ObjectMapper;

@Service
public class DetailsServiceImpl implements DetailsService {
	@Autowired
	private ExternalApiClient apiClient;
	
	public List<Description> fetchDetails(String area, String service, String id, String apikey) {
		String details = apiClient.getDetails(area, service, id, apikey);
		
		ObjectMapper mapper = new ObjectMapper();
		
		DetailsFileData data = mapper.readValue(details, DetailsFileData.class);
		List<Description> description = data.getList().get(service);
		
		return description;
		
		
	}
}