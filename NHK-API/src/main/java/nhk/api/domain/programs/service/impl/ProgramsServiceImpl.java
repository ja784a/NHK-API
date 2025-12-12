package nhk.api.domain.programs.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nhk.api.client.ExternalApiClient;
import nhk.api.domain.programs.model.JsonFileData;
import nhk.api.domain.programs.model.Program;
import nhk.api.domain.programs.service.ProgramsService;
import tools.jackson.databind.ObjectMapper;

@Service
public class ProgramsServiceImpl implements ProgramsService {
	@Autowired
	private ExternalApiClient apiClient;
	
	public List<Program> fetchPrograms(String area, String service, LocalDate date, String apikey) {
		String programList = apiClient.getProgramList(area, service, date, apikey);
		
		ObjectMapper mapper = new ObjectMapper();
		
		JsonFileData data = mapper.readValue(programList, JsonFileData.class);
		List<Program> programs = data.getList().get(service);
		
		return programs;
		
		
	}
}