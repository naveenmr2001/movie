import Movie.*;

import java.util.ArrayList;
import java.util.List;

public class MovieInstance {

    public static List<Movie> PgGet(List<Movie> inputMovie){

        List<Movie> pgRatingMovie = new ArrayList<>();

        for(Movie m : inputMovie) {

            if (m.getRatingOfMovie().equals("PG")) {

                pgRatingMovie.add(m);

            }

        }

        return pgRatingMovie;
    }

    public static void main(String[] args) {

        Movie varisu = new Movie("Varisu","UG","7studio");

        Movie vikram = new Movie("Vikram","UG","RKFP");

        Movie johnWick4 = new Movie("john-Wick-4","AmazonPrime");

        List<Movie> movieList = new ArrayList<>();
        movieList.add(varisu);
        movieList.add(vikram);
        movieList.add(johnWick4);

        List<Movie> pgMovieList;
        pgMovieList = PgGet(movieList);

        for(Movie m : pgMovieList){
            System.out.println("This is Movie Title which is PG: "+m.getTitleOfMovie());
            System.out.println("This is Movie Studio which is PG: "+m.getStudioOfMovie());
        }

        Movie casinoRoyle = new Movie("Casino Royale","PG-13","Eon Productions");
        System.out.println(casinoRoyle.getTitleOfMovie()+" "+casinoRoyle.getStudioOfMovie()+" "+ casinoRoyle.getRatingOfMovie());

    }
}