package com.search.service.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.search.service.entity.City;
import com.search.service.entity.Country;
import com.search.service.entity.Locality;
import com.search.service.entity.State;
import com.search.service.service.CityService;
import com.search.service.service.CountryService;
import com.search.service.service.LocalityService;
import com.search.service.service.StateService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author M1055705
 *
 */
@RestController
@RequestMapping(value = "/location/v1")
@Api(value = "LocationController", description = "search Location REST Apis")
public class LocationController {
	
	
	@Autowired
	private CountryService countryService;
	
	@Autowired
	private StateService stateService;
	
	@Autowired
	private CityService cityService;
	
	@Autowired
	private LocalityService localityService;
	
		@GetMapping(value = "/getallcountry")
		@ApiOperation(value = "get all country", response = Country.class, tags = "get")
		public  List<Country> loadCountry() {
			List<Country> findAll = new ArrayList<>();
			try {
				 findAll = countryService.findAll();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return findAll;

		}
		
		@GetMapping(value = "/getallstate")
		@ApiOperation(value = "get all state", response = State.class, tags = "get")
		public  List<State> loadState() {
			List<State> findAll = new ArrayList<>();
			try {
				findAll = stateService.findAll();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return findAll;
			
		}
		
		@GetMapping(value = "/getallcity")
		@ApiOperation(value = "get all city", response = City.class, tags = "get")
		public  List<City> loadCity() {
			List<City> findAll  = new ArrayList<>();
			try {
				findAll = cityService.findAll();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return findAll;
			
		}
		
		@GetMapping(value = "/getalllocality")
		@ApiOperation(value = "get all locality", response = Locality.class, tags = "get")
		public  List<Locality> loadLocality() {
			List<Locality> findAll = new ArrayList<>();
			try {
				findAll = localityService.findAll();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return findAll;
			
		}

}
