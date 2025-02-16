package org.springframework.samples.petclinic.system.Weather;

public class HourlyUnits {

	private String time;
	private String temperature_2m;
	private String relative_humidity_2m;
	private String wind_speed_10m;

	public HourlyUnits() {
	}

	public HourlyUnits(String time, String temperature_2m, String relative_humidity_2m, String wind_speed_10m) {
		this.time = time;
		this.temperature_2m = temperature_2m;
		this.relative_humidity_2m = relative_humidity_2m;
		this.wind_speed_10m = wind_speed_10m;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getTemperature_2m() {
		return temperature_2m;
	}

	public void setTemperature_2m(String temperature_2m) {
		this.temperature_2m = temperature_2m;
	}

	public String getRelative_humidity_2m() {
		return relative_humidity_2m;
	}

	public void setRelative_humidity_2m(String relative_humidity_2m) {
		this.relative_humidity_2m = relative_humidity_2m;
	}

	public String getWind_speed_10m() {
		return wind_speed_10m;
	}

	public void setWind_speed_10m(String wind_speed_10m) {
		this.wind_speed_10m = wind_speed_10m;
	}
}
