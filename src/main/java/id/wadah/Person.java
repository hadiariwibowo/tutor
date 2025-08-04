package id.wadah;

public class Person implements Hidup {
    protected String nama;
    protected int umur;

    public Person(String nama) {
        this.nama = nama;
        this.umur = 0;
    }

    public Person(String nama, int umur) {
        this.nama = nama;
        this.umur = Math.max(umur, 0);
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
        } 
        this.umur = umur;
        return true;
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

    @Override
    public void makan() {
        System.out.printf("%s sedang makan nasi goreng.%n", nama);
    }

    @Override
    public void tidur() {
        System.out.printf("%s sedang tidur nyenyak.%n", nama);
    }
}