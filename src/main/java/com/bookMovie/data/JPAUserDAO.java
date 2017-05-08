package com.bookMovie.data;

import com.bookMovie.api.entity.User;
import com.bookMovie.api.exception.BookingMovieException;
import com.bookMovie.api.exception.DuplicateUserIdException;

public class JPAUserDAO implements UserDAO {

	@Override
	public void create(User user) throws DuplicateUserIdException, BookingMovieException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String userid) throws BookingMovieException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User blogger) throws BookingMovieException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User read(String userId) throws BookingMovieException {
		// TODO Auto-generated method stub
		return null;
	}

}
