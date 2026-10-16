package quiz2;

import quiz2.view.ProductView;


public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        ProductView view = new ProductView();
        view.start();
    }
}
