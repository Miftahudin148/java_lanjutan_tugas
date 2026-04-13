import model.Tiket;
import model.TiketEkonomi;

import payment.Pembayaran;
import payment.TransferBank;
import payment.EWallet;

import service.TiketService;

public class main {
    public static void main(String[] args) {

        
        TiketService service = new TiketService();

        // Membuat tiket
        Tiket tiket1 = new TiketEkonomi("Miftah", "A1", "Bandung");
        service.tambahTiket(tiket1);

        // Tampilkan tiket
        service.tampilkanSemuaTiket();

        System.out.println("=== PEMBAYARAN ===");

        // Pembayaran
        Pembayaran bayar1 = new TransferBank();
        bayar1.prosesPembayaran(tiket1.getHarga());

        System.out.println();
    }
}