/**
 * 
 */
package com.mavericksoft.model;

import java.util.ArrayList;
import java.util.Date;
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
@Table(name="customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="mobile_number")
	private Long mobileNumber;
	
	@Column(name="created_date")
	private Date createdDate;
	
	
	@OneToMany(mappedBy="customer", cascade = CascadeType.ALL)
	List<CustomerDetails> customerDetails = new ArrayList<>();

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
	 * @return the mobileNumber
	 */
	public Long getMobileNumber() {
		return mobileNumber;
	}

	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the customerDetails
	 */
	public List<CustomerDetails> getCustomerDetails() {
		return customerDetails;
	}

	/**
	 * @param customerDetails the customerDetails to set
	 */
	public void setCustomerDetails(List<CustomerDetails> customerDetails) {
		this.customerDetails = customerDetails;
	}
	
	
	
	
}
