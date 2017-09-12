package com.twu.biblioteca;

import java.util.ArrayList;

public class MovieList {

    private ArrayList<MovieInfo> MovieInfoList = new ArrayList<MovieInfo>();

    public void addMovieInfo(MovieInfo movieInfo){
        this.MovieInfoList.add(movieInfo);
    }
    public void addMovie(String MovieName, String MovieYear, String MovieDirector, String MovieRate){
        this.addMovieInfo(new MovieInfo(MovieName,MovieYear,MovieDirector,MovieRate));
    }

    public void listMovies(){
        System.out.print(this.toString());
    }

    public void init(){
        this.addMovie("Titanic", "1997", "James Cameron", "10");
        this.addMovie("Lucy", "2014", "Luc Besson", "9");
        this.addMovie("Big Hero 6","2014","Don Hall & Chris Williams","8");
        this.addMovie("Spider-Man","1977", "E. W. Swackhamer", "7");
    }

    @Override
    public String toString(){
        String ans= "";
        for(MovieInfo movie:this.MovieInfoList){
            if(movie.getInDock()){
                ans += movie.toString();
            }
        }
        return ans;
    }

    public boolean checkOutMovie(String MovieName) {

        if(this.searchMovieByName(MovieName)!=null&&this.searchMovieByName(MovieName).getInDock()){
            this.searchMovieByName(MovieName).setInDock(false);
            System.out.println("Check-out succeeded");
            System.out.println("Thank you! Enjoy the movie");
            return true;
        }else{
            System.out.println("That movie is not available");
            if(this.searchMovieByName(MovieName)==null){
                System.out.println("The movie doesn't exist");
            }else{
                System.out.println("Sorry, the movie has been checked-out");
            }
            return false;
        }
    }

    private MovieInfo searchMovieByName(String movieName) {
        for(MovieInfo movie:this.MovieInfoList){
            if(movie.getMovieName().equals(movieName)){
                return movie;
            }
        }
        return null;
    }
}
