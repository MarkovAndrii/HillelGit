package lesson11;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Information newUser = InitializationData.DataProcess();

        List<Integer> integerList = List.of(12, 12, 8);
        Information updateNewUser = updateInformation(integerList, newUser);
        List<Byte> byteList = List.of((byte) 12, (byte) 55, (byte) 1);
        updateInformation(byteList, newUser);
        List<Long> longList = List.of(345L, 56L, 99L);
        updateInformation(longList, newUser);

        output(updateNewUser);
    }

    private static Information updateInformation(List<? extends Number> numbersList, Information newObject) {
        for (Number numb : numbersList) {
            String str = numb.toString();   //nubmer to String
            String newMail = str + "@gmail.com";    //create new mail
            if (!newObject.getUserMail().contains(newMail)) {   //checking new mail
                newObject.getUserName().add(str);
                newObject.getUserMail().add(newMail);
                newObject.getMailForUser().put(newMail, str);
            }
        }
        return newObject;
    }

    private static void output(Information correctObject) {
        System.out.println("Name: " + correctObject.getUserName());
        System.out.println("Mail: " + correctObject.getUserMail());
        System.out.println("Mail & name: " + correctObject.getMailForUser());
    }
}
