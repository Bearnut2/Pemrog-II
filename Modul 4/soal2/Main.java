package soal2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int inputUser;
       
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih buku yang ingin diinputkan:");
        System.out.println("1 = Novel");
        System.out.println("2 = Komik");
        System.out.print("Masukkan pilihan: ");
        inputUser = input.nextInt();
        input.nextLine();
        
        if( inputUser == 1 ) {
            String judul, penulis, genre, sinopsis, tahun;
            System.out.print("Judul: ");
            judul = input.nextLine();
            
            System.out.print("Penulis : ");
            penulis = input.nextLine();
            
            System.out.print("Tahun Terbit : ");
            tahun = input.nextLine();
            
            System.out.print("Genre : ");
            genre = input.nextLine();
            
            System.out.print("Sinopsis : ");
            sinopsis = input.nextLine();
            
            Novel novel = new Novel(judul, penulis, tahun, genre, sinopsis);
            System.out.println(novel.getNovelDetail());
            
        } else if ( inputUser == 2 ) {
            String judul, penulis, sinopsis, tahun;
            int volume;
            System.out.print("Judul: ");
            judul = input.nextLine();
            
            System.out.print("Penulis : ");
            penulis = input.nextLine();
            
            System.out.print("Tahun Terbit : ");
            tahun = input.nextLine();
            
            System.out.print("Volume : ");
            volume = input.nextInt();
            input.nextLine();
            
            System.out.print("Sinopsis : ");
            sinopsis = input.nextLine();
            
            Komik komik = new Komik(judul, penulis, tahun, volume, sinopsis);
            System.out.println(komik.getKomikDetail());
        }   
    }
}
