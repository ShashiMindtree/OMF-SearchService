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

import com.search.service.dao.StateDao;
import com.search.service.entity.State;
import com.search.service.serviceImpl.StateServiceimpl;

@RunWith(MockitoJUnitRunner.class)
public class StateServiceimplTest {
	

	@Mock
	private StateDao stateDao;
	
	@InjectMocks
	private StateServiceimpl stateServiceimpl;
	
	@Test
	public void testFindAll() {
		List<State> listOfState = new ArrayList<>();
		State buildData = build();
		listOfState.add(buildData);
		when(stateDao.findAll()).thenReturn(listOfState);
		List<State> states = stateServiceimpl.findAll();
		assertNotNull(states);
	}
	
	@Test
	public void testFindAllStateByCountryCode() {
		List<State> listOfState = new ArrayList<>();
		State buildData = build();
		listOfState.add(buildData);
		when(stateDao.findAllStateByCountryCode(buildData.getCountryId())).thenReturn(listOfState);
		List<State> states = stateServiceimpl.findAllStateByCountryCode(buildData.getCountryId());
		assertNotNull(states);
	}
	
	private State build() {
		State states = new State();
		states.setCountryId("countryId");
		states.setStateId("stateId");
		return states;
}
}
