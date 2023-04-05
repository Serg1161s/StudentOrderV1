package student.order.domain;

import java.time.LocalDate;

public class StudentOrder  {
   protected long studentOrderID;
   protected Adult husband;
   private Adult wife;
   private Child child;
   private String marriageCertificateId;
   private String marriageOffice;
   private LocalDate marriageDate;

   public String getMarriageCertificateId() {
      return marriageCertificateId;
   }


   public void setMarriageCertificateId(String marriageCertificateId) {
      this.marriageCertificateId = marriageCertificateId;
   }

   public String getMarriageOffice() {
      return marriageOffice;
   }

   public void setMarriageOffice(String marriageOffice) {
      this.marriageOffice = marriageOffice;
   }

   public LocalDate getMarriageDate() {
      return marriageDate;
   }

   public void setMarriageDate(LocalDate marriageDate) {
      this.marriageDate = marriageDate;
   }

   public long getStudentOrderID() {
      return studentOrderID;
   }

   public void setStudentOrderID(long studentOrderID) {
      this.studentOrderID = studentOrderID;
   }

   public Adult getHusband() {
      return husband;
   }

   public void setHusband(Adult husband) {
      this.husband = husband;
   }

   public Adult getWife() {
      return wife;
   }

   public void setWife(Adult wife) {
      this.wife = wife;
   }

   public Child getChild() {
      return child;
   }

   public void setChild(Child child) {
      this.child = child;
   }
}
