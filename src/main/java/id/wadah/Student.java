package id.wadah;

public class Student extends Person implements DapatNilai {
    private String nim;
    private double nilai;

    public Student(String nama, String nim) {
        super(nama);
        this.nim = nim;
        nilai = 100 - (Math.random() * 100);
    }

    public Student(String nama, int umur, String nim) {
        super(nama, umur);
        this.nim = nim;
        nilai = 100 - (Math.random() * 100);
    }

    @Override
    public void sapa() {
        System.out.printf("Halo, saya %s, umur %d tahun, NIM: %s.%n", nama, umur, nim);
    }

    public String getNim() {
        return nim;
    }

    public void belajar() {
        System.out.printf("%s sedang belajar pemrograman Java!%n", nama);
        nilai += 10;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nama='" + nama + '\'' +
                ", umur=" + umur +
                ", nim='" + nim + '\'' +
                '}';
    }

    @Override
    public double getNilai() {
        return nilai;
    }    
}
