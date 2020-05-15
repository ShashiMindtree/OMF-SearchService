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

import com.search.service.entity.Restaurant;
import com.search.service.entity.SearchEntity;
import com.search.service.service.RestaurantService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author M1055705
 *
 */
@RestController
@RequestMapping(value = "/restaurant/v1")
@Api(value = "RestaurantController", description = "Restaurant REST Apis")
public class RestaurantController {

	@Autowired
	private RestaurantService restaurantService;

	@ApiOperation(value = "save restaurant ", response = Restaurant.class, tags = "save")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Suceess|OK"),
			@ApiResponse(code = 401, message = "not authorized!"), 
			@ApiResponse(code = 404, message = "not found!!!") })
	@PostMapping(value = "/add")
	public ResponseEntity<Restaurant> save(@RequestBody Restaurant restaurant) {
		Restaurant saved =  new Restaurant(); 
		try {
			saved = restaurantService.save(restaurant);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return saved != null ? new ResponseEntity<Restaurant>(HttpStatus.OK)
				: new ResponseEntity<Restaurant>(HttpStatus.BAD_REQUEST);

	}

	@ApiOperation(value = "delete restaurant by id", response = Restaurant.class, tags = "delete")
	@DeleteMapping(value = "/delete/{restuarantId}")
	public void delete(@PathVariable(name = "restuarantId") int restuarantId) {
		try {
			restaurantService.deleteById(restuarantId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@ApiOperation(value = "update restaurant", response = Restaurant.class, tags = "update")
	@PutMapping(value = "/update")
	public ResponseEntity<Restaurant> update(@RequestBody Restaurant restaurant) {
		Restaurant updated = new Restaurant();
		try {
			updated = restaurantService.save(restaurant);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return updated != null ? new ResponseEntity<Restaurant>(HttpStatus.OK)
				: new ResponseEntity<Restaurant>(HttpStatus.BAD_REQUEST);
	}

	@ApiOperation(value = "get restaurant by id", response = Restaurant.class, tags = "get")
	@GetMapping(value = "/get/{restuarantId}")
	public Restaurant getById(@PathVariable(name = "restuarantId") int restuarantId) {
		Restaurant findById =  new Restaurant();
		try {
			findById = restaurantService.findById(restuarantId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return findById;
	}

	@ApiOperation(value = "get all restaurant", response = Restaurant.class, tags = "get")
	@GetMapping(value = "/getAll")
	public List<Restaurant> getAll() {
		List<Restaurant> allRestaurant = new ArrayList<>();
		try {
			allRestaurant = restaurantService.getAllRestaurant();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return allRestaurant;
	}

	@ApiOperation(value = "get all restaurant on basis of location", response = Restaurant.class, tags = "post")
	@PostMapping(value = "/getAll")
	public List<Restaurant> getAllByDistance(@RequestBody SearchEntity searchEntity) {
		List<Restaurant> allRestaurantbyDistance = new ArrayList<>();
		try {
			allRestaurantbyDistance = restaurantService.getAllRestaurantbyDistance(searchEntity);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return allRestaurantbyDistance;
	}

}
