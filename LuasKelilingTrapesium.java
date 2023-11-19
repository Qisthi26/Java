/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_InputOutput;

import java.util.Scanner;

/**
 *
 * @author munaa
 */
public class LuasKelilingTrapesium {

    /**
     *
     * @param args
     */
    public static void main(String[]args) {
        
        int atas,bawah,tinggi,ab,bc,cd,da;
        
        Scanner iniScanner;
        iniScanner = new Scanner(System.in);
        
        //Luas Trapesium
        System.out.println("Rumus Luas Trapesium");
        System.out.println("L = 1/2 x (a+b) x t");
        System.out.println("\n");
        
        System.out.print("Atas = ");
        atas = iniScanner.nextInt();
        
        System.out.print("Bawah = ");
        bawah = iniScanner.nextInt();
        
        System.out.print("Tinggi = ");
        tinggi = iniScanner.nextInt();
        
        var L = ((atas + bawah) * tinggi) / 2;
        
        System.out.println("\n");
        System.out.println("luas Trapesium = " + L + "cm2");
        System.out.println("\n");
        
        //Keliling Trapesium
        System.out.println("Rumus keliling Trapesium");
        System.out.println("K = ab + bc + cd + da");
        System.out.println("\n");
        
        System.out.print("ab = ");
        ab = iniScanner.nextInt();
        
        System.out.print("bc = ");
        bc = iniScanner.nextInt();
        
        System.out.print("cd = ");
        cd = iniScanner.nextInt();
        
        System.out.print("da = ");
        da = iniScanner.nextInt();
        
        var K = ab + bc + cd + da;
        
        System.out.println("\n");
        System.out.println("Keliling Trapesium = " + K + "cm");
        System.out.println("\n");
        
    }
    
}
