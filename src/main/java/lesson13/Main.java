package lesson13;

import lesson13.actions.ActionsForAdmin;
import lesson13.actions.ActionsForStudent;
import lesson13.actions.ActionsForTeacher;
import lesson13.actions.ActionsForUser;

public class Main {
    public static void main(String[] args) {

        //Object PersonComputer - methods call
        PersonComputer personComputer = new PersonComputer();
        personComputer.turnOnComputer();
        personComputer.turnOffComputer();
        personComputer.turnOnServer();
        personComputer.turnOffServer();
        personComputer.work();

        //Implemented interfaces - static methods call
        ActionsForUser.performTask();
        ActionsForAdmin.serverSettings();

        //Object PersonUniversity - methods call
        PersonUniversity personUniversity = new PersonUniversity();
        personUniversity.read();
        personUniversity.answer();
        personUniversity.tell();
        personUniversity.listen();
        personUniversity.work();

        //Implemented interfaces - static methods call
        ActionsForStudent.learnLanguage();
        ActionsForTeacher.teachEnglish();

        //Test values
        String input1 = null;
        String input2 = "";
        String input3 = "     ";
        String input4 = "i.gmail.com";
        String input5 = "i@gmail.com";

        System.out.println("Output is: " + Helper.check(input5).get());
        System.out.println("Output is: " + Helper.check(input1));
        System.out.println("Output is: " + Helper.check(input2));
        System.out.println("Output is: " + Helper.check(input3));
        System.out.println("Output is: " + Helper.check(input4).get());

    }
}
