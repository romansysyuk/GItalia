package rzeszow.gitaliano.service;

import rzeszow.gitaliano.entity.Products;

import java.util.List;

/**
 * Created by kobeb on 23.10.2016.
 */
public interface ProductsService {
    Products add(Products products);
    void delete(long id);
    Products update(Products products);
    List<Products> findByName(String name);
    List<Products> getAll();


}
