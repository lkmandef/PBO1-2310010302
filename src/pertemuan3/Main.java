package pertemuan3;

public class Main {
    public static void main(String[] args){
        //Membuat objek menggunakan konstruktor
        Mahasiswa mahasiswa1 = new Mahasiswa("Lukman", 20);
        
        //Menampilkan data awal
        mahasiswa1.tampilkkanData();
        
        //Mengubah data menggunakan mutattor
        mahasiswa1.setNama("Zaini");
        mahasiswa1.setUmur(21);
        
        //Menampilkan data setelah diubah
        System.out.println("\nSetelah diubah:");
        System.out.println("Nama: " + mahasiswa1.getNama());
        System.out.println("Umur: " + mahasiswa1.getUmur() + " tahun");
                         
                
    }
    
}
