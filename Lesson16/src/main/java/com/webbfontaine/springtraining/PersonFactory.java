package com.webbfontaine.springtraining;

/**
 * Created by anton_6l on 1/18/2016.
 */
public class PersonFactory {
    public Person createPerson(int id, String name){
        System.out.println("Creating person from person factory");
        return new Person(id, name);
    }
}
