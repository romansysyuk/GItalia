package rzeszow.gitaliano.entity;

import rzeszow.gitaliano.enums.SexEnum;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by kobeb on 10.10.2016.
 */
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;
    @Column(length = 32)
    private String firstName;
    @Column(length = 32)
    private String lastName;
    @Column
    @Enumerated(EnumType.STRING)
    private SexEnum sexEnum;
    @Column
    private Date birthDate;
    @Column(length = 20)
    private String email;
    @Column(length = 16)
    private String phoneNumber;
    @ManyToOne(fetch = FetchType.LAZY)
    private City city;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "user")
    private List<Orders> orders;

    public User(Date birthDate, String email, String firstName, String lastName, String phoneNumber, SexEnum sexEnum) {
        this.birthDate = birthDate;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.sexEnum = sexEnum;
    }

    public User() {
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public SexEnum getSexEnum() {
        return sexEnum;
    }

    public void setSexEnum(SexEnum sexEnum) {
        this.sexEnum = sexEnum;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }
}
