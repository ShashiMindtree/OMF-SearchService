package com.search.service.controllerTest;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.search.service.controller.LocationController;
import com.search.service.entity.City;
import com.search.service.entity.Country;
import com.search.service.entity.Locality;
import com.search.service.entity.State;
import com.search.service.service.CityService;
import com.search.service.service.CountryService;
import com.search.service.service.LocalityService;
import com.search.service.service.StateService;

@RunWith(MockitoJUnitRunner.class)
public class LocationControllerTest {
	
	@InjectMocks
	private LocationController locationController;
	
	@Mock
	private CountryService countryService;
	
	@Mock
	private StateService stateService;
	
	@Mock
	private CityService cityService;
	
	@Mock
	private LocalityService localityService;
	
	
	@Test
	public void testGetAllCountry() {
		List<Country> list = new ArrayList<>();
		Country country = new Country();
		country.setCountryCode("countryCode");
		list.add(country);
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
		when(countryService.findAll()).thenReturn(list);
		List<Country> countrys = locationController.loadCountry();
		assertNotNull(countrys);
	}
	
	@Test
	public void testGetAllState() {
		List<State> list = new ArrayList<>();
		State state = new State();
		state.setStateCode("stateCode");
		list.add(state);
		
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
		when(stateService.findAll()).thenReturn(list);
		List<State> loadState = locationController.loadState();
		assertNotNull(loadState);
	}
	
	@Test
	public void testGetAllCity() {
		List<City> list = new ArrayList<>();
		City city = new City();
		city.setCityCode("cityCode");
		list.add(city);
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
		when(cityService.findAll()).thenReturn(list);
		List<City> loadCity = locationController.loadCity();
		assertNotNull(loadCity);
	}
	
	@Test
	public void testGetAllLocality() {
		List<Locality> localities = new ArrayList<>();
		Locality locality =  new Locality();
		locality.setStateId("stateId");
		localities.add(locality);
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
		when(localityService.findAll()).thenReturn(localities);
		List<Locality> loadLocality = locationController.loadLocality();
		assertNotNull(loadLocality);
	}

	

}
