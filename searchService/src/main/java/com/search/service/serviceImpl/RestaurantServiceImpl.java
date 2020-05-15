package com.search.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.search.service.dao.RestaurantDao;
import com.search.service.entity.Restaurant;
import com.search.service.entity.SearchEntity;
import com.search.service.service.DisatnceCalculatorService;
import com.search.service.service.RestaurantService;

/**
 * @author M1055705
 *
 */
@Service
public class RestaurantServiceImpl implements RestaurantService {

	@Autowired
	private RestaurantDao restaurantDao;

	@Autowired
	private DisatnceCalculatorService distanceCalculatorService;

	@Override
	public Restaurant save(Restaurant restaurant) {
		Restaurant save = new Restaurant(); 
		try {
			save = restaurantDao.save(restaurant);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return save;
	}

	@Override
	public Restaurant updateRestaurant(Restaurant restaurant) {
		Restaurant save = new Restaurant();
		try {
			save = restaurantDao.save(restaurant);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return save;
	}

	@Override
	public void deleteById(int restaurantId) {
		try {
			restaurantDao.deleteById(restaurantId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public Restaurant findById(int restaurantId) {
		Restaurant restaurant =  new Restaurant();
		try {
			restaurant = restaurantDao.findById(restaurantId).get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return restaurant;
	}

	@Override
	public List<Restaurant> getAllRestaurant() {
		List<Restaurant> findAll = new ArrayList<>();
		try {
			findAll = restaurantDao.findAll();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return findAll;
	}

	@Override
	public List<Restaurant> getAllRestaurantbyDistance(SearchEntity userLocation) {
		List<Restaurant> filterdRestaurant = new ArrayList<>();
		try {
			List<Restaurant> listOfRestaurant = restaurantDao.findAll();
			
			if (listOfRestaurant.size() > 0) {
				for (Restaurant restaurant : listOfRestaurant) {
					double distanceInKilometer = distanceCalculatorService.getDistanceInKilometer(
							userLocation.getUserLattitude(), userLocation.getUserLongitude(), restaurant.getLattitude(),
							restaurant.getLattitude(), "K");

					if (Double.compare(distanceInKilometer, userLocation.getKilometerLimit()) <= 0) {
						filterdRestaurant.add(restaurant);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return filterdRestaurant;
	}

}
