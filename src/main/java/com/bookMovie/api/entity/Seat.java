package com.bookMovie.api.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Seat {

	@Id
    private int seatId;
    private int theatreId;
    private Date date;
    private boolean isBooked;

    public int getSeatId() {
        return this.seatId;
    }

    public void setSeatId(int value) {
        this.seatId = value;
    }

    public int getTheatreId() {
        return this.theatreId;
    }

    public void setTheatreId(int value) {
        this.theatreId = value;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date value){
        this.date = value;
    }

    public boolean getIsBooked() {
        return this.isBooked;
    }

    public void setIsBooked(boolean value) {
        this.isBooked = value;
    }

}
