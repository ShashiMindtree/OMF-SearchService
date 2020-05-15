package com.search.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.search.service.entity.Restaurant;
/**
 * @author M1055705
 *
 */
@Repository
public interface RestaurantDao extends JpaRepository<Restaurant, Integer>{

	
}
