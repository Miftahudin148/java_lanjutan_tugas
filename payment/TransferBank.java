package payment;

public class TransferBank implements Pembayaran {

    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Metode Pembayaran : Transfer Bank");
        System.out.println("Total Bayar       : " + jumlah);
    }
}