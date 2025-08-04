package id.wadah;

public class Teacher extends Person {
    private String mataPelajaran;

    public Teacher(String nama, String mataPelajaran) {
        super(nama);
        this.mataPelajaran = mataPelajaran;
    }

    public Teacher(String nama, int umur, String mataPelajaran) {
        super(nama, umur);
        this.mataPelajaran = mataPelajaran;
    }

    @Override
    public void sapa() {
        System.out.printf("Halo, saya %s, umur %d tahun, mengajar %s.%n", nama, umur, mataPelajaran);
    }

    public void mengajar() {
        System.out.printf("%s sedang mengajar %s.%n", nama, mataPelajaran);
    }

    public String getMataPelajaran() {
        return mataPelajaran;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "nama='" + nama + '\'' +
                ", umur=" + umur +
                ", mataPelajaran='" + mataPelajaran + '\'' +
                '}';
    }
}