package com.search.service.service;

import org.springframework.stereotype.Component;

/**
 * @author M1055705
 *
 */
@Component
public interface DisatnceCalculatorService {
	
	
	public double getDistanceInKilometer(double lat1, double lon1, double lat2, double lon2, String unit);
	
	

}
