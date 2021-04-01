package by.nagula.insuranse_domain.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Policy> personalPolicy;

    public User(long id, String firstName, String lastName, List<Policy> personalPolicy) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.personalPolicy = personalPolicy;
    }

    public User(String firstName, String lastName, List<Policy> personalPolicy) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personalPolicy = personalPolicy;
    }

    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Policy> getPersonalPolicy() {
        return personalPolicy;
    }

    public void setPersonalPolicy(List<Policy> personalPolicy) {
        this.personalPolicy = personalPolicy;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", personalPolicy=" + personalPolicy +
                '}';
    }
}
