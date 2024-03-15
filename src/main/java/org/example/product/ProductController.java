package org.example.product;

import org.example.exceptions.NegativePriceException;
import org.example.exceptions.NotFoundException;

import java.lang.annotation.Retention;
import java.util.ArrayList;
import java.util.List;

public class ProductController {
        private ArrayList<ProductModel> products;

    public ProductController() {
        this.products = new ArrayList<ProductModel>();
    }

    public String create(ProductModel payload) throws NegativePriceException {
        if (payload.getPrinceInCents() < 0 ){
            throw new NegativePriceException("Preço inválido! O preço deve ser POSITIVO!");
        }
        products.add(payload);

        return "Produto" + payload.getName() + "adicionado";
    }

    public ArrayList<ProductModel> read(){
        return products;
    }

    public Integer retrivePrice(String barCode) throws NotFoundException{
        try {
            var returnProduct  = products.stream().filter(p -> p.getBarCode().equals(barCode)).toList().get(0);
            return returnProduct.getPrinceInCents();
        }catch (Exception e){
            throw new NotFoundException();
        }
    }
}
