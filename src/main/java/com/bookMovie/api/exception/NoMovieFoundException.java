package com.bookMovie.api.exception;

@SuppressWarnings("serial")
public class NoMovieFoundException extends BookingMovieException {

	public NoMovieFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NoMovieFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public NoMovieFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public NoMovieFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public NoMovieFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
