package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class Kafka_Consumer_cnfiguration {

	@KafkaListener(topics = Appconstants.Location_update, groupId = Appconstants.Group_details)
	public void showdetails(String message)
	{
		System.out.print(message);
	}
}
