package com.search.service.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.search.service.entity.Locality;

/**
 * @author M1055705
 *
 */
@Component
public interface LocalityService {
	
	public List<Locality> findAll();

}
