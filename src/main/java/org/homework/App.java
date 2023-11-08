package org.homework;


import org.apache.log4j.BasicConfigurator;
import org.homework.firstTask.PersonInfo;
import org.homework.firstTask.Hello;
import org.homework.firstTask.Symbols;
import org.homework.firstTask.WithConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class App {
    private static final Logger LOGGER =  LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();

        char first = new Hello().print();

        System.out.println(first);
        // with logger
        LOGGER.info(String.valueOf(first));

        // with constructor
        PersonInfo person1 = new PersonInfo(32,180);
        person1.info();
        // without constructor
        PersonInfo person2 = new PersonInfo();
        person2.setAge(25);
        person2.setHeight(175);
        person2.info();
        // with logger
        person2.log();

        Symbols s = new Symbols();
        s.setter();

        System.out.println(s.getFirst()+" " + s.getSecond());

        s.setter('6');
        System.out.println(s.getFirst()+" " + s.getSecond());

        s.setter('8', '&');
        System.out.println(s.getFirst()+" " + s.getSecond());

        new WithConstruct();
        new WithConstruct(168.22);
        new WithConstruct(55.6, 12.5);





    }
}