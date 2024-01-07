package com.neurogine.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neurogine.models.GeoLocationModel;
import com.neurogine.services.IGeoLocationService;

@RestController
@RequestMapping("/api/geolocations")
public class GeoLocationController {
	@Autowired
	private IGeoLocationService geolocationService;

	@GetMapping("getAllGeoLocations")
	public List<GeoLocationModel> getAllGeoLocations() {
		return geolocationService.getAllGeoLocations();
	}

	@GetMapping("getGeoLocationById/{id}")
	public ResponseEntity<GeoLocationModel> getGeoLocationbyId(@PathVariable int id) {
		try {
			Optional<GeoLocationModel> geolocation = geolocationService.getGeoLocationById(id);
			if (geolocation.isEmpty()) {
				return new ResponseEntity<>(geolocation.get(), HttpStatus.NOT_FOUND);
			} else {
				return new ResponseEntity<>(geolocation.get(), HttpStatus.OK);
			}
		} catch (Exception ex) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

	@PostMapping("addGeoLocation")
	public ResponseEntity<GeoLocationModel> addGeoLocation(@RequestBody GeoLocationModel geolocation) {
		try {
			GeoLocationModel addGeoLocation = geolocationService.addGeoLocation(geolocation);
			return new ResponseEntity<>(addGeoLocation, HttpStatus.CREATED);
		} catch (Exception ex) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@PutMapping("editGeoLocation")
	public ResponseEntity<GeoLocationModel> editGeoLocation(@RequestBody GeoLocationModel geolocation) {
		try {
			GeoLocationModel editGeoLocation = geolocationService.addGeoLocation(geolocation);
			return new ResponseEntity<>(editGeoLocation, HttpStatus.CREATED);
		} catch (Exception ex) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@DeleteMapping("deleteGeoLocation")
	public ResponseEntity<Void> deleteGeoLocation(@PathVariable int id) {
		try {
			geolocationService.deleteGeoLocation(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception ex) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}
