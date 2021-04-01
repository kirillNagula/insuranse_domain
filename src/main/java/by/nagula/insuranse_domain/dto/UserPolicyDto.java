package by.nagula.insuranse_domain.dto;

import by.nagula.insuranse_domain.entity.InsuranceType;
import by.nagula.insuranse_domain.entity.TypeOfProperty;

public class UserPolicyDto {
    private String firstName;
    private String lastName;
    private InsuranceType insuranceType;
    private TypeOfProperty typeOfProperty;


    public UserPolicyDto(String firstName, String lastName, InsuranceType insuranceType, TypeOfProperty typeOfProperty) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.insuranceType = insuranceType;
        this.typeOfProperty = typeOfProperty;
    }

    public UserPolicyDto() {
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

    public InsuranceType getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(InsuranceType insuranceType) {
        this.insuranceType = insuranceType;
    }

    public TypeOfProperty getTypeOfProperty() {
        return typeOfProperty;
    }

    public void setTypeOfProperty(TypeOfProperty typeOfProperty) {
        this.typeOfProperty = typeOfProperty;
    }

    @Override
    public String toString() {
        return "UserPolicyDto{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", insuranceType=" + insuranceType +
                ", typeOfProperty=" + typeOfProperty +
                '}';
    }
}
