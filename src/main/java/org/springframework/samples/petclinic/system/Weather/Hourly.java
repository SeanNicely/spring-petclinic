package org.springframework.samples.petclinic.system.Weather;

import java.sql.Timestamp;
import java.util.List;

public class Hourly {
	private List<Timestamp> time;
	private List<Double> temperature_2m;
	private List<Double> relative_humidity_2m;
	private List<Double> wind_speed_10m;

	public Hourly() {
	}

	public Hourly(List<Timestamp> time, List<Double> temperature_2m, List<Double> relative_humidity_2m, List<Double> wind_speed_10m) {
		this.time = time;
		this.temperature_2m = temperature_2m;
		this.relative_humidity_2m = relative_humidity_2m;
		this.wind_speed_10m = wind_speed_10m;
	}

	public List<Timestamp> getTime() {
		return time;
	}

	public void setTime(List<Timestamp> time) {
		this.time = time;
	}

	public List<Double> getTemperature_2m() {
		return temperature_2m;
	}

	public void setTemperature_2m(List<Double> temperature_2m) {
		this.temperature_2m = temperature_2m;
	}

	public List<Double> getRelative_humidity_2m() {
		return relative_humidity_2m;
	}

	public void setRelative_humidity_2m(List<Double> relative_humidity_2m) {
		this.relative_humidity_2m = relative_humidity_2m;
	}

	public List<Double> getWind_speed_10m() {
		return wind_speed_10m;
	}

	public void setWind_speed_10m(List<Double> wind_speed_10m) {
		this.wind_speed_10m = wind_speed_10m;
	}
}
