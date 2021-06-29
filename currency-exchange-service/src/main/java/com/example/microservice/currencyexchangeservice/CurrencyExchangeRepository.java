/**
 * 
 */
package com.example.microservice.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Narayana
 *
 */
@Repository
public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {
   CurrencyExchange  findByFromAndTo(String from,String to);
	
}
