package uts.controller;

import java.util.ArrayList;
import java.util.List;

import uts.model.Kopi;
import uts.model.MenuItem;
import uts.model.Roti;
import uts.model.Teh;

public class MenuController {
    public List<String> kodeList;
    public List<MenuItem> produkList;

    public MenuController(){
        this.kodeList = new ArrayList<>();
        this.produkList = new ArrayList<>();
    }

    public void addKopi(String id, String nama, double hargaBase, int stok){
        produkList.add(new Kopi(id, nama, hargaBase, stok));
        kodeList.add(id);
    }
    public void addTeh(String id, String nama, double hargaBase, int stok){
        produkList.add(new Teh(id, nama, hargaBase, stok));
        kodeList.add(id);
    }
    public void addRoti(String id, String nama, double hargaBase, int stok){
        produkList.add(new Roti(id, nama, hargaBase, stok));
        kodeList.add(id);
    }

    public List<String> getProductDetail() {
        List<String> allProduct = new ArrayList<>();
        for (MenuItem m : produkList) {
            allProduct.add(m.getOrderDetail());
        }
        return allProduct;
    }
    
    public List<String> getKode() {
        List<String> allProduct = new ArrayList<>();
        for (MenuItem m : produkList) {
            allProduct.add(m.getId());
        }
        return allProduct;
    }

    public List<MenuItem> getProductAll() {
        return produkList;
    }

}