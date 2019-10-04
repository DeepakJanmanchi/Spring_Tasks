package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie {
    String movieName;
    @Autowired
    Actor actor1;

    public Movie(String movieName, Actor actor1) {
        this.movieName = movieName;
        this.actor1 = actor1;
    }

    public void displayMovieInfo(){
        System.out.println("Movie Name is :"+ movieName+ " actor name is:" + actor1);
    }


}
