/**
 * 
 */
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

/**
 * @author kaushiku
 *
 */
@Entity
@Table(name="product_units")
public class ProductUnits {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@OneToMany(mappedBy="productUnits", cascade = CascadeType.ALL)
	List<ProductDetails> productDetails = new ArrayList<>();

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
	 * @return the productDetails
	 */
	public List<ProductDetails> getProductDetails() {
		return productDetails;
	}

	/**
	 * @param productDetails the productDetails to set
	 */
	public void setProductDetails(List<ProductDetails> productDetails) {
		this.productDetails = productDetails;
	}
	
	

}
