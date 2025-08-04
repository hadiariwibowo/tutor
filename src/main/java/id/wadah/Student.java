package id.wadah;

public class Student extends Person {
    private String nim;

    public Student(String nama, String nim) {
        super(nama);
        this.nim = nim;
    }

    public Student(String nama, int umur, String nim) {
        super(nama, umur);
        this.nim = nim;
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
    }

    @Override
    public String toString() {
        return "Student{" +
                "nama='" + nama + '\'' +
                ", umur=" + umur +
                ", nim='" + nim + '\'' +
                '}';
    }    
}
