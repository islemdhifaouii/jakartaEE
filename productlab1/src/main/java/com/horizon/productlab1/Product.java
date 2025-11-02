package com.horizon.productlab1;

public class Product {
    private String name;
    private double prixHT;
    private double TVA;

    public Product (String name,double prixHT,double TVA ){
        this.name=name;
        this.prixHT=prixHT;
        this.TVA=TVA;
    }
    public String getName(){
        return name;
    }
    public double getPrixHT(){
        return prixHT;
    }
    public double getTVA(){
        return TVA;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setPrixHT(double prixHT){
        this.prixHT=prixHT;
    }
    public  void setTVA(double TVA){
        this.TVA=TVA;
    }
}

