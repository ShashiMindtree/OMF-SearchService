package com.search.service.service;

import java.util.List;

import com.search.service.entity.FoodMenu;

/**
 * @author M1055705
 *
 */
public interface FoodMenuService {
	
	public FoodMenu save(FoodMenu food);

	public FoodMenu updateFood(FoodMenu food);

	public void deleteById(int foodMenuId);

	public FoodMenu findById(int foodMenuId);

	public List<FoodMenu> getAllFoodByRestaurantId(String restuarantId);
	
}
