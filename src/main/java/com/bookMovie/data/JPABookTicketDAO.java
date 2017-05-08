package com.bookMovie.data;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.bookMovie.api.entity.BookTicket;
import com.bookMovie.api.entity.Movie;
import com.bookMovie.api.entity.Theatre;


public class JPABookTicketDAO implements BookTicketDAO {
	
	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.bookMovie"); 

	@Override
	public List<Movie> getListOfMovies() {
		Movie movie1 = new Movie();
		movie1.setMovieId(1);
		movie1.setMovieName("Pursuit of happyness");
		
		List<Movie> list =  new ArrayList<>();
		list.add(movie1);
		
		return list;
		/*EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		  Query query = em.createQuery(
		            "SELECT * FROM MOVIE");
		  em.getTransaction().commit();
			em.close();
		      return (List) query.getResultList();*/
		/*TypedQuery<Movie> queries = em.createNamedQuery("FindMovies",Movie.class);
	    List<Movie> users = queries.getResultList();
	    List<Movie> movieList = (List<Movie>) em.createNamedQuery("Select * from Movie");*/
		//List<Movie> movieList = (List<Movie>) em.find(Movie.class, "");
		
		//return movieList;
	}

	@Override
	public List<Theatre> getListOfTheatres(String city) {
		Theatre theatre1 = new Theatre();
		theatre1.setTheatreId(1);
		theatre1.setTheatreName("Rex");
		
		Theatre theatre2 = new Theatre();
		theatre2.setTheatreId(2);
		theatre2.setTheatreName("Cinepolis");
		
		List<Theatre> list =  new ArrayList<>();
		list.add(theatre1);
		list.add(theatre2);
		
		return list;
	}

	@Override
	public void bookTicket(BookTicket bookTicket) {
		// TODO Auto-generated method stub
		
	}
	
	
}
