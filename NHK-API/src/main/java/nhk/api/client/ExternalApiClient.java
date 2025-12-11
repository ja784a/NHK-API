package nhk.api.client;

public interface ExternalApiClient {
	public String getProgramList(int area, String service, String date, String apikey);
	
}