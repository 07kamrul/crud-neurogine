package com.neurogine.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "product")
public class ProductModel {

	@Id
	private int id;
	private String name;
	private String description;
	private String email;
	private CategoryModel category;
	private String address;
	private GeoLocationModel geolocation;
	private String image;

	public ProductModel() {
		super();
	}

	public ProductModel(int id, String name, String description, String email, CategoryModel category, String address,
			GeoLocationModel geolocation, String image) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.email = email;
		this.category = category;
		this.address = address;
		this.geolocation = geolocation;
		this.image = image;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public CategoryModel getCategory() {
		return category;
	}

	public void setCategory(CategoryModel category) {
		this.category = category;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public GeoLocationModel getGeolocation() {
		return geolocation;
	}

	public void setGeolocation(GeoLocationModel geolocation) {
		this.geolocation = geolocation;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
