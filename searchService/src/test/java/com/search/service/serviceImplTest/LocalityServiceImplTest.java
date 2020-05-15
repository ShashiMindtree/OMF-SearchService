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

import com.search.service.dao.LocalityDao;
import com.search.service.entity.Locality;
import com.search.service.serviceImpl.LocalityServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class LocalityServiceImplTest {
	
	@Mock
	private LocalityDao localityDao;
	
	@InjectMocks
	private LocalityServiceImpl localityServiceImpl;

	
	@Test
	public void testFindAll() {
		List<Locality> listOfLocality = new ArrayList<>();
		Locality buildData = build();
		listOfLocality.add(buildData);
		when(localityDao.findAll()).thenReturn(listOfLocality);
		List<Locality> locality = localityServiceImpl.findAll();
		assertNotNull(locality);
	}
	
	private Locality build() {
		Locality locality = new Locality();
		locality.setLocalityId("id");
		locality.setStateId("stateId");
		return locality;
		
		

}
}
