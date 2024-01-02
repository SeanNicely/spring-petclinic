package org.springframework.samples.petclinic.system.Weather;

import java.util.Map;

public class WeatherDTO {
	private Double latitude;
	private Double longitude;
	private double generationtime_ms;
	private int utc_offset_seconds;
	private String timezone;
	private String timezone_abbreviation;
	private Double elevation;
	private CurrentUnits current_units;
	private Current current;
	private HourlyUnits hourly_units;
	private Hourly hourly;

	public WeatherDTO(){}

	public WeatherDTO(Double latitude, Double longitude, double generationtime_ms, int utc_offset_seconds, String timezone, String timezone_abbreviation, Double elevation, CurrentUnits current_units, Current current, HourlyUnits hourly_units, Hourly hourly) {
		this.latitude = latitude;
		this.longitude = longitude;
		this.generationtime_ms = generationtime_ms;
		this.utc_offset_seconds = utc_offset_seconds;
		this.timezone = timezone;
		this.timezone_abbreviation = timezone_abbreviation;
		this.elevation = elevation;
		this.current_units = current_units;
		this.current = current;
		this.hourly_units = hourly_units;
		this.hourly = hourly;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public double getGenerationtime_ms() {
		return generationtime_ms;
	}

	public void setGenerationtime_ms(double generationtime_ms) {
		this.generationtime_ms = generationtime_ms;
	}

	public int getUtc_offset_seconds() {
		return utc_offset_seconds;
	}

	public void setUtc_offset_seconds(int utc_offset_seconds) {
		this.utc_offset_seconds = utc_offset_seconds;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public String getTimezone_abbreviation() {
		return timezone_abbreviation;
	}

	public void setTimezone_abbreviation(String timezone_abbreviation) {
		this.timezone_abbreviation = timezone_abbreviation;
	}

	public Double getElevation() {
		return elevation;
	}

	public void setElevation(Double elevation) {
		this.elevation = elevation;
	}

	public CurrentUnits getCurrent_units() {
		return current_units;
	}

	public void setCurrent_units(CurrentUnits current_units) {
		this.current_units = current_units;
	}

	public Current getCurrent() {
		return current;
	}

	public void setCurrent(Current current) {
		this.current = current;
	}

	public HourlyUnits getHourly_units() {
		return hourly_units;
	}

	public void setHourly_units(HourlyUnits hourly_units) {
		this.hourly_units = hourly_units;
	}

	public Hourly getHourly() {
		return hourly;
	}

	public void setHourly(Hourly hourly) {
		this.hourly = hourly;
	}
}
