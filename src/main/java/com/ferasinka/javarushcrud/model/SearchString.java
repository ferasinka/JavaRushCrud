package com.ferasinka.javarushcrud.model;

import org.springframework.stereotype.Component;

@Component
public class SearchString {
	private String searchName;

	public String getSearchName() {
		return searchName;
	}

	public void setSearchName(String searchName) {
		this.searchName = searchName;
	}
}
