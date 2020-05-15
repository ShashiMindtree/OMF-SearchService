package com.search.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.search.service.dao.CityDao;
import com.search.service.entity.City;
import com.search.service.service.CityService;

/**
 * @author M1055705
 *
 */
@Service
public class CityServiceImpl implements CityService{
	
	@Autowired
	private CityDao cityDao;

	@Override
	public List<City> findAll() {
		List<City> findAll =  new ArrayList<>();
		try {
			findAll = cityDao.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return findAll;
	}

	@Override
	public List<City> findAllCityByStateCode(String stateCode) {
		List<City> findAllCityByStateCode = new ArrayList<>();
		try {
			findAllCityByStateCode = cityDao.findAllCityByStateCode(stateCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return findAllCityByStateCode;
	}

}
