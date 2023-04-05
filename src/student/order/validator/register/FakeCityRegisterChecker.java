package student.order.validator.register;

import student.order.domain.Adult;
import student.order.domain.Child;
import student.order.domain.register.CityRegisterCheckerResponse;
import student.order.domain.Person;
import student.order.exeption.CityRegisterException;

public class FakeCityRegisterChecker implements CityRegisterChecker
{
    public static final String GOOD_1 = "1000";
    public static final String GOOD_2 = "2000";
    public static final String BAD_1 = "1001";
    public static final String BAD_2 = "2001";
    public static final String ERROR_1 = "1002";
    public static final String EROOR_2 = "2002";
  public CityRegisterCheckerResponse checkPerson(Person person)
          throws CityRegisterException {
      CityRegisterCheckerResponse res = new CityRegisterCheckerResponse();

      if (person instanceof Adult) {
        Adult t = (Adult) person;
        String ps = t.getPassportSeries();
          System.out.println( t.getPassportSeries() + " givenName" + t.getGivenName());
         if (ps.equals( GOOD_1 ) || ps.equals( GOOD_2 )  ) {
            res.setExisting(true);
            res.setTemporal(false);
        }
          if (ps.equals( BAD_1 ) || ps.equals( BAD_2 )  ) {
              res.setExisting(true);
              res.setTemporal(false);
          }
          if (ps.equals( ERROR_1 ) || ps.equals( EROOR_2 )  ) {
              CityRegisterException ex = new CityRegisterException("Fake ERROR : " + ps);
              throw ex;
          }
      }
      if (person instanceof  Child) {
          res.setExisting(true);
          res.setTemporal(false);
      }
      System.out.println(res);
      return res;
  }


}
