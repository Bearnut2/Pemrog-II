package PRAK202_2110817310010_M.AqiilaYufanda;
import java.text.DecimalFormat;
class Mobil {
    String merek;
    String tahun;
    int kapasitas;
    int harga;
    String pemilik;

    DecimalFormat dfharga = new DecimalFormat("###,###,###");
    DecimalFormat dfpajak = new DecimalFormat("#,###,###");
    
    void info() {
        System.out.println("Merek Mobil: " + this.merek);
        System.out.println("Harga: Rp. " + dfharga.format(this.harga));
        System.out.println("Tahun Keluaran: " + this.tahun);
        System.out.println("Kapasitas: " + this.kapasitas + "cc");
}
void setPemilik(String pemilik) {
    this.pemilik = pemilik;
}
String getPemilik() {
       return this.pemilik;
}
String getPajak() {
       int pajak = harga * 2 / 100;
       return dfpajak.format(pajak);
    }
}

