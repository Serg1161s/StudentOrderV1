package student.order.validator;

import student.order.domain.wedding.AnswerWedding;
import student.order.domain.StudentOrder;

public class WeddingValidator {
   public AnswerWedding checkWedding(StudentOrder so){
        System.out.println("wedding was checked");
        AnswerWedding ans = new AnswerWedding();
        return ans;
    }
}
