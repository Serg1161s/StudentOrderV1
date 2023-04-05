package student.order;

import student.order.domain.StudentOrder;
import student.order.domain.chidren.AnswerChildren;
import student.order.domain.register.AnswerCityRegister;
import student.order.domain.student.AnswerStudent;
import student.order.domain.wedding.AnswerWedding;
import student.order.mail.MailSender;
import student.order.validator.*;

public class StudntOrderValidator
{
    private CityRegisterValidator  cityRegisterVal;
    private WeddingValidator weddingVal;
    private ChildrenValidator childrenVal;
    private StudentValidator studentVal;
    private MailSender mailSend;

    public StudntOrderValidator() {
        cityRegisterVal = new CityRegisterValidator();
        weddingVal = new WeddingValidator();
        childrenVal = new ChildrenValidator();
        studentVal = new StudentValidator();
        mailSend = new MailSender();
    }

    public static void main(String[] args) {
        StudntOrderValidator sov = new StudntOrderValidator();
        sov.checkAll();

    }
    public void checkAll(){
        StudentOrder [] soArray = readStudentOrders();
        for (StudentOrder so : soArray){
//            System.out.println("_______________");
            checkOneOrder(so);
        }
    }
    public StudentOrder[] readStudentOrders(){
        StudentOrder[] soArray = new StudentOrder[3];
        for (int c = 0; c < soArray.length; c++ ){
            soArray[c] = SaveStudentOrder.buildStudentOrder(c);
        }

        return soArray;
    }

    public void checkOneOrder (StudentOrder so){
                AnswerCityRegister cityAnswer = checkCityRegister(so);
//                AnswerWedding weddingAnswer = checkWedding(so);
//                AnswerChildren childAnswer = checkChildren(so);
//                AnswerStudent studentAnswer = checkStudent(so);
//                sendMail(so);
    }
    public AnswerCityRegister checkCityRegister (StudentOrder so){
        CityRegisterValidator crv = new CityRegisterValidator();
        crv.hostName = "Host1";
        crv.password = "password1";
        crv.login = "login1";
        return  crv.checkCityRegister(so);
    }
    public void sendMail(StudentOrder so){
        new MailSender().sendMail(so);
    }
    public AnswerWedding checkWedding(StudentOrder so){
        return weddingVal.checkWedding(so);
    }
    public AnswerChildren checkChildren(StudentOrder so) { return  childrenVal.checkChildren(so);}
    public AnswerStudent checkStudent (StudentOrder so){return studentVal.checkStudent(so);}
}
