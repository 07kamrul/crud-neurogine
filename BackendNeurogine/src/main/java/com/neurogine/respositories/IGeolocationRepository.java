package com.neurogine.respositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.neurogine.models.GeoLocationModel;

@Repository
public interface IGeolocationRepository extends MongoRepository<GeoLocationModel, Integer> {

}
