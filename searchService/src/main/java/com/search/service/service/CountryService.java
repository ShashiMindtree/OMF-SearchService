package com.search.service.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.search.service.entity.Country;

/**
 * @author M1055705
 *
 */
@Component
public interface CountryService {
	
	public List<Country> findAll();
	

}
