package pertemuan5;

public class Binatang {
   //Enkapulasi
    private String nama;
    private int umur;
    
    //Konstruktor
    public Binatang(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }
    
    //getter
    public String getNama(){
        return nama;
    }
    public int getUmur(){
        return umur;
    }
    
    //method suara
    public void suara(){
        System.out.println("Binatang bersuara...");
    }
}
