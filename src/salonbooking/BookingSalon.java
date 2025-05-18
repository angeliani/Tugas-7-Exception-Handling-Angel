package salonbooking;

import java.util.Scanner;

// main class
public class BookingSalon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====================================================");
        System.out.println("Angeliani Junitaviana Herman");
        System.out.println("245150700111021");
        System.out.println("Teknologi Informasi - C");
        System.out.println("=====================================================");
        System.out.println("˖ ᡣ𐭩 ⊹ ࣪  ౨ৎ˚₊ welcome to angel's salon ˖ ᡣ𐭩 ⊹ ࣪  ౨ৎ˚₊");
        System.out.println("=====================================================");
        try {
            System.out.print("what hour would you like to book? \n9-17 : ");
            int jamBooking = scanner.nextInt();

            // panggil method pengecekan waktu yang bisa throw exception
            SalonTimeChecker.checkTime(jamBooking);

            // jika tidak ada exception, booking berhasil
            System.out.println("\nbooking appointment confirmed! \n✧˚₊‧" + jamBooking + ".00 WIB.‧₊˚✧ \n\nwe'll wait for your arrival! ₊✩‧₊˚౨ৎ˚₊✩‧₊");


        } catch (InvalidTimeException e) {
            // catch custom exception dan tampilkan pesan error
            System.out.println("\nbooking failed: " + e.getMessage());
        } catch (Exception e) {
            // catch exception umum
            System.out.println("\nthere's a mistake ( ˶°ㅁ°) !!: " + e.getMessage());
        } finally {
            System.out.println("=====================================================");
            System.out.println("thank you for choosing angel's salon!૮ ˶ᵔ ᵕ ᵔ˶ ა");
            System.out.println("=====================================================");
            scanner.close();
        }
    }
}
