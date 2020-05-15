package com.search.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.search.service.dao.StateDao;
import com.search.service.entity.State;
import com.search.service.service.StateService;

/**
 * @author M1055705
 *
 */
@Service
public class StateServiceimpl implements StateService{
	
	@Autowired
	private StateDao stateDao;

	@Override
	public List<State> findAll() {
		List<State> findAll = new ArrayList<>();
		try {
			findAll = stateDao.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return findAll;
	}
	
	@Override
	public List<State> findAllStateByCountryCode(String countryCode) {
		List<State> findAllStateByCountryCode = new ArrayList<>();
		try {
			findAllStateByCountryCode = stateDao.findAllStateByCountryCode(countryCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return findAllStateByCountryCode;
	}

}
