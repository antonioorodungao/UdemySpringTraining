package com.webbfontaine.springtraining;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by Antonio Oro Dungao on 1/20/2016.
 */
public class App20 {

    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\anton_6l\\IdeaProjects\\UdemySpringTraining\\Lesson20_AutoWiring\\src\\main\\java\\com\\webbfontaine\\springtraining\\bean.xml");

        Logger logger = (Logger)context.getBean("logger");
        logger.log();

        ((FileSystemXmlApplicationContext)context).close();
    }


}
