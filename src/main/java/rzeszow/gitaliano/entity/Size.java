package rzeszow.gitaliano.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by kobeb on 10.10.2016.
 */
@Entity
public class Size {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;
    @Column
    private double height;
    @Column
    private double width;
    @Column
    private double length;
    @Column
    private int capacity;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "size")
    private List<Products> products;

    public Size(int capacity, double height, double length, double width) {
        this.capacity = capacity;
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public Size() {
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }
}

