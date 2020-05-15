package com.search.service.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.search.service.entity.City;

/**
 * @author M1055705
 *
 */
@Repository
public interface CityDao extends JpaRepository<City, Integer> {

	@Query(value = "SELECT * FROM City WHERE state_code = ?1", nativeQuery = true)
	public List<City> findAllCityByStateCode(String stateCode);

}
