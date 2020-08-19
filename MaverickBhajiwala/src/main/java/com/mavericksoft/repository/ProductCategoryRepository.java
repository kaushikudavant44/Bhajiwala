package com.mavericksoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mavericksoft.model.ProductCategory;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer>{

}
