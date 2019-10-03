package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;

public class Main {
    public static void main(String args[]){
        ApplicationContext con = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie = (Movie) con.getBean("movie", Movie.class);
        movie.displayMovieInfo();
        Actor actor1 = con.getBean("actor1", Actor.class);
        Actor actor2 = con.getBean("actor2", Actor.class);
        Actor actor3 = con.getBean("actor3", Actor.class);
        System.out.println(actor1.toString());
        System.out.println(actor2.toString());
        System.out.println(actor3.toString());
    }
}
