package com.capg.fms.model;

public class Booking {
	private int BookingId;
	private String Date;
	private int UserId;
	private int TicketCost;
	private int NoOfTicket;
	
	public Booking(int bookingId, String date, int userId, int ticketCost) 
	{
		super();
		BookingId = bookingId;
		Date = date;
		UserId = userId;
		TicketCost = ticketCost;
		}

	public int getBookingId() {
		return BookingId;
	}

	public void setBookingId(int bookingId) {
		BookingId = bookingId;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public int getTicketCost() {
		return TicketCost;
	}

	public void setTicketCost(int ticketCost) {
		TicketCost = ticketCost;
	}

	public int getNoOfTicket() {
		return NoOfTicket;
	}

	public void setNoOfTicket(int noOfTicket) {
		NoOfTicket = noOfTicket;
	}

	@Override
	public String toString() {
		return "Booking [BookingId=" + BookingId + ", Date=" + Date + ", UserId=" + UserId + ", TicketCost="
				+ TicketCost + ", NoOfTicket=" + NoOfTicket + "]";
	}
	
	
}
