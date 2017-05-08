package com.bookMovie.api.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Document(collection="BookTicket")
public class BookTicket {

	@Id
	private int ticketId;
	
	@OneToOne(cascade=CascadeType.ALL)
	private User user;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Theatre theatre;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Movie movie;

	private boolean payment;
	
	@OneToMany(targetEntity=Seat.class, cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<Seat> seats;
	
	private Date date;

	public int getTicketId() {
		return this.ticketId;
	}
	public void setTicketId(int value) {
		this.ticketId = value;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User value) {
		this.user = value;
	}

	public Theatre getTheatre() {
		return this.theatre;
	}

	public void setTheatre(Theatre value) {
		this.theatre = value;
	}

	public Movie getMovie() {
		return this.movie;
	}

	public void setMovie(Movie value) {
		this.movie = value;
	}

	public boolean getPayment() {
		return this.payment;
	}

	public void setPayment(boolean payment) {
		this.payment = payment;
	}

	public List<Seat> getSeats() {
		return this.seats;
	}

	public void setSeats(List<Seat> value) {
		this.seats = value;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

}
