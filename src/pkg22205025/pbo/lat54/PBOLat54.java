/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22205025.pbo.lat54;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 * Nama :Ma'rifatu Khirzah
 * Nim :22205025
 * Prodi :Teknik Informatika
 * Deskripsi :Membuat program dengan menentukan sumbu koordinat
 */
// Kelas Koordinat 
class Koordinat {
    // Atribut 

    private int x;
    private int y;
    //Constructor 

    public Koordinat(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // Method getX()

    public int getX() {
        return x;
    }
    // Method setX()

    public void setX(int x) {
        this.x = x;
    }
    // Method getY()

    public int getY() {
        return y;
    }
    // Method setY()

    public void setY(int y) {
        this.y = y;
    }
}
// Kelas WarnaKoordinat 

class WarnaKoordinat extends Koordinat {

    //Atribut 
    private String namaWarna;

    //Constructor 
    public WarnaKoordinat(int x, int y, String namaWarna) {
        super(x, y);
        this.namaWarna = namaWarna;
    }
    // Method getNamaWarna()

    public String gatNamaWarna() {
        return namaWarna;
    }
    // Method setNamaWarna ()

    public void setNamaWarna(String namaWarna) {
        this.namaWarna = namaWarna;
    }
}
// Main Class 

public class PBOLat54 {
    // Method main()

    public static void main(String[] args) {
        // Membuat objek Warnakoordinat 
        WarnaKoordinat koordinat = new WarnaKoordinat(10, 4, "Jingga");
        // Menampilkan atribut dari objek koordinat 
        System.out.println("X: " + koordinat.getX());
        System.out.println("Y: " + koordinat.getY());
        System.out.println("Warna: " + koordinat.gatNamaWarna());
    }
}