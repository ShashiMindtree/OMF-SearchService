package com.search.service.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author M1055705
 *
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name = "Food")
public class FoodMenu {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	@ApiModelProperty(notes = "id", name = "id", required = true, value = "test id")
	private int id;

	@Column(name = "restuarant_id")
	@ApiModelProperty(notes = "restuarantId", name = "restuarantId", required = true, value = "restuarantId")
	private String restuarantId;

	@Column(name = "name")
	@ApiModelProperty(notes = "name", name = "name", required = true, value = "name")
	private String name;

	@Column(name = "category")
	@ApiModelProperty(notes = "category", name = "category", required = true, value = "category")
	private String category;

	@Column(name = "price")
	@ApiModelProperty(notes = "price", name = "price", required = true, value = "price")
	private double price;

	@Column(name = "food_image_path")
	@ApiModelProperty(notes = "foodImagePath", name = "foodImagePath", required = true, value = "foodImagePath")
	private String foodImagePath;

}
