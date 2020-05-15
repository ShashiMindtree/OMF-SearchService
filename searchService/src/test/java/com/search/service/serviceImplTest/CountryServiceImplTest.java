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

import com.search.service.dao.CountryDao;
import com.search.service.entity.Country;
import com.search.service.serviceImpl.CountryServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class CountryServiceImplTest {
		
		@Mock
		private CountryDao countryDao;
		
		@InjectMocks
		private CountryServiceImpl countryServiceImpl;
		
		@Test
		public void testFindAll() {
			List<Country> listOfCountry = new ArrayList<>();
			Country buildData = build();
			listOfCountry.add(buildData);
			when(countryDao.findAll()).thenReturn(listOfCountry);
			List<Country> country = countryServiceImpl.findAll();
			assertNotNull(country);
		}
		
		private Country build() {
			Country country = new Country();
			country.setCountryId("countryId");
			country.setCountryCode("countryCode");
			return country;
			
			

	}

}
