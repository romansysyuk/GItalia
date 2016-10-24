package rzeszow.gitaliano.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import rzeszow.gitaliano.entity.Products;

/**
 * Created by kobeb on 23.10.2016.
 */
public interface ProductsRepository extends JpaRepository<Products, Long> {
}
