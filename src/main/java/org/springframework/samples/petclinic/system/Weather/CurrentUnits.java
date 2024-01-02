package org.springframework.samples.petclinic.system.Weather;

public class CurrentUnits {
	private String time;
	private String interval;
	private String temperature_2m;
	private String wind_speed_10m;

	public CurrentUnits() {
	}

	public CurrentUnits(String time, String interval, String temperature_2m, String wind_speed_10m) {
		this.time = time;
		this.interval = interval;
		this.temperature_2m = temperature_2m;
		this.wind_speed_10m = wind_speed_10m;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getInterval() {
		return interval;
	}

	public void setInterval(String interval) {
		this.interval = interval;
	}

	public String getTemperature_2m() {
		return temperature_2m;
	}

	public void setTemperature_2m(String temperature_2m) {
		this.temperature_2m = temperature_2m;
	}

	public String getWind_speed_10m() {
		return wind_speed_10m;
	}

	public void setWind_speed_10m(String wind_speed_10m) {
		this.wind_speed_10m = wind_speed_10m;
	}
}
