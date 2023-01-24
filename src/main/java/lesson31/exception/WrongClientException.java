package lesson31.exception;

import java.io.IOException;

public class WrongClientException extends IOException {
    public WrongClientException(String message) {
        super(message);
    }
}
