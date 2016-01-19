package com.webbfontaine.springtraining;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new FileSystemXmlApplicationContext("C:\\Users\\anton_6l\\IdeaProjects\\UdemySpringTraining\\src\\main\\java\\com\\webbfontaine\\springtraining\\beans\\beans.xml");
//        Person p = (Person) context.getBean("person");
//        Person p2 = (Person) context.getBean("person");
//
//        p.setTaxId(555);
//        System.out.println(p);
//        System.out.println(p2);
//
//        Person p3 = (Person) context.getBean("person2");
//        System.out.println(p3);
//
//        Address address = (Address) context.getBean("address");
//
//        Address address2 = (Address) context.getBean("address2");
//
//        Address address3 = (Address) context.getBean("address3");
//
//        System.out.println(address);
//
//        System.out.println(address2);
//
//        System.out.println(address3);

        FruitBasket fb = (FruitBasket) context.getBean("fruitBasket");

        System.out.println(fb);
        ((FileSystemXmlApplicationContext) context).destroy();
        ((FileSystemXmlApplicationContext) context).close();


    }
}
