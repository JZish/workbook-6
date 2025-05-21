package com.pluralsight;

import java.util.ArrayList;

public class portfolio {

    private String name;
    private String owner;
    private ArrayList<Valuable> assets = new ArrayList<>();


    public portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    double add(Valuable asset){
        asset.add(asset);
    }

    public double getValue(){
        double total = 0;
        for (Valuable asset : assets) {
            total += asset.getValue();
        }
        return total;
    }

    double getMostValuable(){
        if (assets.isEmpty()) return null;
        Valuable max = assets.get(0);
        for (Valuable asset : assets) {
            if (asset.getValue() > max.getValue()) {
                max = asset;
            }
        }
        return max;
    }

    double getLeastValuable(){
        if (assets.isEmpty()) return null;
        Valuable min = assets.get(0);
        for (Valuable asset : assets) {
            if (asset.getValue() < min.getValue()) {
                min = asset;
            }
        }
        return min;
    }

}
