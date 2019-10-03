package com.stackroute.domain;

public class Movie {




    String movieName;
    Actor actorName;

    public Movie(String movieName, Actor actorName) {
        this.movieName = movieName;
        this.actorName = actorName;
    }

    public void displayMovieInfo(){
        System.out.println("Movie Name is :"+ movieName+ " actor name is:" + actorName);
    }


}
