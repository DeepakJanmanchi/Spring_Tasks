package com.stackroute.domain;

public class Movie {




    private String movieName;
    private String actorName;
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public void displayMovieInfo(){
        System.out.println("Movie Name is :"+ movieName+ " actor name is:" + actorName);
    }


}
