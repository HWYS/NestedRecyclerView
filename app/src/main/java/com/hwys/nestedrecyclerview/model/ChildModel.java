package com.hwys.nestedrecyclerview.model;

public class ChildModel {
    private String movieTitle, moviePoster;

    public ChildModel(String movieTitle, String moviePoster) {
        this.movieTitle = movieTitle;
        this.moviePoster = moviePoster;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getMoviePoster() {
        return moviePoster;
    }
}
