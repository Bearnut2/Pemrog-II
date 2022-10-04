package prak105_2110817310010_maqiilayufanda;
import java.util.Scanner;
public class PRAK103_2110817310010_MAqiilaYufanda {
    
       public static void main(String[] args) {
        int angka;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan : ");
        angka = keyboard.nextInt();
        
        int i = 5;
        
        do {            
            if (angka % 7 != 0){
                if (i == 5){
                   System.out.print(angka);
                } else {
                    System.out.print(", " + angka);
                }
            }
            
            angka--;
            i--;
        } while (i > 0);
    }
}