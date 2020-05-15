package com.search.service.entity;

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
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class SearchEntity {
	
	private double userLongitude;
	private double userLattitude;
	private double kilometerLimit;
	

}
