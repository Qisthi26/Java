/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * Tugas
 * Rabu / 23 Agustus 2023 - PBO X Tel 9

 * 1. Mencari referensi Struktur dan Aturan Penulisan Sintaks Java
 * 2. Membuat kode program sesuai sumber referensi.
 * 3. Hasil program diserahkan dipertemuan berikutnya.
 *   _rekomendasi materi : https://www.petanikode.com/java-sintaks/
 * 
 * 
 * Struktur Dasar Program Java
 * Struktur program Java secara umum dibagi menjadi 4 bagian:

 * 1. Deklarasi Package
 * 2. Impor Library
 * 3. Bagian Class
 * 4. Method Main
 * 
 * @author munaa
 */

package StrukturdanAturanPenulisanSintaksJava; //<- 1. deklarasi package


import java.util.Scanner; // 2. Impor Library

public class Struktur_dan_Aturan_Penulisan_Sintaks { // 3. Bagian Kelas

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //<- 4. Methode Main

        // TODO code application logic here
            System.out.println("Hello World");
            System.out.println("Hello Kode");

         // blok program if (kondisi)
            int belanja = 0;
            Scanner scan = new Scanner(System.in);

            // mengambil input
            System.out.print("Total Belanjaan: Rp ");
            belanja = scan.nextInt();

            // cek apakah dia belanja di atas 100000
            if ( belanja > 100000 ) {
                System.out.println("Selamat, anda mendapatkan hadiah!");
            }
            else
                
            System.out.println("Anda Tidak Mendapatkan Hadiah, Terima kasih...");

            // blok program for (perulangan)
            for (int hitungan = 0; hitungan <= 10; hitungan++) {
                System.out.println("Qisthi lho ..");
            }
            
    }
    
    
}
