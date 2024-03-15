package org.example.product;

public class ProductModel {

    private String barCode;
    private String name;
    private Integer princeInCents;
    private Integer stock;

    public ProductModel(){}

    public ProductModel(String barCode, String name, Integer princeInCents, Integer stock) {
        this.barCode = barCode;
        this.name = name;
        this.princeInCents = princeInCents;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrinceInCents() {
        return princeInCents;
    }

    public void setPrinceInCents(Integer princeInCents) {
        this.princeInCents = princeInCents;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getBarCode() {
        return barCode;
    }
}
