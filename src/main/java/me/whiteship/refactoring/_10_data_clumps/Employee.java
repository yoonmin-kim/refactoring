package me.whiteship.refactoring._10_data_clumps;

public class Employee {

    private String name;

    private TelephoneNumber personalTelephoneNumber;

    public Employee(String name, TelephoneNumber personalTelephoneNumber) {
        this.name = name;
        this.personalTelephoneNumber = personalTelephoneNumber;
    }

    public String personalPhoneNumber() {
        return personalTelephoneNumber.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonalAreaCode() {
        return this.personalTelephoneNumber.getAreaCode();
    }

    public void setPersonalAreaCode(String personalAreaCode) {
        this.personalTelephoneNumber.setAreaCode(personalAreaCode);
    }

    public String getPersonalNumber() {
        return this.personalTelephoneNumber.getNumber();
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalTelephoneNumber.setNumber(personalNumber);
    }
}
