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
        Actor actor = con.getBean("actor", Actor.class);
        System.out.println(actor.toString());
    }
}
