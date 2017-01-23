package rzeszow.gitaliano.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import rzeszow.gitaliano.dao.OrdersRepository;
import rzeszow.gitaliano.entity.Orders;
import rzeszow.gitaliano.service.OrdersService;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
import java.util.List;

/**
 * Created by roma-pc on 25.10.16.
 */
public class OrdersServiceImplementation implements OrdersService {
    @Autowired
    OrdersRepository ordersRepository;

    public Orders add(Orders orders) {
        return ordersRepository.saveAndFlush(orders);
    }

    public void delete(long id) {
        ordersRepository.delete(id);
    }

    public Orders update(Orders orders) {
        return ordersRepository.saveAndFlush(orders);
    }

    public List<Orders> getAll() {
        return ordersRepository.findAll();
    }

    @Temporal(TemporalType.DATE)
    public List<Orders>findByDate(Date date) {
        return ordersRepository.findByDate(date);
    }
}
