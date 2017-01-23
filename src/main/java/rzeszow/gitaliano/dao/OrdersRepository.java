package rzeszow.gitaliano.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import rzeszow.gitaliano.entity.Orders;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
import java.util.List;

/**
 * Created by kobeb on 23.10.2016.
 */
public interface OrdersRepository extends JpaRepository<Orders, Long> {
    @Query("select d from  Orders  d where d =: date ")
    @Temporal(TemporalType.DATE)
    List<Orders> findByDate(@Param("date") Date date);
}


