/**
 * 
 */
package com.santiavenda.rest.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author santiago
 *
 */
@XmlRootElement
public class CountryInformation {
	
	private String name;

	@XmlElement
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
