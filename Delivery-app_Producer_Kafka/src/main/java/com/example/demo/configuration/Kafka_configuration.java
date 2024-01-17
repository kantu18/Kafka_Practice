package com.example.demo.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class Kafka_configuration {

	@Bean
	public NewTopic createTopic()
	{
		return TopicBuilder.name(Appconstants.location_update).build();
	}
}
