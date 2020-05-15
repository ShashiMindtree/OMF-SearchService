package com.search.service.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.search.service.entity.State;

/**
 * @author M1055705
 *
 */
@Component
public interface StateService {

	public List<State> findAll();

	public List<State> findAllStateByCountryCode(String countryCode);

}
