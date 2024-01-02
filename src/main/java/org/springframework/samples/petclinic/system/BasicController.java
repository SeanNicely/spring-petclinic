package org.springframework.samples.petclinic.system;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.samples.petclinic.system.Weather.WeatherDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class BasicController {
	@GetMapping("/basic")
	String helloWorld() {
		return "Hello World";
	}

	// Documentation at https://open-meteo.com/
	@GetMapping("/basic/weather")
	String externalApiExample() throws JsonProcessingException {
		final String uri = "https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&current=temperature_2m,wind_speed_10m&hourly=temperature_2m,relative_humidity_2m,wind_speed_10m";

		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		ObjectMapper objectMapper = new ObjectMapper();
		WeatherDTO weatherDTO = objectMapper.readValue(result, WeatherDTO.class);

		return result;
	}

	@GetMapping("/basic/vagueName")
	Double vagueName() throws JsonProcessingException {
		// This code has a bug in it and is bad. Fix bug and refactor
		RestTemplate restTemplate = new RestTemplate();
		String info = restTemplate.getForObject("https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&current=temperature_2m,wind_speed_10m&hourly=temperature_2m,relative_humidity_2m,wind_speed_10m", String.class);
		ObjectMapper objectMapper = new ObjectMapper();
		WeatherDTO weatherDTO = objectMapper.readValue(info, WeatherDTO.class);
		List<Double> stuff = weatherDTO.getHourly().getTemperature_2m();
		double d=0.0, e = 0.0, g=stuff.size();
		for (int i=0; i < stuff.size() - 1; i++) {
			double f = stuff.get(i);
			d = d + f;
		}
		e=d/stuff.size();
		return e;
	}


}
