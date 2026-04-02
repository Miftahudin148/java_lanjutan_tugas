package service;

import model.Tiket;
import java.util.ArrayList;
import java.util.List;

public class TiketService {

    private List<Tiket> daftarTiket = new ArrayList<>();

    public void tambahTiket(Tiket tiket) {
        daftarTiket.add(tiket);
    }

    public void tampilkanSemuaTiket() {
        System.out.println("=== TIKET KERETA API ===");
        for (Tiket t : daftarTiket) {
            t.displayInfo();
            System.out.println();
        }
    }
}