package com.bookMovie.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.bookMovie.api.entity.BookTicket;
import com.bookMovie.api.entity.Movie;
import com.bookMovie.api.entity.Theatre;
import com.bookMovie.service.BookTicketService;
import com.bookMovie.service.HoneywellBookTicketService;


@Path("/bookmovie")
public class MovieBookController {
	
	BookTicketService bookTicketService = new HoneywellBookTicketService();
	
	@GET
	@Path("movies")
	@Produces(MediaType.APPLICATION_JSON)
	public Response  listOfMovies(){
		List<Movie> listOfMovies = bookTicketService.getListOfMovies();
		GenericEntity<List<Movie>> entity = new GenericEntity<List<Movie>>(listOfMovies) {};
		return Response.ok(entity).build();
	//	return Response.ok(listOfMovies).build(); 
	}
	
	@GET
	@Path("theatres")
	@Produces(MediaType.APPLICATION_JSON)
	public Response  listOfCities(@PathParam("city")String city){
		List<Theatre> listOfTheatres = bookTicketService.getListOfTheatres(city);
		GenericEntity<List<Theatre>> entity = new GenericEntity<List<Theatre>>(listOfTheatres) {};
		return Response.ok(entity).build();
	//	return Response.ok(listOfMovies).build(); 
	}
	

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("bookticket")
	public Response bookTicket(BookTicket bookTicket){
		System.out.println("MovieBookController.bookTicket()");
		bookTicketService.bookTicket(bookTicket);
		return Response.ok().build();
	}
}
