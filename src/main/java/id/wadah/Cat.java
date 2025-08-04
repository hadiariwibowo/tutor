package id.wadah;

public class Cat implements Animal {
    private String nama;

    public Cat(String nama) {
        this.nama = nama;
    }    

    @Override
    public void bersuara() {
        System.out.println(nama + " berkata: Meong!");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " berjalan pelan-pelan.");
    }

}
