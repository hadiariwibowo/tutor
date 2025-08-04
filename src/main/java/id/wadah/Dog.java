package id.wadah;

public class Dog implements Animal {
    private String nama;

    public Dog(String nama) {
        this.nama = nama;
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berkata: Guk! Guk!");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " berlari cepat.");
    }

}
