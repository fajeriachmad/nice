package com.nice.commerce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.TableGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ahmad Fajri Rahman
 */

@Data

@AllArgsConstructor

@NoArgsConstructor

@Entity

@Table(name = "T_FOOD")
public class FoodModel {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "food_generator")
	@TableGenerator(name = "food_generator", table = "T_GENERATOR")
	@Column(name = "FOOD_ID")
	private Long id;

	@Column(name = "FOOD_NAME")
	private String name;
}