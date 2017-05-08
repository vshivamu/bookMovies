package com.bookMovie.api.entity;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="Movie")
/*@NamedQueries({
    @NamedQuery(name="FindMovies", query="SELECT * FROM Movie ")
})*/
public class Movie {
	@Id
    private int movieId;
    private String movieName;
    
    @ElementCollection(targetClass=Integer.class)
    private List<Integer> movieTheatreIds;

    public int getMovieId() {
        return this.movieId;
    }

    public void setMovieId(int value) {
        this.movieId = value;
    }

    public String getMovieName() {
        return this.movieName;
    }

    public void setMovieName(String value) {
        this.movieName = value;
    }

    public List<Integer> getMovieTheatres() {
        return this.movieTheatreIds;
    }

    public void setMovieTheatres(List<Integer> value) {
        this.movieTheatreIds = value;
    }

}