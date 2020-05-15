package com.search.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.search.service.dao.LocalityDao;
import com.search.service.entity.Locality;
import com.search.service.service.LocalityService;


/**
 * @author M1055705
 *
 */
@Service
public class LocalityServiceImpl implements LocalityService{
	
	@Autowired
	private LocalityDao localityDao;

	@Override
	public List<Locality> findAll() {
		List<Locality> findAll = new ArrayList<>();
		try {
			 localityDao.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return findAll;
	}
	
	

}
