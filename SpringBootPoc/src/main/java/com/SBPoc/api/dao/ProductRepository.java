package com.SBPoc.api.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SBPoc.api.model.Product;
@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{

}
