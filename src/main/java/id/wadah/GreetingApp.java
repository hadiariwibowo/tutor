package id.wadah;

import java.util.Scanner;

public class GreetingApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Berapa orang? ");
        int count = scan.nextInt();
        scan.nextLine();

        Person[] orang = new Person[count];

        for (int i = 0; i < count; i++) {
            System.out.printf("Nama ke-%d: ", i + 1);
            String nama = scan.nextLine();
            System.out.printf("Umur %s: ", nama);
            int umur = scan.nextInt();            
            scan.nextLine(); // bersihkan

            orang[i] = new Person(nama);

            while (!orang[i].setUmur(umur)) {
                System.out.printf("Umur tidak valid, umur %s: ", nama);
                umur = scan.nextInt();
                scan.nextLine(); // bersihkan
            }
        }

        System.out.println("\n--- Daftar Orang ---");
        for (Person p : orang) {
            p.sapa();
        }

        // Mencoba menggunakan toString()
        for (Person p : orang) {
            System.out.print(p);
            if (p.isDewasa()) {
                System.out.println(", anda sudah dewasa!");
            } else {
                System.out.println(", anda belum dewasa!");
            }
        }

        scan.close();
    }
}