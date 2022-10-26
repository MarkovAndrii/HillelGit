package lesson13;

import lesson13.actions.ActionsForAdmin;
import lesson13.actions.ActionsForUser;

public class PersonComputer implements ActionsForUser, ActionsForAdmin {

    @Override
    public void work() {
        ActionsForAdmin.super.work();
    }

    @Override
    public void turnOnServer() {
        System.out.println("The server is on");
    }

    @Override
    public void turnOffServer() {
        System.out.println("The server is off");
    }

    @Override
    public void turnOnComputer() {
        System.out.println("The computer is on");
    }

    @Override
    public void turnOffComputer() {
        System.out.println("The computer is off");
    }
}
