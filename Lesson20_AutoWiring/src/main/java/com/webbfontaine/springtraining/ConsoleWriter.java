package com.webbfontaine.springtraining;

/**
 * Created by Antonio Oro Dungao on 1/20/2016.
 */
public class ConsoleWriter implements Writer{

    public ConsoleWriter(){
    }

    public void write() {
        System.out.println("Console writer...");
    }
}
