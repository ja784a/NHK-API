package nhk.api.domain.programs.service;

import java.util.List;

import nhk.api.domain.programs.model.Program;

public interface ProgramsService {
	
	public List<Program> fetchPrograms(int area, String service, String date, String apikey);
}