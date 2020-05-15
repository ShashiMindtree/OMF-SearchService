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
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name = "City")
public class City {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	@ApiModelProperty(notes = "id", name = "id", required = true, value = "test id")
	private int id;

	@Column(name = "city_name")
	@ApiModelProperty(notes = "cityName", name = "cityName", required = true, value = "cityName")
	private String cityName;

	@Column(name = "city_id")
	@ApiModelProperty(notes = "cityId", name = "cityId", required = true, value = "cityId")
	private String cityId;

	@Column(name = "city_code")
	@ApiModelProperty(notes = "cityCode", name = "cityCode", required = true, value = "cityCode")
	private String cityCode;

	@Column(name = "state_id")
	@ApiModelProperty(notes = "stateId", name = "stateId", required = true, value = "stateId")
	private String stateId;
}
