package com.neurogine.respositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.neurogine.models.ProductModel;

@Repository
public interface IProductRepository extends MongoRepository<ProductModel, Integer> {

	List<ProductModel> findByEmail(String email);
}
