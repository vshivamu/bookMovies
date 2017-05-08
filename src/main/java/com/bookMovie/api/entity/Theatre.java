package com.bookMovie.api.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Theatre {
	@Id
	private int theatreId;
    private String theatreName;
    private String theatrePlace;

    public int getTheatreId() {
        return this.theatreId;
    }
    public void setTheatreId(int value) {
        this.theatreId = value;
    }

    public String getTheatreName() {
        return this.theatreName;
    }

    public void setTheatreName(String value) {
        this.theatreName = value;
    }

    public String getTheatrePlace() {
        return this.theatrePlace;
    }

    public void setTheatrePlace(String value) {
        this.theatrePlace = value;
    }
}