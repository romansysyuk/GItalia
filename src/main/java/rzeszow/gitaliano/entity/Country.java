package rzeszow.gitaliano.entity;

import org.hibernate.annotations.NaturalIdCache;
import org.hibernate.loader.plan.exec.query.internal.SelectStatementBuilder;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.List;

/**
 * Created by kobeb on 10.10.2016.
 */
@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;
    @Column(length = 32)
    private String name;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "country")
    List<City> cities;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "country")
    List<Products> products;

    public Country(String name) {
        this.name = name;
    }

    public Country() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }
}
