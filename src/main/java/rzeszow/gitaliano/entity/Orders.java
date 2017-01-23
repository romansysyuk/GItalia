package rzeszow.gitaliano.entity;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.List;

/**
 * Created by kobeb on 11.10.2016.
 */
@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;
    @Temporal(TemporalType.DATE)
    @Column
    private Date date;
    @Column
    private Time time;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "orders")
    private List<Products> products;
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    public Orders(Date date, Time time) {
        this.date = date;
        this.time = time;
    }

    public Orders() {
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
