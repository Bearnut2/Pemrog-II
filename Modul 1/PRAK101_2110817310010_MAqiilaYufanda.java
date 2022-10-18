package prak105_2110817310010_maqiilayufanda;
import java.util.Scanner;
public class PRAK101_2110817310010_MAqiilaYufanda {
     public static void main(String[] args) {
      
        String nama, tempat, bulanLahir;
        int tanggal, bulan, tahun, tinggi;
        float berat;
        
        Scanner keyboard = new Scanner(System.in);
        
        
        System.out.print("Masukkan Nama Lengkap : ");
        nama = keyboard.nextLine();

        System.out.print("Masukkan Tempat Lahir : ");
        tempat = keyboard.nextLine();
        
        System.out.print("Masukkan Tanggal Lahir : ");
        tanggal = keyboard.nextInt();
        
        System.out.print("Masukkan Bulan Lahir : ");
        bulan = keyboard.nextInt();
        
        System.out.print("Masukkan Tahun Lahir : ");
        tahun = keyboard.nextInt();
        
        System.out.print("Masukkan Tinggi Badan : ");
        tinggi = keyboard.nextInt();
        
        System.out.print("Masukkan Berat Badan : ");
        berat = keyboard.nextFloat();
        
        switch (bulan) {
            case 1:
                bulanLahir = "Januari";
                break;
            case 2:
                bulanLahir = "Februari";
                break;
            case 3:
                bulanLahir = "Maret";
                break;
            case 4:
                bulanLahir = "April";
                break;
            case 5:
                bulanLahir = "Mei";
                break;
            case 6:
                bulanLahir = "Juni";
                break;
            case 7:
                bulanLahir = "Juli";
                break;
            case 8:
                bulanLahir = "Agustus";
                break;
            case 9:
                bulanLahir = "September";
                break;
            case 10:
                bulanLahir = "Oktober";
                break;
            case 11:
                bulanLahir = "November";
                break;
            case 12:
                bulanLahir = "Desember";
                break;
            default:
                throw new AssertionError();
        }
        System.out.println("Data telah ditambahkan,");
        System.out.print("Nama Lengkap " + nama);
        System.out.print(", Lahir di " + tempat);
        System.out.println(" pada Tanggal " + tanggal + " " + bulanLahir + " " + tahun);
        System.out.print("Tinggi Badan " + tinggi + " cm ");
        System.out.println("dan Berat Badan " + berat + " Kilogram");
    }
}