package eu.christophburmeister.playground.springboot.services;

import eu.christophburmeister.playground.schema.cities.City;

public interface ICitiesService {
	
	City getCityByCode(int code);
//	String getCountryByCityName(String cityName);
	
}
