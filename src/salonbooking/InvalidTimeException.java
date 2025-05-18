package salonbooking;

// custom exception untuk waktu booking yang tidak valid
public class InvalidTimeException extends Exception {
    public InvalidTimeException(String message) {
        super(message);
    }
}
