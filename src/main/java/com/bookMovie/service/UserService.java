package com.bookMovie.service;

import com.bookMovie.api.entity.User;
import com.bookMovie.api.exception.AuthorizationFailedException;
import com.bookMovie.api.exception.BookingMovieException;
import com.bookMovie.api.exception.DuplicateUserIdException;
import com.bookMovie.api.exception.NoUserIdFoundException;

public interface UserService {
	
	public void login(User user) throws NoUserIdFoundException,AuthorizationFailedException, BookingMovieException;
	
	
	public void signup(User user) throws DuplicateUserIdException, BookingMovieException;
	
	public void deleteAccount(String userid) throws BookingMovieException;
	
	public void editProfile(User user) throws BookingMovieException;
	
	public User viewProfile(String userId) throws BookingMovieException;

}
