package id.wadah;

import java.util.ArrayList;

public class PolymorphismApp {
    public static void main(String[] args) {
        // 🧍 Manusia
        Person ani = new Person("Ani", 20);
        Student budi = new Student("Budi", 19, "456");
        Teacher pakJoko = new Teacher("Pak Joko", 45, "Java");

        // 🐱 Hewan
        Animal kucing = new Cat("Tom");
        Animal anjing = new Dog("Spike");

        // ✅ Polymorphism: semua bisa dipanggil meski tipe berbeda
        Hidup[] makhlukHidup = { ani, budi, pakJoko };
        Animal[] hewan = { kucing, anjing };

        System.out.println("=== Makhluk Hidup ===");
        for (Hidup m : makhlukHidup) {
            m.makan();
            m.tidur();
        }

        System.out.println("\n=== Hewan Bersuara ===");
        for (Animal h : hewan) {
            h.bersuara();
            h.bergerak();
        }

        // 🔄 Casting: akses method khusus
        for (Animal h : hewan) {
            if (h instanceof Dog) {
                Dog d = (Dog) h;
                System.out.println("Anjing " + d + " sangat setia!");
            }
        }

        Student hadi = new Student("Hadi", 50, "0495010308");

        ArrayList<DapatNilai> nilai = new ArrayList<>();
        
        nilai.add(budi);
        nilai.add(hadi);
        for (DapatNilai n : nilai) {
            n.belajar();
            System.out.printf("Setelah belajar sekarang mendapatkan nilai: %.2f.%n", n.getNilai());
        }
    }
}
