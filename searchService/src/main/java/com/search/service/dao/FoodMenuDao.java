package com.search.service.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.search.service.entity.FoodMenu;

/**
 * @author M1055705
 *
 */
@Repository
public interface FoodMenuDao extends JpaRepository<FoodMenu, Integer>{

	@Query(value = "SELECT * FROM Food WHERE restuarant_id = ?1", nativeQuery = true)
	public List<FoodMenu> getAllFoodByRestaurantId(String restuarantId);

}
