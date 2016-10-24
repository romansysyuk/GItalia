package rzeszow.gitaliano.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by kobeb on 10.10.2016.
 */
@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;
    @Column(length = 55)
    private String name;
    @ManyToOne(fetch = FetchType.LAZY)
    private Country country;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "city")
    private List<User> users;

    public City(String name) {
        this.name = name;
    }

    public City() {
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

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
