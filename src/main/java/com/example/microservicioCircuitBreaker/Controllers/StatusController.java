package com.example.microservicioCircuitBreaker.Controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


 enum Status
{ OPEN,CLOSE,HALFOPEN};


@RestController
public class StatusController {
	
	Status status;
	
	final static Logger logger = LoggerFactory.getLogger(StatusController.class);
	
	@GetMapping(path = "/status/open")
	public String open()
	{
		status = status.OPEN;
		logger.info("llamada status OPEN");
		return "OPEN";
		
	}
	@GetMapping(path = "/status/close")
	public String close()
	{
		status = status.CLOSE;
		logger.info("llamada status CLOSE");
		return "CLOSE";
	}
		
	
	@GetMapping(path = "/status/half")
	public String halfopen()
	{
		status = status.HALFOPEN;
		logger.info("llamada status HALF-OPEN");
		return "HALFOPEN";
		
	}
	
	
	

}
