package com.demoblaze.hooks;

import java.util.Map;

import com.demoblaze.models.PayInformation;
import com.demoblaze.models.Product;
import com.demoblaze.models.User;

import io.cucumber.java.DataTableType;

public class DataTable {

	@DataTableType
	public User theUserInfo(Map<String, String> dataTable) {
		return new User(dataTable.get("usuario"), dataTable.get("contrasenna"));
	}

	@DataTableType
	public Product theProductInfo(Map<String, String> dataTable) {
		return new Product(dataTable.get("categoria"), dataTable.get("producto"));
	}

	@DataTableType
	public PayInformation theProduct(Map<String, String> dataTable) {
		return new PayInformation(dataTable.get("name"), dataTable.get("country"), dataTable.get("city"),
				dataTable.get("card"), dataTable.get("month"), dataTable.get("year"));
	}

}
