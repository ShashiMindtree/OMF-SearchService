package com.search.service.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.search.service.entity.SearchEntity;
import com.search.service.entity.Restaurant;

/**
 * @author M1055705
 *
 */
@Component
public interface RestaurantService {

	public Restaurant save(Restaurant restaurant);

	public Restaurant updateRestaurant(Restaurant restaurant);

	public void deleteById(int restaurantId);

	public Restaurant findById(int restaurantId);

	public List<Restaurant> getAllRestaurant();
	
	public List<Restaurant> getAllRestaurantbyDistance(SearchEntity distance);

}
