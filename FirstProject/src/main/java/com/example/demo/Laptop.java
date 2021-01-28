package com.example.demo;

import org.springframework.stereotype.Component;

@Component("lap")
public class Laptop {
private int lid;
private String brand;
private String price;
public int getLid() {
	return lid;
}
public void setLid(int lid) {
	this.lid = lid;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
@Override
public String toString() {
	return "Laptop [lid=" + lid + ", brand=" + brand + ", price=" + price + "]";
}
public void compile(){
	System.out.println();
}
}
