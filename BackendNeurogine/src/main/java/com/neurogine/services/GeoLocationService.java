package com.neurogine.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.neurogine.models.GeoLocationModel;

@Service
public class GeoLocationService implements IGeoLocationService {

	@Override
	public List<GeoLocationModel> getAllGeoLocations() {
		return null;
	}

	@Override
	public Optional<GeoLocationModel> getGeoLocationById(int id) {
		return Optional.empty();
	}

	@Override
	public GeoLocationModel addGeoLocation(GeoLocationModel geoLocationModel) {
		return null;
	}

	@Override
	public GeoLocationModel editGeoLocation(GeoLocationModel geoLocationModel) {
		return null;
	}

	@Override
	public void deleteGeoLocation(int id) {

	}

}
