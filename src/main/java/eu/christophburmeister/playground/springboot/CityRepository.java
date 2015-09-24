package eu.christophburmeister.playground.springboot;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import eu.christophburmeister.playground.springboot.gen.City;

@Component
public class CityRepository {
	
	static final Logger logger = LogManager.getLogger(CityRepository.class.getName());
	
	private static final List<City> cities = new ArrayList<City>();

	@PostConstruct
	public void initData() {
		City neuruppin = new City();
		neuruppin.setCode(16816);
		neuruppin.setName("Neuruppin");		
		cities.add(neuruppin);
	}

	public City findCity(int code) {
		logger.info("searching for: " + code);

		City result = null;

		for (City city : cities) {
			if (code == city.getCode()) {
				result = city;
			}
		}

		return result;
	}
}