package id.wadah;

import java.util.ArrayList;

public class InheritanceApp {
    public static void main(String[] args) {
        Student s1 = new Student("Ani", 20, "12345");
        Teacher t1 = new Teacher("Pak Joko", 45, "Pemrograman Java");
        Employee e1 = new Employee("Hadi", 49, 2277, 100.25);

        // Polymorphism: semua bisa dipanggil sapa()
        s1.sapa();  // Halo, saya Ani, umur 20 tahun, NIM: 12345.
        t1.sapa();  // Halo, saya Pak Joko, umur 45 tahun, mengajar Pemrograman Java.
        e1.sapa();

        // Method khusus
        s1.belajar();    // Ani sedang belajar...
        t1.mengajar();   // Pak Joko sedang mengajar...
        e1.kerja();

        // toString()
        System.out.println(s1);
        System.out.println(t1);
        System.out.println(e1);

        // Array of Person (Polymorphism!)
        Person[] komunitas = {s1, t1, e1};

        System.out.println("\n--- Sapa Semua ---");
        for (Person p : komunitas) {
            p.sapa(); // otomatis panggil versi yang sesuai!
        }

        // Tambahan dengan ArrayList
        ArrayList<Person> peoples = new ArrayList<>();
        peoples.add(s1);
        peoples.add(t1);
        peoples.add(e1);
        System.out.println("\n--- Sapa Semua ---");
        for (Person p : peoples) {
            if (p instanceof Employee) {
                Employee e = (Employee)p;
                e.kerja();
            }
            p.sapa();
        }
    }
}