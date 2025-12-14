package nhk.api.client.impl;

import java.time.LocalDate;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import nhk.api.client.ExternalApiClient;

@Component
public class ExternalApiClientImpl implements ExternalApiClient {
	private final WebClient webClient;
	
	public ExternalApiClientImpl(WebClient webClient) {
		this.webClient = webClient;
	}
	
	public String getProgramList(String area, String service, LocalDate date, String apikey) {
		return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/v2/pg/list/{area}/{service}/{date}.json")
                        .queryParam("key", apikey)
                        .build(area, service, date))
                .retrieve()
                .bodyToMono(String.class)
                .block();
	}
	
	public String getDetails(String area, String service, String id, String apikey) {
		return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/v2/pg/info/{area}/{service}/{id}.json")
                        .queryParam("key", apikey)
                        .build(area, service, id))
                .retrieve()
                .bodyToMono(String.class)
                .block();
	}
}