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
@Table(name = "Resturant")
public class Restaurant {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	@ApiModelProperty(notes = "id", name = "id", required = true, value = "id")
	private int id;

	@Column(name = "restuarant_name")
	@ApiModelProperty(notes = "restuarantName", name = "restuarantName", required = true, value = "restuarantName")
	private String restuarantName;

	@Column(name = "restuarant_id")
	@ApiModelProperty(notes = "restuarantId", name = "restuarantId", required = true, value = "restuarantId")
	private String restuarantId;

	@Column(name = "owner_fname")
	@ApiModelProperty(notes = "ownerFname", name = "ownerFname", required = true, value = "ownerFname")
	private String ownerFname;

	@Column(name = "ownerLname")
	@ApiModelProperty(notes = "ownerLname", name = "ownerLname", required = true, value = "ownerLname")
	private String ownerLname;

	@Column(name = "email_id")
	@ApiModelProperty(notes = "emailId", name = "emailId", required = true, value = "emailId")
	private String emailId;

	@Column(name = "mobile_No")
	@ApiModelProperty(notes = "mobileNo", name = "mobileNo", required = true, value = "mobileNo")
	private String mobileNo;

	@Column(name = "rating")
	@ApiModelProperty(notes = "rating", name = "rating", required = true, value = "rating")
	private double rating;

	@Column(name = "minimum_order")
	@ApiModelProperty(notes = "minimumOrder", name = "minimumOrder", required = true, value = "minimumOrder")
	private int minimumOrder;

	@Column(name = "langitude")
	@ApiModelProperty(notes = "langitude", name = "langitude", required = true, value = "langitude")
	private double langitude;

	@Column(name = "lattitude")
	@ApiModelProperty(notes = "lattitude", name = "lattitude", required = true, value = "lattitude")
	private double lattitude;

	@Column(name = "logo_path")
	@ApiModelProperty(notes = "logoPath", name = "logoPath", required = true, value = "logoPath")
	private String logoPath;

	@Column(name = "offer")
	@ApiModelProperty(notes = "offer", name = "offer", required = true, value = "offer")
	private int offer;

}
