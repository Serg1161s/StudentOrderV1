package student.order;

import student.order.domain.Address;
import student.order.domain.Adult;
import student.order.domain.Child;
import student.order.domain.StudentOrder;

import java.time.LocalDate;

public class SaveStudentOrder
{
    public static void main(String[] args) {
        StudentOrder s =buildStudentOrder(10);
//        StudentOrder so = new StudentOrder();
//        long ans = saveStudentOrder(so);
//        System.out.println(ans);

    }
    static long saveStudentOrder (StudentOrder studentOrder){
        long answer =199;
        System.out.println("Student order was saved" );
        return answer;
    }

    public static StudentOrder buildStudentOrder (long id){
        StudentOrder so = new StudentOrder() ;
        so.setMarriageDate( LocalDate.of(199,2,1)  );
        so.setMarriageCertificateId(" 444 ");
        so.setMarriageOffice("ZAGS 3");
        so.setStudentOrderID(id);


        Address address = new Address("198198", "Street", "20","1", "");

        Adult husband = new Adult("Petrov","Petr", "Petrovich", LocalDate.of(1982, 3, 3));
        husband.setPassportSeries("" + (1000 + id));
        husband.setPassportNumber("" + (100000 + id));
        husband.setIssueDate( LocalDate.of(2011, 04,01));
        husband.setIssueDepartment("Department N:" + id);
        husband.setStudentId("" + (100000+id));
        husband.setAddress(address);

        Adult wife = new Adult("Petrova","Petra", "Petrovicha", LocalDate.of(1981, 3, 3));
        wife.setPassportSeries("" + (2000 + id));
        wife.setPassportNumber("" + (200000 + id));
        wife.setIssueDate( LocalDate.of(2014, 04,01));
        wife.setIssueDepartment("Department N:" + id);
        wife.setStudentId("" + (200000+id));
        wife.setAddress(address);

        Child child = new Child("Petrova","Irina", "Petrovicha", LocalDate.of(2000, 3, 3));
        child.setCertificateNumber("" + (300000 + id));
        child.setIssueDate( LocalDate.of(2014, 04,01));
        child.setIssueDepartment("Department ZAGS N:" + id);
        child.setAddress(address);
        so.setHusband(husband);
        so.setWife(wife);
        so.setChild(child);

       return  so;
    }
    static void printStudentOrder (StudentOrder stOr) {
        System.out.println(stOr.getStudentOrderID());

    }
}
