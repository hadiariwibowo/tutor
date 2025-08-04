package id.wadah;

import java.util.Scanner;

public class GreetingWtihAgeCheck {
    public static void main(String[] args)
    {
        String nama;
        int umur;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan umur anda: ");
        umur = scanner.nextInt(); // Bila ada kondisi dimana nextInt dahulu, maka perlu dipanggil lagi nextLine agar menghabiskan newline sebelumnya.
        scanner.nextLine();
        System.out.print("Masukan nama anda: ");
        nama = scanner.nextLine();
        scanner.close();
        if (umur < 17)
            System.out.printf("%s, kamu belum dewasa.%n", nama);
        else
            System.out.printf("%s, kamu sudah dewasa.%n", nama);
    }
}
