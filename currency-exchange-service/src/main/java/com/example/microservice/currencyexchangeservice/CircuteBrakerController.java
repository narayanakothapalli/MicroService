/**
 * 
 */
package com.example.microservice.currencyexchangeservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.retry.annotation.Retry;





/**
 * @author Narayana
 *
 */
@RestController
public class CircuteBrakerController {
	private Logger logger=LoggerFactory.getLogger(CircuteBrakerController.class); 

	@GetMapping("/sample-api")
	@Retry(name = "default")
	public String sampleApi() {
		logger.info("Sample retry call request recived ********* ");
		ResponseEntity<String> forEntity=new RestTemplate().getForEntity("http://localhost:8080//dummy-url", String.class);
		return forEntity.getBody();
	}

	
}
