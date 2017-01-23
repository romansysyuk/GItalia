package rzeszow.gitaliano.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import rzeszow.gitaliano.dao.ProductsRepository;
import rzeszow.gitaliano.entity.Products;
import rzeszow.gitaliano.service.ProductsService;

import java.util.List;

/**
 * Created by kobeb on 12.12.2016.
 */
public class ProductsServiceImplementation implements ProductsService {

    @Autowired
    ProductsRepository productsRepository;
    public Products add(Products products) {
        return productsRepository.saveAndFlush(products);
    }

    public void delete(long id) {
        productsRepository.delete(id);

    }

    public Products update(Products products) {
        return productsRepository.saveAndFlush(products);
    }

    public Products findByName(String name) {
        return  productsRepository.findByName(name) ;
    }

    public List<Products> getAll() {
        return productsRepository.findAll();
    }
}
