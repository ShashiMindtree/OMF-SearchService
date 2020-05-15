package com.search.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.search.service.dao.FoodMenuDao;
import com.search.service.entity.FoodMenu;
import com.search.service.service.FoodMenuService;

/**
 * @author M1055705
 *
 */
@Service
public class FoodMenuServiceImpl implements FoodMenuService{
	
	@Autowired
	private FoodMenuDao foodMenuDao;

	@Override
	public FoodMenu save(FoodMenu food) {
		FoodMenu save = new FoodMenu(); 
		try {
			 save = foodMenuDao.save(food);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return save;
	}

	@Override
	public FoodMenu updateFood(FoodMenu food) {
		FoodMenu update = new FoodMenu();
		try {
			update = foodMenuDao.save(food);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return update;
	}

	@Override
	public void deleteById(int foodMenuId) {
		try {
			foodMenuDao.deleteById(foodMenuId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public FoodMenu findById(int foodMenuId) {
		FoodMenu foodMenu = new FoodMenu();
		try {
			foodMenu = foodMenuDao.findById( foodMenuId).get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return  foodMenu;
	}

	@Override
	public List<FoodMenu> getAllFoodByRestaurantId(String restuarantId) {
		List<FoodMenu> allFoodByRestaurantId = new ArrayList<>();
		try {
			allFoodByRestaurantId =foodMenuDao.getAllFoodByRestaurantId(restuarantId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return allFoodByRestaurantId;
	}

}
