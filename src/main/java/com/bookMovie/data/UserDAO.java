package com.bookMovie.data;

import com.bookMovie.api.entity.User;
import com.bookMovie.api.exception.BookingMovieException;
import com.bookMovie.api.exception.DuplicateUserIdException;

public interface UserDAO {

	
	public void create(User user) throws DuplicateUserIdException, BookingMovieException;
	
	public void delete(String userid) throws BookingMovieException;
	
	public void update(User blogger) throws BookingMovieException;
	
	public User read(String userId) throws BookingMovieException;
	
	

}
