package com.codewithgurtej.blog.payloads;


public class CategoryDto {
	
	private Integer categoryId;
	private String categoryTitle;
	private String categoryDescription;
	
	public CategoryDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryTitle() {
		return categoryTitle;
	}
	public void setCategoryTitle(String categoryTitle) {
		this.categoryTitle = categoryTitle;
	}
	public String getCategoryDescription() {
		return categoryDescription;
	}
	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}
	
	
}
