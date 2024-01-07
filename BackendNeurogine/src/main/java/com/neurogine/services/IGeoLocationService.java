package com.neurogine.services;

import java.util.List;
import java.util.Optional;

import com.neurogine.models.GeoLocationModel;

public interface IGeoLocationService {

	List<GeoLocationModel> getAllGeoLocations();

	Optional<GeoLocationModel> getGeoLocationById(int id);

	GeoLocationModel addGeoLocation(GeoLocationModel geoLocationModel);

	GeoLocationModel editGeoLocation(GeoLocationModel geoLocationModel);

	void deleteGeoLocation(int id);
}
