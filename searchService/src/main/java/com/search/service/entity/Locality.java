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
@Table(name = "Locality")
public class Locality {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	@ApiModelProperty(notes = "id", name = "id", required = true, value = "id")
	private int id;

	@Column(name = "locality_name")
	@ApiModelProperty(notes = "localityName", name = "localityName", required = true, value = "localityName")
	private String localityName;

	@Column(name = "locality_id")
	@ApiModelProperty(notes = "localityId", name = "localityId", required = true, value = "localityId")
	private String localityId;

	@Column(name = "langitude")
	@ApiModelProperty(notes = "langitude", name = "langitude", required = true, value = "langitude")
	private double langitude;

	@Column(name = "lattitude")
	@ApiModelProperty(notes = "lattitude", name = "lattitude", required = true, value = "lattitude")
	private double lattitude;

	@Column(name = "state_id")
	@ApiModelProperty(notes = "stateId", name = "stateId", required = true, value = "stateId")
	private String stateId;

}
