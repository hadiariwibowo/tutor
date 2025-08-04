package id.wadah;

public class Person {
    private String nama;
    private int umur;

    public Person(String nama) {
        this.nama = nama;
    }

    public void sapa() {
        System.out.printf("Halo, saya %s, umur %d tahun.%n", nama, umur);
    }

    // Getter (opsional)
    public String getNama() {
        return nama;
    }

    public boolean setUmur(int umur) {
        if (umur < 1) {
            return false;
        } else {
            this.umur = umur;
            return true;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "nama='" + nama + '\'' +
                ", umur=" + umur +
                '}';
    }

    public Boolean isDewasa() {
        return (this.umur >= 17);
    }
}