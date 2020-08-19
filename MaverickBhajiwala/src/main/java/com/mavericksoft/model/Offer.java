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
@Table(name="offer")
public class Offer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="discount")
	private int discount;
	
	@Column(name="coupen_code")
	private String coupenCode;
	
	@Column(name="promocode")
	private String promocode;
	
	@OneToMany(mappedBy="offer", cascade = CascadeType.ALL)
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
	 * @return the discount
	 */
	public int getDiscount() {
		return discount;
	}

	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(int discount) {
		this.discount = discount;
	}

	/**
	 * @return the coupenCode
	 */
	public String getCoupenCode() {
		return coupenCode;
	}

	/**
	 * @param coupenCode the coupenCode to set
	 */
	public void setCoupenCode(String coupenCode) {
		this.coupenCode = coupenCode;
	}

	/**
	 * @return the promocode
	 */
	public String getPromocode() {
		return promocode;
	}

	/**
	 * @param promocode the promocode to set
	 */
	public void setPromocode(String promocode) {
		this.promocode = promocode;
	}
	
	

}
