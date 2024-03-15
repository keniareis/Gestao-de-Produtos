package org.example;

import org.example.product.ProductController;
import org.example.product.ProductModel;

public class Main {
    public static void main(String[] args) {
        var productController = new ProductController();

        try{
            System.out.println("Teste Criação de produto: ");
            var productBarCode = "001";
            var product = new ProductModel(productBarCode, "Coca", 350, 10);
            System.out.println(productController.create(product));
            System.out.println("");

            var newProduct = new ProductModel("002", "fanta", 300, 10);
            productController.create(newProduct);

            System.out.println("Listando Produtos: ");
            for (ProductModel p: productController.read()) {
                System.out.println("Barcode: " + p.getBarCode());
                System.out.println("Name: " + p.getName());
                System.out.println("Price in Cents: " + p.getPrinceInCents());
                System.out.println("Stock: " + p.getStock());
                System.out.println("==========================================");
            }
            System.out.println();

            System.out.println("Recuperando valor");
            System.out.println("Price in Cents: " + productController.retrivePrice(productBarCode));
            System.out.println();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.println("Para valores negativos");
            var faliedProduct = new ProductModel("002", "Fanta", -5, 10);
            productController.create(faliedProduct);
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println();
        }

        try{
            System.out.println("Para barcode nao existentes");
            productController.retrivePrice("null");
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println();
        }
    }
}