/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author seanmacbook
 */
public class OrderItem {
    
    Product product;
    double salesPrice;
    int quntity;

    public OrderItem(Product product, double salesPrice, int quntity) {
        this.product = product;
        this.salesPrice = salesPrice;
        this.quntity = quntity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public int getQuntity() {
        return quntity;
    }

    public void setQuntity(int quntity) {
        this.quntity = quntity;
    }
    
    @Override
    public String toString(){
        return this.product.toString();
    }
}
