package id.wadah;

public class Person {
    private String nama;
    private int umur;

    public Person(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void sapa() {
        System.out.printf("Halo, saya %s, umur %d tahun.%n", nama, umur);
    }

    // Getter (opsional)
    public String getNama() {
        return nama;
    }
}