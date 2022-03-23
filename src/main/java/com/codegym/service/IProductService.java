package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    Product findById(int id);

    void createProduct(Product product);

    void updateById(int id, Product product);

    void deleteById(int id);

    List<Product> findByName(String name);
}
