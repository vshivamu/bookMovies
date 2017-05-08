package com.bookMovie.data;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bookMovie.api.entity.BookTicket;
import com.bookMovie.api.entity.Movie;
import com.bookMovie.api.entity.Theatre;

public class MongoBookTicketDAO implements BookTicketDAO {
	
	MongoRepository<BookTicket, String> mongoRepo = new BookTicketMongoRepository();

	@Override
	public List<Movie> getListOfMovies() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void bookTicket(BookTicket bookTicket) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<Theatre> getListOfTheatres(String city) {
		// TODO Auto-generated method stub
		return null;
	}

}
