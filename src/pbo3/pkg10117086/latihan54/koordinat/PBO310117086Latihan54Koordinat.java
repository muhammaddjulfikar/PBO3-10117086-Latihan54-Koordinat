/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117086.latihan54.koordinat;

/**
 *
 * @author Lenovo 
 * NAMA : RD Muhammad Djulfikar BU 
 * KELAS : IF3 
 * NIM : 10117086
 * DESKRIPSI PROGRAM :
 */
public class PBO310117086Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Koordinat koordinat = new Koordinat(10, 4);
    WarnaKoordinat warna = new WarnaKoordinat("Jingga", 10, 4);
    System.out.println("Warna Koordinat : " + warna.getNamaWarna());
    System.out.println("Koordinat Sumbu x : " + koordinat.x + ", " + "y : " + 
                        koordinat.y);
      
    }
    
}

