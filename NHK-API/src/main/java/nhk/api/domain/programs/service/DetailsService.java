package nhk.api.domain.programs.service;

import java.util.List;

import nhk.api.domain.programs.model.Description;

public interface DetailsService {
	public List<Description> fetchDetails(String area, String service, String id, String apikey);
}