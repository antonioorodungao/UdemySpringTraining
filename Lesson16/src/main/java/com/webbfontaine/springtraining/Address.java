package com.webbfontaine.springtraining;

/**
 * Created by anton_6l on 1/18/2016.
 */
public class Address {

    private String street;
    private String postcode;

    public Address(){

    }

    public String getStreet() {
        return street;
    }

    public void init(){
        System.out.println("Initializing Address");
    }

    public void destroy(){
        System.out.println("Destroying Address");
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", postcode='" + postcode + '\'' +
                '}';
    }
}
