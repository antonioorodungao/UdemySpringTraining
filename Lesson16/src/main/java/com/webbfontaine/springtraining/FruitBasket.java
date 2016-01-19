package com.webbfontaine.springtraining;

import java.util.List;

/**
 * Created by anton_6l on 1/18/2016.
 */
public class FruitBasket {

    private String name;
    private List<String> fruits;

    public FruitBasket(String name, List fruits){
        this.name = name;
        this.fruits = fruits;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" contains: \n");

        for(String fruit: fruits){
            sb.append(fruit);
            sb.append("\n");
        }

        return sb.toString();
    }
}
