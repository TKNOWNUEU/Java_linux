package sesi10_tugas;

public class luas_persegi_panjang extends luas_segitiga {
    private int panjang;
    private int lebar;
    
    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
    
    public int hitungLuas(){
        return panjang*lebar;
    }
}

/* 
Metode inheritance adalah metode dimana sebuah class dapat mengambil method dari class lain. 
Polymorphism adalah metode dimana sebuah class dapat mengambil method dari class lain dan mengubahnya sesuai dengan kebutuhan class tersebut.
Perbedaannya adalah pada program diatas, class luas_segitiga hanya memiliki method hitungLuas() yang mengembalikan nilai luas segitiga. 
Sedangkan pada program diatas, class luas_persegi_panjang memiliki method hitungLuas() yang mengembalikan nilai luas persegi panjang.
*/