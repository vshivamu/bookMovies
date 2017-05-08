package com.bookMovie.service;

import com.bookMovie.api.entity.User;
import com.bookMovie.api.exception.AuthorizationFailedException;
import com.bookMovie.api.exception.BookingMovieException;
import com.bookMovie.api.exception.DuplicateUserIdException;
import com.bookMovie.api.exception.NoUserIdFoundException;

public class HoneywellUserService implements UserService {

	@Override
	public void login(User user) throws NoUserIdFoundException, AuthorizationFailedException, BookingMovieException {
		// TODO Auto-generated method stub

	}

	@Override
	public void signup(User user) throws DuplicateUserIdException, BookingMovieException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAccount(String userid) throws BookingMovieException {
		// TODO Auto-generated method stub

	}

	@Override
	public void editProfile(User user) throws BookingMovieException {
		// TODO Auto-generated method stub

	}

	@Override
	public User viewProfile(String userId) throws BookingMovieException {
		// TODO Auto-generated method stub
		return null;
	}

}
