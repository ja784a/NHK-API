package nhk.api.client;

import java.time.LocalDate;

public interface ExternalApiClient {
	public String getProgramList(String area, String service, LocalDate date, String apikey);
	
}