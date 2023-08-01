package com.nice.commerce.controller.rest.food;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nice.commerce.model.FoodModel;
import com.nice.commerce.service.FoodService;

@RestController
@CrossOrigin(origins = "*")
public class FoodRestController {
	@Autowired
	private FoodService foodService;
	
	@GetMapping("/food")
	public ResponseEntity<List<FoodModel>> getFoodList() {
		return new ResponseEntity<List<FoodModel>>(foodService.showFood(), HttpStatus.OK);
	}
	
	@PostMapping("/food/save")
	public ResponseEntity<Void> saveOrUpdateFood(@RequestBody FoodModel food) {
		foodService.saveFood(food);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
