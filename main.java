import model.Tiket;
import model.Kereta;

import service.KeretaService;

import payment.Pembayaran;
import payment.TransferBank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        KeretaService keretaService = new KeretaService();

        // Tampilkan daftar kereta
        keretaService.tampilkanKereta();

        System.out.print("Pilih kereta (nomor): ");
        int pilih = input.nextInt();

        // Ambil data kereta
        Kereta keretaDipilih = keretaService.getKereta(pilih - 1);

        // Buat tiket (tanpa input nama & kursi)
        Tiket tiket = new Tiket(keretaDipilih);

        System.out.println();
        tiket.displayInfo();

        System.out.println("\n=== PEMBAYARAN ===");

        Pembayaran bayar = new TransferBank();
        bayar.prosesPembayaran(tiket.getHarga());
    }
}