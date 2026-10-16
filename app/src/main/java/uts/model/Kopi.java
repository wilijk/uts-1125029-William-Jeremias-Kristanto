package app.src.main.java.uts.model;

import java.util.List;

public class Kopi extends MenuItem implements Customizable {
    String rum;
    String es;
    String gula;
    String karamel;

    public Kopi(String id, String nama, double hargaBase, int stok) {
        super(id, nama, hargaBase, stok);
    }

    @Override
    public void customize(List<Integer> customizations) {
        if (customizations.size() >= 5) {
            this.rum = customizations[0] ;
        }
    }

    @Override
    public void customize(int[] customizations) {
        if (customizations.length >= 5) {

        }
    }

    @Override
    public double hitungHargaTotal(int jumlah) {
        return jumlah * getHargaBase();
    }

    @Override
    public double hitungHargaTotal(int jumlah, String kodePromo) {
        String kodeValid = "abc";
        if (kodePromo.equalsIgnoreCase(kodeValid)) {
            return jumlah * getHargaBase();
        }
        return jumlah * getHargaBase();
    }

    @Override
    public double hitungHargaTotal(int jumlah, UkuranKategori ukuran) {

        if (ukuran.toString().equalsIgnoreCase("SMALL")) {
            return jumlah * getHargaBase();
        } else if (ukuran.toString().equalsIgnoreCase("MEDIUM")) {
            return jumlah * getHargaBase() * 1.2;
        } else {
            return jumlah * getHargaBase() * 1.5;
        }
    }

    @Override

    public String getOrderDetail() {
        return getId() + ": " + getNama() + " - " + getStok() + " - ";
    }
}