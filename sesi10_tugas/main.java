/*      
 * buatlah program sederhana menghitung luas segitiga dan persegi panjang dan jelaskan metode inhe dan polymorphism
 */
package sesi10_tugas;

public class main {
    public main() {
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        luas_segitiga segitiga = new luas_segitiga();
        luas_persegi_panjang persegi_panjang = new luas_persegi_panjang();
        
        segitiga.setAlas(10);
        segitiga.setTinggi(5);
        System.out.println("Luas Segitiga = "+segitiga.hitungLuas());
        
        persegi_panjang.setPanjang(10);
        persegi_panjang.setLebar(5);
        System.out.println("Luas Persegi Panjang = "+persegi_panjang.hitungLuas());
    }
}
