package Movie;

public class Movie {
    private final String titleOfMovie;

    private final String ratingOfMovie;

    private final String studioOfMovie;

    public Movie(String titleOfMovie,String ratingOfMovie,String studioOfMovie){

        this.titleOfMovie = titleOfMovie;

        this.ratingOfMovie = ratingOfMovie;

        this.studioOfMovie = studioOfMovie;

    }

    public Movie(String titleOfMovie,String studioOfMovie){

        this.titleOfMovie = titleOfMovie;

        this.studioOfMovie = studioOfMovie;

        this.ratingOfMovie = "PG";

    }

    public String getRatingOfMovie(){
        return this.ratingOfMovie;
    }

    public String getStudioOfMovie(){
        return this.studioOfMovie;
    }

    public String getTitleOfMovie(){
        return this.titleOfMovie;
    }
}

