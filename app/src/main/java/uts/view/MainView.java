package uts.view;

import uts.controller.MenuController;

public class MainView {
    MenuController cont = new MenuController();

    public void printData() {
        for(String c : cont.getProductDetail()) {
            System.out.println(c);
        }
    }
}
