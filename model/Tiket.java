package model;

import java.text.NumberFormat;
import java.util.Locale;

public class Tiket {
    private static int counter = 1;

    private String nama;
    private String noKursi;
    private Kereta kereta;

    public Tiket(Kereta kereta) {
        this.nama = "Miftah"; 
        this.noKursi = "A" + counter++; 
        this.kereta = kereta;
    }

    public double getHarga() {
        return kereta.getHarga();
    }

    public String formatRupiah(double angka) {
        NumberFormat rupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        return rupiah.format(angka);
    }

    public void displayInfo() {
        System.out.println("=== TIKET KERETA API ===");
        System.out.println("Nama        : " + nama);
        System.out.println("No Kursi    : " + noKursi);
        System.out.println("Kereta      : " + kereta.getNamaKereta());
        System.out.println("Tujuan      : " + kereta.getTujuan());
        System.out.println("Kelas       : " + kereta.getKelas());
        System.out.println("Harga       : " + formatRupiah(getHarga()));
    }
}