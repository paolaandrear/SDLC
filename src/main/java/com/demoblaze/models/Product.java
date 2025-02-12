package com.demoblaze.models;

public class Product {

	private String categoria;
	private String product;

	public Product(String categoria, String product) {
		super();
		this.categoria = categoria;
		this.product = product;
	}

	public String getCategoria() {
		return categoria;
	}

	public String getProduct() {
		return product;
	}

}
