package com.neurogine.respositories;

import java.util.Locale.Category;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends MongoRepository<Category, Integer> {

}
