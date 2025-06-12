/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 * nama : Lukmanul Hakim
 * npm  : 2310010398
 * kelas: 4C
 */
public class Rumus {
    int sisi;
    int panjang;
    int lebar;
    int hasil;

    public Rumus() {
        this.sisi = 0;
        this.panjang = 0;
        this.lebar = 0;
        this.hasil = 0;
    }
    public void hitungLuasPersegi() {
        hasil = sisi * sisi;
    }
    public void hitungLuasPersegiPanjang() {
        hasil = panjang * lebar;
    }
    public int getHasil() {
        return hasil;
    }
}
