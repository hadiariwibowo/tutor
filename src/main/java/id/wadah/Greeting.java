package id.wadah;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args)
    {
        String nama;
        int umur;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan nama anda: ");
        nama = scanner.nextLine();
        System.out.print("Masukan umur anda: ");
        umur = scanner.nextInt(); // Bila ada kondisi dimana nextInt dahulu, maka perlu dipanggil lagi nextLine agar menghabiskan newline sebelumnya.
        scanner.close();
        System.out.printf("Halo, saya %s, umur saya %d tahun.%n", nama, umur);
    }
}
