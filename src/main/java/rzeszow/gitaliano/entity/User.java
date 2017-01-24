package rzeszow.gitaliano.entity;



import rzeszow.gitaliano.enums.SexEnum;
import javax.persistence.*;
import javax.validation.constraints.*;
import javax.validation.constraints.Size;
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

    @Column(length = 20)
    @Size(max = 20,min = 3, message = "Имя повинно бути від 3 до 20 символів")
    private String firstName;

    @Column(length = 20)
    @Size(max = 20,min = 3, message = "Имя повинно бути від 3 до 20 символів")
    private String lastName;

    @Column
    @Enumerated(EnumType.STRING)
    private SexEnum sexEnum;
    @Column
    private Date birthDate;
    @Column(length = 20)
    @Pattern(regexp = "[a-zA-z0-9.+_+-]+@[A-Za-z]+.[a-zA-z]{2,4}", message = "Your email is invalid")
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

    public User(SexEnum sexEnum, String lastName, String firstName, String phoneNumber) {
        this.sexEnum = sexEnum;
        this.lastName = lastName;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
    }

    public User(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public User() {
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
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


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
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



    @Override
    public String toString() {
        return "User{" +
                "sexEnum=" + sexEnum +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
