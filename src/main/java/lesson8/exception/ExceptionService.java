package lesson8.exception;

import java.io.IOException;

public class ExceptionService {

    public static void UserExpectedError() {    //unchecked
        throw new NullPointerException();
    }

    public static void WrongFieldException() throws IOException {  //checked
        throw new IOException();
    }

    public static void WrongSumException() throws NoSuchFieldException {    //checked
        throw new NoSuchFieldException();
    }
}
