package com.search.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.search.service.dao.CountryDao;
import com.search.service.entity.Country;
import com.search.service.service.CountryService;

/**
 * @author M1055705
 *
 */
@Service
public class CountryServiceImpl implements CountryService{
	@Autowired
	private CountryDao countryDao;

	@Override
	public List<Country> findAll() {
		List<Country> findAll = new ArrayList<>();
		try {
			findAll = countryDao.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return findAll;
	}

}
