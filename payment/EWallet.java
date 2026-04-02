package payment;

public class EWallet implements Pembayaran {

    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Metode Pembayaran : E-Wallet");
        System.out.println("Total Bayar       : " + jumlah);
    }
}