/**
 * 
 */
package com.mavericksoft.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author kaushiku
 *
 */
@Entity
@Table(name = "product_details")
public class ProductDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@ManyToOne
	@JoinColumn(name = "product_category_id")
	private ProductCategory productCategory;

	@ManyToOne
	@JoinColumn(name = "product_sub_category_id")
	private ProductSubCategory productSubCategory;

	@ManyToOne
	@JoinColumn(name = "product_size_id")
	private ProductSizes productSizes;

	@ManyToOne
	@JoinColumn(name = "product_main_category_id")
	private ProductMainCategory productMainCategory;
	
	
	@ManyToOne
	@JoinColumn(name = "offer_id")
	private Offer offer;

	@ManyToOne
	@JoinColumn(name = "product_units_id")
	private ProductUnits productUnits;

	@Column(name = "price")
	private float price;

	@Column(name = "total_quantity")
	private int totalQuantity;

	@Column(name = "available_quantity")
	private int availableQuantity;

	@Column(name = "sold_quantity")
	private int soldQuantity;

	@Column(name = "createdDate")
	private Date created_date;

	@Column(name = "modified_date")
	private Date modifiedDate;
	
	
	

	/**
	 * @return the offer
	 */
	public Offer getOffer() {
		return offer;
	}

	/**
	 * @param offer the offer to set
	 */
	public void setOffer(Offer offer) {
		this.offer = offer;
	}

	/**
	 * @return the productCategory
	 */
	public ProductCategory getProductCategory() {
		return productCategory;
	}

	/**
	 * @param productCategory the productCategory to set
	 */
	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
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
	 * @return the productSubCategory
	 */
	public ProductSubCategory getProductSubCategory() {
		return productSubCategory;
	}

	/**
	 * @param productSubCategory the productSubCategory to set
	 */
	public void setProductSubCategory(ProductSubCategory productSubCategory) {
		this.productSubCategory = productSubCategory;
	}

	/**
	 * @return the productSizes
	 */
	public ProductSizes getProductSizes() {
		return productSizes;
	}

	/**
	 * @param productSizes the productSizes to set
	 */
	public void setProductSizes(ProductSizes productSizes) {
		this.productSizes = productSizes;
	}

	/**
	 * @return the productMainCategory
	 */
	public ProductMainCategory getProductMainCategory() {
		return productMainCategory;
	}

	/**
	 * @param productMainCategory the productMainCategory to set
	 */
	public void setProductMainCategory(ProductMainCategory productMainCategory) {
		this.productMainCategory = productMainCategory;
	}

	/**
	 * @return the productUnits
	 */
	public ProductUnits getProductUnits() {
		return productUnits;
	}

	/**
	 * @param productUnits the productUnits to set
	 */
	public void setProductUnits(ProductUnits productUnits) {
		this.productUnits = productUnits;
	}

	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	/**
	 * @return the totalQuantity
	 */
	public int getTotalQuantity() {
		return totalQuantity;
	}

	/**
	 * @param totalQuantity the totalQuantity to set
	 */
	public void setTotalQuantity(int totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	/**
	 * @return the availableQuantity
	 */
	public int getAvailableQuantity() {
		return availableQuantity;
	}

	/**
	 * @param availableQuantity the availableQuantity to set
	 */
	public void setAvailableQuantity(int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	/**
	 * @return the soldQuantity
	 */
	public int getSoldQuantity() {
		return soldQuantity;
	}

	/**
	 * @param soldQuantity the soldQuantity to set
	 */
	public void setSoldQuantity(int soldQuantity) {
		this.soldQuantity = soldQuantity;
	}

	/**
	 * @return the created_date
	 */
	public Date getCreated_date() {
		return created_date;
	}

	/**
	 * @param created_date the created_date to set
	 */
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	/**
	 * @return the modifiedDate
	 */
	public Date getModifiedDate() {
		return modifiedDate;
	}

	/**
	 * @param modifiedDate the modifiedDate to set
	 */
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@Override
	public String toString() {
		return "ProductDetails [id=" + id + ", productCategory=" + productCategory + ", productSubCategory="
				+ productSubCategory + ", productSizes=" + productSizes + ", productMainCategory=" + productMainCategory
				+ ", offer=" + offer + ", productUnits=" + productUnits + ", price=" + price + ", totalQuantity="
				+ totalQuantity + ", availableQuantity=" + availableQuantity + ", soldQuantity=" + soldQuantity
				+ ", created_date=" + created_date + ", modifiedDate=" + modifiedDate + "]";
	}

}
