package id.wadah;

import java.util.Scanner;

public class GreetingEveryone {
    public static void main(String[] args)
    {
        String[] nama;
        int count;
        Scanner scan;

        scan = new Scanner(System.in);

        System.out.print("Berapa orang? ");
        count = scan.nextInt();
        scan.nextLine();

        if (count < 1) {
            System.out.println("Input tidak valid!");
            scan.close();
            return;
        }

        nama = new String[count];
        
        for (int i = 0; i < count; ++i) {
            System.out.printf("Nama ke-%d: ", (i + 1));
            nama[i] = scan.nextLine();
        }

        for (int i = 0; i < count; ++i) {
            System.out.printf("Halo, %s!%n", nama[i]);
        }

        scan.close();
    }
}
