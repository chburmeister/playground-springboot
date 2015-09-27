//package eu.christophburmeister.playground.springboot.endpoints;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.springframework.ws.server.endpoint.annotation.Endpoint;
//import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
//import org.springframework.ws.server.endpoint.annotation.RequestPayload;
//import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
//
//import eu.christophburmeister.playground.schema.City;
//import eu.christophburmeister.playground.schema.GetCityByCodeRequest;
//import eu.christophburmeister.playground.schema.GetCityByCodeResponse;
//import eu.christophburmeister.playground.schema.GetCountryByCityNameRequest;
//import eu.christophburmeister.playground.schema.GetCountryByCityNameResponse;
//import eu.christophburmeister.playground.springboot.Constants;
//import eu.christophburmeister.playground.springboot.services.CitiesService;
//
//@Endpoint
//public class GetCountryByCityNameEndpoint {
//
//	static final Logger logger = LogManager.getLogger(GetCountryByCityNameEndpoint.class.getName());
//	
//	@PayloadRoot(namespace = Constants.NAMESPACE_URI, localPart = "getCountryByCityNameRequest")
//	@ResponsePayload
//	public GetCountryByCityNameResponse getCityByCode(@RequestPayload GetCountryByCityNameRequest request) {
//		logger.info("entering endpoint");
//		GetCountryByCityNameResponse response = new GetCountryByCityNameResponse();
//		CitiesService citiesService = new CitiesService();
//		String country = citiesService.getCountryByCityName(request.getCityName());
//		response.setCountry(country);
//		return response;
//	}
//
//}
