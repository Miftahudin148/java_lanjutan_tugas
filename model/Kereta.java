package model;

public class Kereta {
    private String namaKereta;
    private String tujuan;
    private String kelas;
    private double harga;

    public Kereta(String namaKereta, String tujuan, String kelas, double harga) {
        this.namaKereta = namaKereta;
        this.tujuan = tujuan;
        this.kelas = kelas;
        this.harga = harga;
    }

    public String getNamaKereta() {
        return namaKereta;
    }

    public String getTujuan() {
        return tujuan;
    }

    public String getKelas() {
        return kelas;
    }

    public double getHarga() {
        return harga;
    }
}