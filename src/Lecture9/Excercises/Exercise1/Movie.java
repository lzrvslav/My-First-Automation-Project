package Lecture9.Excercises.Exercise1;

public class Movie {
    private String title;
    private String genre;
    public double movieRating;

    public Movie(String title, String genre, double movieRating){
        this.title = title;
        this.genre = genre;
        this.movieRating = movieRating;
    }

    public void printInfo(){
        System.out.println("The movie details are:");
        System.out.println("Movie title: " + this.title);
        System.out.println("Movie genre: " + this.genre);
        System.out.println("Movie rating: " + this.movieRating);
    }
}