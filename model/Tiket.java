package model;

public abstract class Tiket {
    private String nama;
    private String noKursi;
    private String tujuan;
    protected double harga;

    public Tiket(String nama, String noKursi, String tujuan, double harga) {
        this.nama = nama;
        this.noKursi = noKursi;
        this.tujuan = tujuan;
        this.harga = harga;
    }

    //Encapsulation
    public String getNama() {
        return nama;
    }

    public String getNoKursi() {
        return noKursi;
    }

    public String getTujuan() {
        return tujuan;
    }

    public double getHarga() {
        return harga;
    }

    // Abstract Method
    public abstract void displayInfo();
}