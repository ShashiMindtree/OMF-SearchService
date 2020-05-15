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
@Table(name = "Country")
public class Country {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	@ApiModelProperty(notes = "id", name = "id", required = true, value = "test id")
	private int id;

	@Column(name = "country_name")
	@ApiModelProperty(notes = "countryName", name = "countryName", required = true, value = "countryName")
	private String countryName;

	@Column(name = "country_id")
	@ApiModelProperty(notes = "countryId", name = "countryId", required = true, value = "countryId")
	private String countryId;

	@Column(name = "countryCode")
	@ApiModelProperty(notes = "countryCode", name = "countryCode", required = true, value = "countryCode")
	private String countryCode;

}
