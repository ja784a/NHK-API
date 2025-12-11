package nhk.api.client;

public interface ExternalApiClient {
	String getProgramList(int area, String service, String date, String apikey);
	
}