package com.webbfontaine.springtraining;

/**
 * Created by anton_6l on 1/18/2016.
 */
public class Person {

    private int id;
    private String name;

    private int taxId;
    private com.webbfontaine.springtraining.Address address;

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    public Person(int id, String name, com.webbfontaine.springtraining.Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }


    public void onCreate(){
        System.out.println("Creating Person...");
    }

    public void onDestroy(){
        System.out.println("Destroying Person...");
    }

    public static Person getInstance(int id, String name, com.webbfontaine.springtraining.Address address){
        System.out.println("Creating a person named bob");
        return new Person(id, name);
    }

    public void speak(){
    }

    public int getTaxId() {
        return taxId;
    }

    public void setTaxId(int taxId) {
        this.taxId = taxId;
    }

    public com.webbfontaine.springtraining.Address getAddress() {
        return address;
    }

    public void setAddress(com.webbfontaine.springtraining.Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", taxId=" + taxId +
                '}';
    }
}
