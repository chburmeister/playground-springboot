package eu.christophburmeister.playground.springboot.soapservice;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import eu.christophburmeister.playground.springboot.CityRepository;
import eu.christophburmeister.playground.springboot.gen.GetCityByCodeServiceRequest;
import eu.christophburmeister.playground.springboot.gen.GetCityByCodeServiceResponse;

@Endpoint
public class CityByCodeEndpoint {
	
	static final Logger logger = LogManager.getLogger(CityByCodeEndpoint.class.getName());
	
	private static final String NAMESPACE_URI = "http://christophburmeister.eu/playground/springboot/gen";

	private CityRepository cityRepository;

	@Autowired
	public CityByCodeEndpoint(CityRepository cityRepository) {
		this.cityRepository = cityRepository;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCityByCodeServiceRequest")
	@ResponsePayload
	public GetCityByCodeServiceResponse getCityByCode(@RequestPayload GetCityByCodeServiceRequest request) {
		logger.info("entering endpoint");
		GetCityByCodeServiceResponse response = new GetCityByCodeServiceResponse();
		response.setCity(cityRepository.findCity(request.getCode()));

		return response;
	}
}
