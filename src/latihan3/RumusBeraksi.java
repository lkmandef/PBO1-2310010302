/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

public class RumusBeraksi {
    public static void main(String[] args) {
        Rumus Lukman = new Rumus();

        Lukman.sisi = 4;
        Lukman.panjang = 6;
        Lukman.lebar = 3;

        Lukman.hitungLuasPersegi();
        System.out.println("Luas Persegi: " + Lukman.getHasil());

        Lukman.hitungLuasPersegiPanjang();
        System.out.println("Luas Persegi Panjang: " + Lukman.getHasil());
    }
}

