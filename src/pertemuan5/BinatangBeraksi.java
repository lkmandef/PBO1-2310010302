package pertemuan5;

public class BinatangBeraksi {
    //inheritance
    static class Anjing extends Binatang{
        public Anjing(String nama, int umur){
            super(nama, umur);
        }
        
        //polymorfisme
        @Override
        public void suara(){
            System.out.println(getNama() + "menggonggong!");
        }
    }
    
    static class Kucing extends Binatang{
        public Kucing(String nama, int umur){
            super(nama, umur);
        }
        
        @Override
        public void suara(){
            System.out.println(getNama() + "mengeong");
        }
    }
    
    public static void main(String[] args){
        Anjing a = new Anjing("Doggy", 3);
        Kucing k = new Kucing("kitty", 2);
        
        System.out.println(" Nama anjing: " + a.getNama());
        System.out.println(" Umur anjing: " + a.getUmur());
        System.out.println(" Nama kucing: " + k.getNama());
        System.out.println(" Umur kucing: " + k.getUmur());
    }
}
