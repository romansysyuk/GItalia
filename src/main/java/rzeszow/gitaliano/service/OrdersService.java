package rzeszow.gitaliano.service;


import rzeszow.gitaliano.entity.Orders;


import java.util.Date;
import java.util.List;

/**
 * Created by kobeb on 23.10.2016.
 */
public interface OrdersService {
        Orders add(Orders orders);
        void delete(long id);
        Orders update(Orders orders);
        List<Orders> getAll();
        List<Orders> findByDate(Date date);
}
