package lesson8.util;

import lesson8.entity.Client;
import lesson8.exception.ExceptionService;

import java.io.IOException;

public class CheckParameters {

    public static void compareLengthClientAccountId(String clientAccountId) throws IOException {
        if (clientAccountId.length() != 10) {
            ExceptionService.WrongFieldException();
        }
    }

    public static void compareSum(double sum) throws NoSuchFieldException {
        if (sum > 1000) {
            ExceptionService.WrongSumException();
        }
    }

    public static void compareClient(String senderClientAccountId, String recipientClientAccountId) {
        if ((senderClientAccountId.equals(recipientClientAccountId)) == false) {
            ExceptionService.UserExpectedError();
        }
    }
}
