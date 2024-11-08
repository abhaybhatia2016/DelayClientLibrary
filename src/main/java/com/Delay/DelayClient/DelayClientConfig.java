package com.Delay.DelayClient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class DelayClientConfig {

	@Bean
	RestClient restClient(RestClient.Builder builder) {
		return builder.build();
	}
}
