package com.gerry.product.model;


import java.math.BigDecimal;


public class Product {

    private String productId;
    private String description;
    private BigDecimal price;
    private Integer quantityOnHand = 0;

    public Product(){

    }

    public Product(String productId, String description, BigDecimal price, Integer quantityOnHand) {
        this.productId = productId;
        this.description = description;
        this.price = price;
        this.quantityOnHand = quantityOnHand;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantityOnHand() {
        return quantityOnHand;
    }

    public void setQuantityOnHand(Integer quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }
}
