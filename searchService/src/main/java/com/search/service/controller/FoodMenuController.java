package com.search.service.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.search.service.entity.FoodMenu;
import com.search.service.service.FoodMenuService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author M1055705
 *
 */
@Api(value = "FoodMenuController", description = "Food Menu REST Apis")
@RestController
@RequestMapping(value = "/foodmenu/v1")
public class FoodMenuController {

	@Autowired
	private FoodMenuService foodMenuService;

	@ApiOperation(value = "save food menu ", response = FoodMenu.class, tags = "save")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Suceess|OK"),
			@ApiResponse(code = 401, message = "not authorized!"), 
			@ApiResponse(code = 404, message = "not found!!!") })
	@PostMapping(value = "/add")
	public ResponseEntity<FoodMenu> save(@RequestBody FoodMenu food) {
		FoodMenu saved = new FoodMenu();
		try {
			saved = foodMenuService.save(food);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return saved != null ? new ResponseEntity<FoodMenu>(HttpStatus.OK)
				: new ResponseEntity<FoodMenu>(HttpStatus.BAD_REQUEST);

	}

	@ApiOperation(value = "delete food menu ", response = FoodMenu.class, tags = "delete")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Suceess|OK"),
			@ApiResponse(code = 401, message = "not authorized!"),
			@ApiResponse(code = 404, message = "not found!!!") })
	@DeleteMapping(value = "/delete/{foodMenuId}")
	public void delete(@PathVariable(name = "foodMenuId") int foodMenuId) {
		try {
			foodMenuService.deleteById(foodMenuId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@ApiOperation(value = "update food menu ", response = FoodMenu.class, tags = "update")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Suceess|OK"),
			@ApiResponse(code = 401, message = "not authorized!"),
			@ApiResponse(code = 404, message = "not found!!!") })
	@PutMapping(value = "/update")
	public ResponseEntity<FoodMenu> update(@RequestBody FoodMenu food) {
		FoodMenu updated = new FoodMenu();
		try {
			updated = foodMenuService.save(food);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return updated != null ? new ResponseEntity<FoodMenu>(HttpStatus.OK)
				: new ResponseEntity<FoodMenu>(HttpStatus.BAD_REQUEST);
	}

	@ApiOperation(value = "get food menu by food menu id ", response = FoodMenu.class, tags = "get")
	@GetMapping(value = "/get/{foodMenuId}")
	public FoodMenu getById(@PathVariable(name = "foodMenuId") int foodMenuId) {
		FoodMenu findById = new FoodMenu();
		try {
			findById = foodMenuService.findById(foodMenuId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return findById;
	}

	@ApiOperation(value = "get food menu by restaurant id ", response = FoodMenu.class, tags = "getAll")
	@GetMapping(value = "/getAll/{restaurantId}")
	public List<FoodMenu> getAll(@PathVariable(name = "restaurantId") String restaurantId) {
		List<FoodMenu> allFoodByRestaurantId = new ArrayList<>();
		try {
			allFoodByRestaurantId = foodMenuService.getAllFoodByRestaurantId(restaurantId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return allFoodByRestaurantId;
	}

}
