package rzeszow.gitaliano.entity;

import rzeszow.gitaliano.enums.AvailabEnum;

import javax.persistence.*;

/**
 * Created by kobeb on 10.10.2016.
 */
@Entity
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;
    @Column(length = 32)
    private String name;
    @Column
    private double weight;
    @Column
    private String description;
    @Column
    private double price;
    @Column
    @Enumerated(EnumType.STRING)
    private AvailabEnum availability;

    @ManyToOne(fetch = FetchType.LAZY)
    private Country country;
    @ManyToOne(fetch = FetchType.LAZY)
    private Size size;
    @ManyToOne(fetch = FetchType.LAZY)
    private Orders orders;

    public Products(AvailabEnum availability, String description, String name, double price, double weight) {
        this.availability = availability;
        this.description = description;
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public Products() {
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public AvailabEnum getAvailability() {
        return availability;
    }

    public void setAvailability(AvailabEnum availability) {
        this.availability = availability;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }
}
