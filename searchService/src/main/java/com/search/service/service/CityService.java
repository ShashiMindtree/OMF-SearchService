package com.search.service.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.search.service.entity.City;

/**
 * @author M1055705
 *
 */
@Component
public interface CityService {
	
	public List<City> findAll();
	
	public List<City> findAllCityByStateCode(String stateCode);

}
