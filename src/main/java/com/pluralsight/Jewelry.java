package com.pluralsight;

public class Jewelry extends FixedAsset{

    private double karat;

    public Jewelry(String name, double karat) {
        super(name, karat * 100);
        this.karat = karat;
    }

    // Override
    @Override
    public double getValue(){
        return karat;
    }

    public double getKarat() {
        return karat;
    }

    public void setKarat(double karat) {
        this.karat = karat;
    }
}
