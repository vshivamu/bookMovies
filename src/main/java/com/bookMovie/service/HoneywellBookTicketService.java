package com.bookMovie.service;

import java.util.List;

import com.bookMovie.api.entity.BookTicket;
import com.bookMovie.api.entity.Movie;
import com.bookMovie.api.entity.Theatre;
import com.bookMovie.data.BookTicketDAO;
import com.bookMovie.data.JPABookTicketDAO;

public class HoneywellBookTicketService implements BookTicketService {
	BookTicketDAO bookTicketDAO =  new JPABookTicketDAO();

	@Override
	public List<Movie> getListOfMovies() {
		System.out.println("HoneywellBookTicketService.getListOfMovies()");
		return bookTicketDAO.getListOfMovies();
	}
	public List<Theatre> getListOfTheatres(String city){
		return bookTicketDAO.getListOfTheatres(city);
	}

	public void bookTicket(BookTicket bookTicket){
		System.out.println("HoneywellBookTicketService.bookTicket()");
		
	}

}
