/**
 * 
 */
package com.example.microservice.currencyconversionservice;

import java.math.BigDecimal;

/**
 * @author Narayana
 *
 */
public class CurrencyConversion {
	
	private long id;
	private String from;
	private String to;
	private BigDecimal quantity;
	private BigDecimal conversionMultiple;	
	private BigDecimal totalCalculatedAmout;
	private String environment;
	public CurrencyConversion(long id, String from, String to, BigDecimal quantity, BigDecimal conversionMultiple,
			BigDecimal totalCalculatedAmout, String environment) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.quantity = quantity;
		this.conversionMultiple = conversionMultiple;		
		this.totalCalculatedAmout = totalCalculatedAmout;
		this.environment = environment;
	}
	public CurrencyConversion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getTotalCalculatedAmout() {
		return totalCalculatedAmout;
	}
	public void setTotalCalculatedAmout(BigDecimal totalCalculatedAmout) {
		this.totalCalculatedAmout = totalCalculatedAmout;
	}
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}

}
