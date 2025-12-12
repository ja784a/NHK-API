package nhk.api.domain.programs.service;

import java.time.LocalDate;
import java.util.List;

import nhk.api.domain.programs.model.Program;

public interface ProgramsService {
	
	public List<Program> fetchPrograms(String area, String service, LocalDate date, String apikey);
}