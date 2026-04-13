package service;

import model.Kereta;
import java.util.ArrayList;
import java.util.List;

public class KeretaService {
    private List<Kereta> daftarKereta = new ArrayList<>();

    public KeretaService() {
        // DATA DINAMIS (bisa ditambah)
        daftarKereta.add(new Kereta("Argo Parahyangan", "Bandung", "Ekonomi", 80000));
        daftarKereta.add(new Kereta("Argo Parahyangan", "Bandung", "Bisnis", 150000));
        daftarKereta.add(new Kereta("Taksaka", "Jakarta", "Ekonomi", 100000));
        daftarKereta.add(new Kereta("Taksaka", "Jakarta", "Bisnis", 200000));
    }

    public void tampilkanKereta() {
        System.out.println("=== DAFTAR KERETA ===");
        int i = 1;
        for (Kereta k : daftarKereta) {
            System.out.println(i + ". " + k.getNamaKereta() + " | " + k.getTujuan() + " | " + k.getKelas() + " | " + k.getHarga());
            i++;
        }
    }

    public Kereta getKereta(int index) {
        return daftarKereta.get(index);
    }
}