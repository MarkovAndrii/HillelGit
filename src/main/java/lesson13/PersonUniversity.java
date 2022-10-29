package lesson13;

import lesson13.actions.ActionsForStudent;
import lesson13.actions.ActionsForTeacher;

public class PersonUniversity implements ActionsForStudent, ActionsForTeacher {

    @Override
    public void read() {
        System.out.println("Read the book");
    }

    @Override
    public void answer() {
        System.out.println("Answer questions");
    }

    @Override
    public void tell() {
        System.out.println("Tell in class");
    }

    @Override
    public void listen() {
        System.out.println("Listen to the answers");
    }
}
