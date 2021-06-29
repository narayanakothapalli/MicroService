/**
 * 
 */
package com.example.microservice.currencyexchangeservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Narayana
 *
 */
@RestController
public class CurrencyExchangeService {

	@Autowired
	private Environment environment;
	
    @Autowired
	private CurrencyExchangeRepository repository;

	@GetMapping("currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retriveExchangeValue(@PathVariable String from, @PathVariable String to) {

//		CurrencyExchange  currencyExchange=
//		 new CurrencyExchange(1000L, from, to, BigDecimal.valueOf(50));
		System.out.println(" The parameters retrived from the param Query is **** from :"+from +"***To :"+to);
		CurrencyExchange currencyExchange = repository.findByFromAndTo(from,to);
		if (currencyExchange == null) {
			throw new RuntimeException("Unable to find the data from : " + from + " to : " + to);
		}
		String port = environment.getProperty("local.server.port");
		currencyExchange.setEnvironment(port);
		return currencyExchange;

	}

}
