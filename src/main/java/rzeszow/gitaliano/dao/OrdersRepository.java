package rzeszow.gitaliano.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import rzeszow.gitaliano.entity.Orders;

/**
 * Created by kobeb on 23.10.2016.
 */
public interface OrdersRepository extends JpaRepository<Orders, Long>{
    @Query("select d form Order d where d =: date")
    Orders findByDate(@Param("date")String date);
}
