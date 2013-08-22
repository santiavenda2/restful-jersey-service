/**
 * 
 */
package com.santiavenda.rest.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.santiavenda.rest.domain.CountryInformation;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

/**
 * @author santiago
 * 
 */
@Path("/countries")
@Api(value = "/countries")
public class CountryResource {

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@ApiOperation(value = "Find countries information", notes = "More notes about this method", response = CountryInformation.class, responseContainer="list")
	public Response getCountries() {
		List<CountryInformation> countries = getCountryInformation();
		GenericEntity<List<CountryInformation>> entity = new GenericEntity<List<CountryInformation>>(
				countries) {
		};
		return Response.ok(entity).build();
	}

	private List<CountryInformation> getCountryInformation() {
		List<CountryInformation> countries = new ArrayList<CountryInformation>();
		CountryInformation argentina = new CountryInformation();
		argentina.setName("argentina");
		countries.add(argentina);
		CountryInformation brazil = new CountryInformation();
		brazil.setName("brazil");
		countries.add(brazil);
		return countries;
	}

}
