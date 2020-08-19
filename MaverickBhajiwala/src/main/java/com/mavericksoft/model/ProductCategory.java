package com.mavericksoft.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "product_category")
public class ProductCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "image_url")
	private String imageUrl;

	@Column(name = "description")
	private String description;
	
	

	@Column(name = "del_Status")
	private int delStatus;

	@OneToMany(mappedBy = "productCategory", cascade = CascadeType.ALL)
	List<ProductSubCategory> productSubCategory = new ArrayList<>();
	
	@OneToMany(mappedBy = "productCategory", cascade = CascadeType.ALL)
	List<ProductDetails> productDetails = new ArrayList<>();

	/**
	 * @return the delStatus
	 */
	public int getDelStatus() {
		return delStatus;
	}

	/**
	 * @param delStatus the delStatus to set
	 */
	public void setDelStatus(int delStatus) {
		this.delStatus = delStatus;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the imageUrl
	 */
	public String getImageUrl() {
		return imageUrl;
	}

	/**
	 * @param imageUrl the imageUrl to set
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the productSubCategory
	 */
	public List<ProductSubCategory> getProductSubCategory() {
		return productSubCategory;
	}

	/**
	 * @param productSubCategory the productSubCategory to set
	 */
	public void setProductSubCategory(List<ProductSubCategory> productSubCategory) {
		this.productSubCategory = productSubCategory;
	}

}
