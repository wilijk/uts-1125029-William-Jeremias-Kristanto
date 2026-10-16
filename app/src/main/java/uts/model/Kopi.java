package uts.model;

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
        if (customizations.size() >= 3) {
            this.rum = customizations.get(0).toString();
            this.es = customizations.get(1).toString();
            this.gula = customizations.get(2).toString();
            this.karamel = customizations.get(3).toString();
        }
    }

    @Override
    public void customize(int[] customizations) {
        if (customizations.length >= 3) {
            setHargaBase(customizations[0]);
            setHargaBase(customizations[1]);
            setHargaBase(customizations[2]);
            setHargaBase(customizations[3]);
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