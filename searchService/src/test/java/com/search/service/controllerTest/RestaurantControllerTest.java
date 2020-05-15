package com.search.service.controllerTest;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.search.service.controller.RestaurantController;
import com.search.service.entity.Restaurant;
import com.search.service.service.RestaurantService;

@RunWith(MockitoJUnitRunner.class)
public class RestaurantControllerTest {
	
	@InjectMocks
	private RestaurantController restaurantController;
	
	@Mock
	private RestaurantService restaurantService;
	
	@Test
	public void testSave() {
		Restaurant restaurant = build();
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
		when(restaurantService.save(restaurant)).thenReturn(restaurant);
		ResponseEntity<Restaurant> save = restaurantController.save(restaurant);
		assertNotNull(save);
	}
	
	@Test
	public void testupdate() {
		Restaurant restaurant = build();
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
		when(restaurantService.save(restaurant)).thenReturn(restaurant);
		ResponseEntity<Restaurant> save = restaurantController.update(restaurant);
		assertNotNull(save);
	}
	
	@Test
	public void testGetRestaurantById() {
		Restaurant restaurant = build();
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
		when(restaurantService.findById(1)).thenReturn(restaurant);
		Restaurant byId = restaurantController.getById(1);
		assertNotNull(byId);
	}
	
	@Test
	public void testGetAllRestaurant() {
		List<Restaurant> list = new ArrayList<>();
		Restaurant restaurant = build();
		list.add(restaurant);
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
		when(restaurantService.getAllRestaurant()).thenReturn(list);
		List<Restaurant> all = restaurantController.getAll();
		assertNotNull(all);
	}
	
	
	private Restaurant build() {
		Restaurant restaurant = new Restaurant();
		restaurant.setRestuarantId("restuarantId");
		return restaurant;
	}

}
