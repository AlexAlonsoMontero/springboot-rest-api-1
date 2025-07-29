package com.application.rest.service.impl;

import com.application.rest.entities.Product;

import com.application.rest.persistence.IProductDAO;
import com.application.rest.service.IProductService;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

public class IProductServiceImpl implements IProductService {

    @Autowired
    private IProductDAO iProductDAO;

    @Override
    public List<Product> findAll() {
        return iProductDAO.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return iProductDAO.findById(id);
    }

    @Override
    public void save(Product product) {
        iProductDAO.save(product);
    }

    @Override
    public void deleteById(Long id) {
        iProductDAO.deleteById(id);
    }

    @Override
    public List<Product> findByPriceRange(BigDecimal minPrice, BigDecimal maxPrice) {
        return iProductDAO.findByPriceRange(minPrice, maxPrice);
    }

}