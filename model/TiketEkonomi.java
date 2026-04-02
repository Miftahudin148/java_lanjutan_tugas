package model;

public class TiketEkonomi extends Tiket {

    public TiketEkonomi(String nama, String noKursi, String tujuan) {
        super(nama, noKursi, tujuan, 80000);
    }

    @Override
    public void displayInfo() {
        System.out.println("Nama      : " + getNama());
        System.out.println("No Kursi  : " + getNoKursi());
        System.out.println("Tujuan    : " + getTujuan());
        System.out.println("Harga     : " + harga);
    }
}