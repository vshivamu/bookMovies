package com.bookMovie.data;

import java.util.List;

import com.bookMovie.api.entity.BookTicket;
import com.bookMovie.api.entity.Movie;
import com.bookMovie.api.entity.Theatre;

public interface BookTicketDAO {
	
	public List<Movie> getListOfMovies();
	
	public List<Theatre> getListOfTheatres(String city);
	
	public void bookTicket(BookTicket bookTicket);

}
