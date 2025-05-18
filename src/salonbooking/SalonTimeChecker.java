package salonbooking;

// kelas yang memproses logika pengecekan waktu booking
public class SalonTimeChecker {

    // method ini akan ngethrow exception jika jam booking tidak valid
    public static void checkTime(int jam) throws InvalidTimeException {
        if (jam < 9 || jam > 17) {
            throw new InvalidTimeException("invalid hour ( • ᴖ • ｡) \nthe salon opens from 09.00 to 17.00 WIB!");
        }
    }
}
