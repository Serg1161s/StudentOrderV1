package student.order.validator.register;

import student.order.domain.register.CityRegisterCheckerResponse;
import student.order.domain.Person;
import student.order.exeption.CityRegisterException;

public interface CityRegisterChecker
{
     CityRegisterCheckerResponse checkPerson (Person person) throws CityRegisterException ;
}
