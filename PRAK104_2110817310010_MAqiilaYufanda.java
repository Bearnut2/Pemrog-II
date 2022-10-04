package prak105_2110817310010_maqiilayufanda;
import java.util.Scanner;
public class PRAK104_2110817310010_MAqiilaYufanda {
    
        public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Kartu Andi : ");
        int andi1 = keyboard.nextInt();
        int andi2 = keyboard.nextInt();
        int andi3 = keyboard.nextInt();
        
        System.out.println("Kartu Budi : ");
        int budi1 = keyboard.nextInt();
        int budi2 = keyboard.nextInt();
        int budi3 = keyboard.nextInt();
                
        int andi = andi1 + andi2 + andi3;
        int budi = budi1 + budi2 + budi3;
        
        if (andi > budi){
            System.out.println("Andi");
        } else if (andi == budi){
            System.out.println("Seri");
        }
        else {
            System.out.println("Budi");
        }
    }
}