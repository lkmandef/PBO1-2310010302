package pertemuan2;


public class Hewan {
    //Atribut
    String nama;
    String jenis;
    int umur;
    
    //Constructor
    public Hewan(String nama, String jenis, int umur) {
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
    }
    
    //Method
    public void tampilkaninfo(){
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("umur: " + umur);
        
    }
    
}
