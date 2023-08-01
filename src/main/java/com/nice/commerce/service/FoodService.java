package com.nice.commerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nice.commerce.dao.FoodDao;
import com.nice.commerce.model.FoodModel;

@Service
public class FoodService {
	@Autowired
	private FoodDao foodDao;
	
	public List<FoodModel> showFood() {
		return (List<FoodModel>) foodDao.findAllByOrderByNameAsc();
	}
	
	public void saveFood(FoodModel food) {
		this.foodDao.save(food);
	}
	
	public FoodModel getFoodById(long id) {
		Optional<FoodModel> result = foodDao.findById(id);
		return result.get();
	}
}
