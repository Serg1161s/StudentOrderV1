package student.order.validator;

import student.order.domain.register.AnswerCityRegister;
import student.order.domain.register.CityRegisterCheckerResponse;
import student.order.domain.StudentOrder;
import student.order.exeption.CityRegisterException;
import student.order.validator.register.CityRegisterChecker;
import student.order.validator.register.FakeCityRegisterChecker;

public class CityRegisterValidator {
   public String hostName;
   protected int port;
    public String login;
   public String password;
   private CityRegisterChecker personChecker;

    public CityRegisterValidator( ) {
        personChecker = new FakeCityRegisterChecker();
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so){
        try {
            CityRegisterCheckerResponse hans = personChecker.checkPerson(so.getHusband());
            CityRegisterCheckerResponse wans =  personChecker.checkPerson(so.getWife());
            CityRegisterCheckerResponse cans = personChecker.checkPerson(so.getChild());
        }catch (CityRegisterException ex) {
            ex.printStackTrace(System.out);
        }

        AnswerCityRegister ans = new AnswerCityRegister();
        return  ans;
    }
}
