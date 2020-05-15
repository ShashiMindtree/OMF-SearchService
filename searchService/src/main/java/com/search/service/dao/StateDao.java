package com.search.service.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.search.service.entity.State;

/**
 * @author M1055705
 *
 */
@Repository
public interface StateDao extends JpaRepository<State, Integer> {

	@Query(value = "SELECT * FROM States WHERE country_code = ?1", nativeQuery = true)
	public List<State> findAllStateByCountryCode(String countryCode);

}
