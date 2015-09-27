package eu.christophburmeister.playground.springboot.endpoints;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import eu.christophburmeister.playground.schema.cities.City;
import eu.christophburmeister.playground.schema.cities.GetCityByCodeRequest;
import eu.christophburmeister.playground.schema.cities.GetCityByCodeResponse;
import eu.christophburmeister.playground.springboot.persistence.CityRepository;
import eu.christophburmeister.playground.springboot.services.CitiesService;

@Endpoint
public class GetCityByCodeEndpoint {

	static final Logger logger = LogManager.getLogger(GetCityByCodeEndpoint.class.getName());

	CityRepository cityRepository;
	
	@Autowired
	public GetCityByCodeEndpoint(CityRepository cityRepository) {
		this.cityRepository = cityRepository;
	}
	
	@PayloadRoot(namespace = "http://christophburmeister.eu/playground/schema/cities", localPart = "getCityByCodeRequest")
	@ResponsePayload
	public GetCityByCodeResponse getCityByCode(@RequestPayload GetCityByCodeRequest request) {
		logger.info("entering endpoint");
		GetCityByCodeResponse response = new GetCityByCodeResponse();
		City city = cityRepository.findCity(request.getCode());
		response.setCity(city);
		return response;
	}

}
