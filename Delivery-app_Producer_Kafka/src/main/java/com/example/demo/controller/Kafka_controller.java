package com.example.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.Kafka_Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")
public class Kafka_controller {

	@Autowired
	private Kafka_Service kafka_Service;
	
	@PostMapping("/sendupdates")
	public ResponseEntity<?> sendLocUpdates() throws InterruptedException
	{
		for(int i=0;i<100;i++)
		{
		Thread.sleep(800);
		this.kafka_Service.Update_Details_of_Location(" (" + Math.round(Math.random()*100) + "," +Math.round(Math.random()*100)+ ") ");
		}
		
		return new ResponseEntity<>(Map.of("Message","Location has been updated"),HttpStatus.OK);
	}
	
}
