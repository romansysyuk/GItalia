package rzeszow.gitaliano.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import rzeszow.gitaliano.entity.Orders;

/**
 * Created by kobeb on 23.10.2016.
 */
public interface OrdersRepository extends JpaRepository<Orders, Long>{
}
