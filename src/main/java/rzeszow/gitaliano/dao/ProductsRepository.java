package rzeszow.gitaliano.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import rzeszow.gitaliano.entity.City;
import rzeszow.gitaliano.entity.Products;

/**
 * Created by kobeb on 23.10.2016.
 */
public interface ProductsRepository extends JpaRepository<Products, Long> {
    @Query("select  c from Products c where c.name = :name")
    Products findByName(@Param("name") String name);
}
