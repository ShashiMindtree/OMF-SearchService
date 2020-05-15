package com.search.service.serviceImplTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.search.service.dao.RestaurantDao;
import com.search.service.entity.Restaurant;
import com.search.service.serviceImpl.RestaurantServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class RestaurantServiceImplTest {
	
	@Mock
	private RestaurantDao restaurantDao;
	
	@InjectMocks
	private RestaurantServiceImpl reestaurantServiceImpl;

	
	@Test
	public void testSave() {
		Restaurant buildData = build();
		when(restaurantDao.save(buildData)).thenReturn(buildData);
		Restaurant Restaurant = reestaurantServiceImpl.save(buildData);
		assertNotNull(Restaurant);
	}
	
	@Test
	public void testUpdate() {
		Restaurant buildData = build();
		when(restaurantDao.save(buildData)).thenReturn(buildData);
		Restaurant Restaurant = reestaurantServiceImpl.updateRestaurant(buildData);
		assertNotNull(Restaurant);
	}
	
	@Test
	public void testFindById() {
		Restaurant buildData = build();
		when(restaurantDao.findById(buildData.getId()).get()).thenReturn(buildData);
		Restaurant Restaurant = reestaurantServiceImpl.findById(buildData.getId());
		assertNotNull(Restaurant);
	}
	
	@Test
	public void testGetAllRestaurant() {
		List<Restaurant> list = new ArrayList<>();
		Restaurant buildData = build();
		list.add(buildData);
		when(restaurantDao.findAll()).thenReturn(list);
		List<Restaurant> Restaurant = reestaurantServiceImpl.getAllRestaurant();
		assertNotNull(Restaurant);
	}
	
	private Restaurant build() {
		Restaurant restaurant = new Restaurant();
		restaurant.setEmailId("emailId");
		restaurant.setRestuarantId("restuarantId");
		return restaurant;
	}
}
