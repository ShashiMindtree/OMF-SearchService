package com.search.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.search.service.entity.Locality;
/**
 * @author M1055705
 *
 */
@Repository
public interface LocalityDao extends JpaRepository<Locality, Integer>{
	

}
