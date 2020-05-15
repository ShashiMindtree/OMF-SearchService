package com.search.service.serviceImplTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.search.service.dao.CityDao;
import com.search.service.entity.City;
import com.search.service.serviceImpl.CityServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class CityServiceImplTest {
	
	@Mock
	private CityDao cityDao;
	
	@InjectMocks
	private CityServiceImpl cityServiceImpl;
	
	@Test
	public void testFindAll() {
		List<City> listOfCity = new ArrayList<>();
		City buildData = build();
		listOfCity.add(buildData);
		when(cityDao.findAll()).thenReturn(listOfCity);
		List<City> city = cityServiceImpl.findAll();
		assertNotNull(city);
	}
	
	@Test
	public void testfindAllCityByStateCode() {
		List<City> listOfCity = new ArrayList<>();
		City buildData = build();
		listOfCity.add(buildData);
		when(cityDao.findAllCityByStateCode(buildData.getStateId())).thenReturn(listOfCity);
		List<City> city = cityServiceImpl.findAllCityByStateCode(buildData.getStateId());
		assertNotNull(city);
	}
	
	private City build() {
		City city = new City();
		city.setCityCode("cityCode");
		city.setStateId("stateId");
		return city;
		
		
	}

}
