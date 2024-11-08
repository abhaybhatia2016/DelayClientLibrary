package com.Delay.DelayClient;

import org.springframework.web.client.RestClient;

public class DelayClientAPI {

	private RestClient restClient;

	public DelayClientAPI(RestClient restClient) {
		this.restClient = restClient;
	}

	public int delay(int seconds) {
		System.out.println("Received request to delay for "+ seconds+" - Client Library - " + Thread.currentThread());
		var result = restClient
				.get()
				.uri("http://localhost:8081/delay/" + seconds)
				.retrieve()
				.body(Integer.class);
		return result;
	}
}
