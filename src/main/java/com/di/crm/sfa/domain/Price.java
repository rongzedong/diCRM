package com.di.crm.sfa.domain;

import java.util.Date;
import com.di.util.Currency;

/**
 * Quote에서 설정한 값~
 * 
 * @author hyun
 *
 */
public class Price {
	private String rowId;
	
	private Currency currency;
	private Double price;
	
	private Date lastUpdated;
	private Date createDated;
}
