package com.bookMovie.service;

import java.util.List;

import com.bookMovie.api.entity.BookTicket;
import com.bookMovie.api.entity.Movie;
import com.bookMovie.api.entity.Theatre;

public interface BookTicketService {
	
	public List<Movie> getListOfMovies();
	
	public void bookTicket(BookTicket bookTicket);

	public List<Theatre> getListOfTheatres(String city);
	

}
