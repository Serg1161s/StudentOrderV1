package student.order.domain;

import java.time.LocalDate;
import java.util.Date;

public abstract class Person {
    private    String surName;
    private    String givenName;
    private    String patronymic;
    private LocalDate birthdayDate;
    private  Address address;

    public Person(){

    }

    public Person(String surName, String givenName, String patronymic, LocalDate birthdayDate) {
        this.surName = surName;
        this.givenName = givenName;
        this.patronymic = patronymic;
        this.birthdayDate = birthdayDate;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(LocalDate birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
