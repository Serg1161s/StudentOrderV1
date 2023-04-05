package student.order.validator;

import student.order.domain.chidren.AnswerChildren;
import student.order.domain.StudentOrder;

public class ChildrenValidator {
     public AnswerChildren checkChildren(StudentOrder so) {
        System.out.println("children was checked");
        AnswerChildren ans = new AnswerChildren();
        return ans;
    }
}
