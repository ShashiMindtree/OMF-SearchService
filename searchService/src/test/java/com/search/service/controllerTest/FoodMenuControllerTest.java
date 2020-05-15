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

import com.search.service.controller.FoodMenuController;
import com.search.service.entity.FoodMenu;
import com.search.service.service.FoodMenuService;

@RunWith(MockitoJUnitRunner.class)
public class FoodMenuControllerTest {

	@InjectMocks
	private FoodMenuController foodMenuController;

	@Mock
	private FoodMenuService foodMenuService;
	
	@Test
	public void testSave() {
		FoodMenu foodMenu = build();
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
		when(foodMenuService.save(foodMenu)).thenReturn(foodMenu);
		ResponseEntity<FoodMenu> save = foodMenuController.save(foodMenu);
		assertNotNull(save);
	}
	
	@Test
	public void testUpdate() {
		FoodMenu foodMenu = build();
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
		when(foodMenuService.save(foodMenu)).thenReturn(foodMenu);
		ResponseEntity<FoodMenu> save = foodMenuController.update(foodMenu);
		assertNotNull(save);
	}
	
	@Test
	public void testGetById() {
		FoodMenu foodMenu = build();
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
		when(foodMenuService.findById(foodMenu.getId())).thenReturn(foodMenu);
		FoodMenu byId = foodMenuController.getById(foodMenu.getId());
		assertNotNull(byId);
	}
	
	@Test
	public void testGetAll() {
		List<FoodMenu> foodMenus = new ArrayList<>();
		FoodMenu foodMenu = build();
		foodMenus.add(foodMenu);
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
		when(foodMenuService.getAllFoodByRestaurantId(foodMenu.getRestuarantId())).thenReturn(foodMenus);
		List<FoodMenu> ListFoodMenus = foodMenuController.getAll(foodMenu.getRestuarantId());
		assertNotNull(ListFoodMenus);
	}
	
	private FoodMenu build() {
		FoodMenu foodMenu = new FoodMenu();
		foodMenu.getId();
		foodMenu.setRestuarantId("restuarantId");
		return foodMenu;
		
	}
	
}
