package student.order.domain;

import java.time.LocalDate;

public class Child extends Person {
    private String certificateNumber;
    private LocalDate issueDate;
    private String issueDepartment;

    public Child(){

    }

    public Child(String surName, String givenName, String patronymic, LocalDate birthdayDate, String certificateNumber, LocalDate issueDate, String issueDepartment) {
        super(surName, givenName, patronymic, birthdayDate);
        this.certificateNumber = certificateNumber;
        this.issueDate = issueDate;
        this.issueDepartment = issueDepartment;
    }

    public Child(String surName, String givenName, String patronymic, LocalDate birthdayDate) {
        super(surName, givenName, patronymic, birthdayDate);
    }

    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public String getIssueDepartment() {
        return issueDepartment;
    }

    public void setIssueDepartment(String issueDepartment) {
        this.issueDepartment = issueDepartment;
    }
}
