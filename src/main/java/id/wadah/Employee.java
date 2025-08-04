package id.wadah;

public class Employee extends Person {
    private int idKaryawan;
    private double gaji;

    public Employee(String nama, int idKaryawan, double gaji) {
        super(nama);
        this.idKaryawan = idKaryawan;
        this.gaji = gaji;
    }

    public Employee(String nama, int umur, int idKaryawan, double gaji) {
        super(nama, umur);
        this.idKaryawan = idKaryawan;
        this.gaji = gaji;
    }

    @Override
    public void sapa() {
        System.out.printf("Halo, saya %s, umur %d tahun, bekerja dengan id %d dan gaji %f.%n", nama, umur, idKaryawan, gaji);
    }

    public void kerja() {
        System.out.printf("%s dengan id %d dan gaji %f sedang bekerja.%n", nama, idKaryawan, gaji);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nama='" + nama + '\'' +
                ", umur=" + umur +
                ", idKaryawan='" + idKaryawan + '\'' +
                ", gaji='" + gaji + '\'' +
                '}';
    }    
}
