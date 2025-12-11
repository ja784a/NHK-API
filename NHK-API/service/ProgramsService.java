package nhk.api.domain.programs.service;

public interface ProgramsService {
	
	public String fetchPrograms(int area, String service, String date, String apikey);
}