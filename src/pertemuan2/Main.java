package pertemuan2;


public class Main {
    public static void main(String[] args){
        //objek
        Hewan hewan1 = new Hewan("Singa", "Karnivora", 5);
        Hewan hewan2 = new Hewan("Gajah", "Herbivora", 10);
        Hewan hewan3 = new Hewan("Simpanse", "Omnivora", 2);
        
        System.out.println("Informasi Hewan 1:");
        hewan1.tampilkaninfo();
        System.out.println();
        System.out.println("Informasi Hewan 2:");
        hewan2.tampilkaninfo();
        System.out.println();
        System.out.println("Informasi Hewan 3:");
        hewan3.tampilkaninfo();
        
    }
    
}
