package com.webbfontaine.springtraining;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by anton_6l on 1/18/2016.
 */
public class App {


    public static void main(String[] args) {

        ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\anton_6l\\IdeaProjects\\UdemySpringTraining\\Lesson17\\src\\main\\java\\com\\webbfontaine\\springtraining\\beans.xml");

        Jungle jungle = (Jungle)context.getBean("jungle");
        System.out.println(jungle);

    }

}
