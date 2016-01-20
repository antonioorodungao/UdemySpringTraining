package com.webbfontaine.springtraining;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Antonio Oro Dungao on 1/18/2016.
 */
public class Jungle {

    List<Animal> animals;
    Animal largest;

    private Map<String, String> foods;

    private Map<String, Plant> plants;

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public Animal getLargest() {
        return largest;
    }

    public void setLargest(Animal largest) {
        this.largest = largest;
    }

    public Map<String, String> getFoods() {
        return foods;
    }

    public void setFoods(Map<String, String> foods) {
        this.foods = foods;
    }

    public Map<String, Plant> getPlants() {
        return plants;
    }

    public void setPlants(Map<String, Plant> plants) {
        this.plants = plants;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        for(Animal animal: animals){
            sb.append(animal.toString());
            sb.append("\n");
        }

        StringBuilder sbf = new StringBuilder("Foods: ");
        for(String food: foods.keySet()){
            sbf.append(foods.get(food)).append(" ");

        }

        StringBuilder sbp = new StringBuilder("Plants:");
        for(String key: plants.keySet()){
            sbp.append(plants.get(key)).append(" ");
        }
        return "Jungle{" +
                "animals=" + sb.toString() +  "\n" +
                ", largest=" + largest + "\n" +
                ", foods= " + sbf.toString() + "\n" +
                ", plants= " + sbp.toString() +
                '}';
    }
}
