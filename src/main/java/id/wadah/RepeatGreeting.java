package id.wadah;

import java.util.Scanner;

public class RepeatGreeting {
    public static void main(String args[])
    {
        String nama;
        int count;
        Scanner scan;

        scan = new Scanner(System.in);

        System.out.print("Masukan nama: ");
        nama = scan.nextLine();
        System.out.print("Berapa kali dicetak? ");
        count = scan.nextInt();

        // Dengan menggunakan perulangan for
        for (int i = 0; i < count; i++) {
            System.out.printf("Halo, %s!%n", nama);
        }

        // Dengan menggunakan perulangan while
        while (count > 0) {
            System.out.printf("Halo, %s!%n", nama);
            count--;
        }

        scan.close();

    }
}
