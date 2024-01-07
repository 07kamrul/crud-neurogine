package com.neurogine.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "geolocation")
public class GeoLocationModel {
	private int id;
	private double latitude;
	private double longitude;

	public GeoLocationModel() {
		super();
	}

	public GeoLocationModel(int id, double latitude, double longitude) {
		super();
		this.id = id;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

}
