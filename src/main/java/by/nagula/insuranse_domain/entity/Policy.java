package by.nagula.insuranse_domain.entity;

import javax.persistence.*;

@Entity
@Table(name = "policies")
public class Policy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private TypeOfProperty property;

    private InsuranceType type;

    public Policy(long id, TypeOfProperty property, InsuranceType type) {
        this.id = id;
        this.property = property;
        this.type = type;
    }

    public Policy(TypeOfProperty property, InsuranceType type) {
        this.property = property;
        this.type = type;
    }

    public Policy() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public TypeOfProperty getProperty() {
        return property;
    }

    public void setProperty(TypeOfProperty property) {
        this.property = property;
    }

    public InsuranceType getType() {
        return type;
    }

    public void setType(InsuranceType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "PersonalPolicy{" +
                "id=" + id +
                ", property=" + property +
                ", type=" + type +
                '}';
    }
}
