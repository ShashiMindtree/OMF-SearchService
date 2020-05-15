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

import com.search.service.dao.FoodMenuDao;
import com.search.service.entity.FoodMenu;
import com.search.service.serviceImpl.FoodMenuServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class FoodMenuServiceImplTest {
	
	@Mock
	private FoodMenuDao foodMenuDao;
	
	@InjectMocks
	private FoodMenuServiceImpl foodServiceImpl;
	
	@Test
	public void testSave() {
		FoodMenu buildData = build();
		when(foodMenuDao.save(buildData)).thenReturn(buildData);
		FoodMenu foodMenu = foodServiceImpl.save(buildData);
		assertNotNull(foodMenu);
	}
	
	@Test
	public void testUpdate() {
		FoodMenu buildData = build();
		when(foodMenuDao.save(buildData)).thenReturn(buildData);
		FoodMenu foodMenu = foodServiceImpl.updateFood(buildData);
		assertNotNull(foodMenu);
	}
	
	@Test
	public void testFindById() {
		FoodMenu buildData = build();
		when(foodMenuDao.findById(buildData.getId()).get()).thenReturn(buildData);
		FoodMenu foodMenu = foodServiceImpl.findById(buildData.getId());
		assertNotNull(foodMenu);
	}
	
	@Test
	public void testGetAllFoodByRestaurantId() {
		List<FoodMenu> list = new ArrayList<>();
		FoodMenu buildData = build();
		when(foodMenuDao.getAllFoodByRestaurantId(buildData.getRestuarantId())).thenReturn(list);
		List<FoodMenu> foodMenu = foodServiceImpl.getAllFoodByRestaurantId(buildData.getRestuarantId());
		assertNotNull(foodMenu);
	}
	
	private FoodMenu build() {
		FoodMenu food = new FoodMenu();
		food.setName("name");
		food.setPrice(100);
		food.setRestuarantId("restuarantId");
		food.setId(1);
		return food;
}

}
