package com.search.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.search.service.entity.Country;

/**
 * @author M1055705
 *
 */
@Repository
public interface CountryDao extends JpaRepository<Country, Integer>  {
	
}
