/**
 * 
 */
package com.mavericksoft.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mavericksoft.model.ProductDetails;

/**
 * @author kaushiku
 *
 */
public interface ProductDetailsRepository extends JpaRepository<ProductDetails, Integer> {

	ProductDetails findById(int i);

	Page<ProductDetails> findAll(Pageable pageable);

	Page<ProductDetails> findByProductCategoryId(int productCategoryId, Pageable pageable);

	int countByIdGreaterThanEqual(int id);

	int countByProductCategoryId(int id);

}
