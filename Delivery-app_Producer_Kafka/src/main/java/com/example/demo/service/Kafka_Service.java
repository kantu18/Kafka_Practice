package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.configuration.Appconstants;

@Service
public class Kafka_Service {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	private Logger logger=LoggerFactory.getLogger(Kafka_Service.class);
	
	public boolean Update_Details_of_Location(String location)
	{
		this.kafkaTemplate.send(Appconstants.location_update,location);
		logger.info("<-----------------Message Produced--------------------------->");
		return true;
	}
}
