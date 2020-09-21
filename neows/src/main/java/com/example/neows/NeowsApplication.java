package com.example.neows;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class NeowsApplication {

	public static void main(String[] args) {
		SpringApplication.run(NeowsApplication.class, args);
		getNeoWS();
	}

	public static void getNeoWS() {
		String uri = "https://api.nasa.gov/neo/rest/v1/feed?start_date=2020-09-07&end_date=2020-09-07&api_key=[API-KEY]";
		
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		System.out.println(result);
	}
}
