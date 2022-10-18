package prak105_2110817310010_maqiilayufanda;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PRAK105_2110817310010_MAqiilaYufanda {
public static final double PHI = 3.14;
    
    public static void main(String[] args) {
        double jari, tinggi, hasil;
        
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.###");
        
        System.out.print("Masukkan jari-jari : ");
        jari = keyboard.nextDouble();
        
        System.out.print("Masukkan tinggi : ");
        tinggi = keyboard.nextDouble();
        
        hasil = PHI * jari * jari * tinggi;
        
        System.out.println("Volume tabung dengan jari-jari " + jari + " cm ");
        System.out.println("dan tinggi " + tinggi + " cm ");
        System.out.println("adalah " + df.format(hasil) + " m3");
    }
}

