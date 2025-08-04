package id.wadah;

import java.util.Scanner;

public class GreetingWithMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = getInputJumlah(scan);
        if (count < 1) {
            System.out.println("Input tidak valid!");
            scan.close();
            return;
        }
        scan.nextLine();

        String[] nama = new String[count];
        isiNama(nama, scan);
        sapaSemua(nama);

        scan.close();
    }

    public static int getInputJumlah(Scanner scan) {
        System.out.print("Berapa orang? ");
        return scan.nextInt();
    }

    public static void isiNama(String[] nama, Scanner scan) {
        for (int i = 0; i < nama.length; ++i) {
            System.out.printf("Nama ke-%d: ", (i + 1));
            nama[i] = scan.nextLine();
        }
    }

    public static void sapaSemua(String[] nama) {
        for (String n : nama) {
            System.out.printf("Halo, %s!%n", n);
        }
    }
}
