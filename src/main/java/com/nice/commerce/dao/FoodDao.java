package com.nice.commerce.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nice.commerce.model.FoodModel;

/**
 * @author Ahmad Fajri Rahman
 */

@Repository
public interface FoodDao extends JpaRepository<FoodModel, Long> {
	public List<FoodModel> findAllByOrderByNameAsc();
}
