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
@Table(name = "States")
public class State {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	@ApiModelProperty(notes = "id", name = "id", required = true, value = "id")
	private int id;

	@Column(name = "state_name")
	@ApiModelProperty(notes = "stateName", name = "stateName", required = true, value = "stateName")
	private String stateName;

	@Column(name = "state_id")
	@ApiModelProperty(notes = "stateId", name = "stateId", required = true, value = "stateId")
	private String stateId;

	@Column(name = "state_code")
	@ApiModelProperty(notes = "stateCode", name = "stateCode", required = true, value = "stateCode")
	private String stateCode;

	@Column(name = "country_id")
	@ApiModelProperty(notes = "countryId", name = "countryId", required = true, value = "countryId")
	private String countryId;

}
