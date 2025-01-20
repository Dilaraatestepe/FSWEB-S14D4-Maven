package org.example.model;


public class Store {
    public static void main(String[] args) {

        ProductForSale chocolate = new Chocolate("Milk Chocolate", 2.99, "Milk", 2);
        ProductForSale coke = new Coke("Cola", 1.49, "Acid", "Pepsi");
        ProductForSale bread = new Bread("Bread", 1.99, "Whole Wheat", "Big");


        ProductForSale[] products = new ProductForSale[3];
        products[0] = chocolate;
        products[1] = coke;
        products[2] = bread;


        Store store = new Store();


        store.listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {

            for (ProductForSale product : products) {
                product.showDetails();

            }

    }
}