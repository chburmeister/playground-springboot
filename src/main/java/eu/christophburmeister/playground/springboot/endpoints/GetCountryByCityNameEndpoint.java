package eu.christophburmeister.playground.springboot.endpoints;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import eu.christophburmeister.playground.schema.cities.GetCountryByCityNameRequest;
import eu.christophburmeister.playground.schema.cities.GetCountryByCityNameResponse;
import eu.christophburmeister.playground.springboot.persistence.CityRepository;

@Endpoint
public class GetCountryByCityNameEndpoint {

	static final Logger logger = LogManager.getLogger(GetCountryByCityNameEndpoint.class.getName());

	CityRepository cityRepository;
	
	@Autowired
	public GetCountryByCityNameEndpoint(CityRepository cityRepository) {
		this.cityRepository = cityRepository;
	}
	
	@PayloadRoot(namespace = "http://christophburmeister.eu/playground/schema/cities", localPart = "getCountryByCityNameRequest")
	@ResponsePayload
	public GetCountryByCityNameResponse getCityByCode(@RequestPayload GetCountryByCityNameRequest request) {
		logger.info("entering endpoint");
		GetCountryByCityNameResponse response = new GetCountryByCityNameResponse();
		String country = cityRepository.findCountry(request.getCityName());
		response.setCountry(country);
		return response;
	}

}
