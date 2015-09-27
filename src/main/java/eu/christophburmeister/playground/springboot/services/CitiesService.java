package eu.christophburmeister.playground.springboot.services;

import eu.christophburmeister.playground.schema.cities.City;
import eu.christophburmeister.playground.springboot.persistence.CityRepository;

public class CitiesService implements ICitiesService{

	CityRepository cityRepository;
	
	public City getCityByCode(int code) {
		cityRepository = new CityRepository();
		City city = cityRepository.findCity(code);
		return city;
	}

//	public String getCountryByCityName(String cityName) {
//		cityRepository = new CityRepository();
//		String country = cityRepository.findCountry(cityName);
//		return country;
//	}

}
