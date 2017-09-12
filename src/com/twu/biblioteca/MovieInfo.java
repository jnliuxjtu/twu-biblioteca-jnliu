package com.twu.biblioteca;

public class MovieInfo {
    private String MovieName;
    private String MovieYear;
    private String MovieDirector;
    private String MovieRate;
    private Boolean InDock;

    public void setInDock(Boolean inDock) {
        InDock = inDock;
    }
    public Boolean getInDock() {
        return InDock;
    }

    public MovieInfo(String MovieName, String MovieYear, String MovieDirector, String MovieRate){

        this.MovieName = MovieName;
        this.MovieYear = MovieYear;
        this.MovieDirector = MovieDirector;
        this.MovieRate = MovieRate;
        this.InDock = true;
    }

    @Override
    public String toString() {
        return this.MovieName + ", " + this.MovieYear + ", " + this.MovieDirector + ", " + this.MovieRate + "\n";
    }

    public String getMovieName() {
        return this.MovieName;
    }
}
