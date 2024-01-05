package com.neurogine.models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class ProductModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "id")
	private String email;
	
	@Column(name = "category")
	private int category;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "geolocation")
	private int geolocation;
	
	@Column(name = "image")
	private String image;
	
	public ProductModel(int id, String name, String description, String email, int category, String address,
			int geolocation, String image) {
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

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getGeolocation() {
		return geolocation;
	}

	public void setGeolocation(int geolocation) {
		this.geolocation = geolocation;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
	
}
