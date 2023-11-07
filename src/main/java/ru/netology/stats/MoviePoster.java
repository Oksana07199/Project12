package ru.netology.stats;

public class MoviePoster {
    private String[] movies = new String[0];
    private int limit;

    public MoviePoster() {
        this.limit = 5;
    }

    public MoviePoster(int limit) {
        this.limit = limit;
    }
    public void add (String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;

    }
    public String[] findLast() {
        int resultsLength;
        if (movies.length < limit) {
            resultsLength = movies.length;
        } else {
            resultsLength = limit;
        }
        String[] tmp = new String [resultsLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length -1 -i];
        }
        return tmp;

    }
}

