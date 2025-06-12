package pertemuan3;

public class Mahasiswa {
    //Atribut
    private String nama;
    private int umur;
    
    //Method Konstruktor
    public Mahasiswa(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }
    
    //Method Mutator/setter
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setUmur(int umur){
        this.umur = umur;
    }
    
    //Method Accessor/getter
    public String getNama(){
        return nama;
    }
    
    public int getUmur(){
        return umur;
    }
    
    //Method untuk menampilkan data
    public void tampilkkanData(){
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
    }
            
            
}
