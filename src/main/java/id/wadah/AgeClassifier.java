package id.wadah;

import java.util.Scanner;

public class AgeClassifier {
    public static void main(String[] args)
    {
        String nama;
        int umur;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan umur anda: ");
        umur = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Masukan nama anda: ");
        nama = scanner.nextLine();

        System.out.printf("Hai %s, kamu termasuk ", nama);

        if (umur < 5) {
            System.out.printf("balita.%n");
        } else if (umur <= 12) {
            System.out.printf("anak-anak.%n");
        } else if (umur <= 17) {
            System.out.printf("remaja.%n");
        } else if (umur <= 59) {
            System.out.printf("dewasa.%n");
        } else if (umur >= 60) {
            System.out.printf("lansia.%n");
        }

        scanner.close();
    }
}
