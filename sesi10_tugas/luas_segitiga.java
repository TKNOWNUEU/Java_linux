package sesi10_tugas;

public class luas_segitiga {
    private int alas;
    private int tinggi;
    
    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    public int hitungLuas(){
        return (alas*tinggi)/2;
    }
}
 
/*
Metode inheritance adalah metode dimana sebuah class dapat mengambil method dari class lain.
Polymorphism adalah metode dimana sebuah class dapat mengambil method dari class lain dan mengubahnya sesuai dengan kebutuhan class tersebut.
Perbedaannya adalah pada program diatas, class luas_segitiga hanya memiliki method hitungLuas() yang mengembalikan nilai luas segitiga.
Sedangkan pada program diatas, class luas_persegi_panjang memiliki method hitungLuas() yang mengembalikan nilai luas persegi panjang.
*/
