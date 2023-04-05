package student.order.domain;

import java.time.LocalDate;

public class Adult extends Person{
    private String passportSeries;
    private String passportNumber;
    private  String issueDepartment;
    private LocalDate issueDate;
    private  String university;
    private String studentId;
    public Adult(){

    }
    public Adult(String surName, String givenName, String patronymic, LocalDate birthdayDate) {
        super(surName, givenName, patronymic, birthdayDate);
    }



    public String getPassportSeries() {
        return passportSeries;
    }

    public void setPassportSeries(String passportSeries) {
        this.passportSeries = passportSeries;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getIssueDepartment() {
        return issueDepartment;
    }

    public void setIssueDepartment(String issueDepartment) {
        this.issueDepartment = issueDepartment;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
