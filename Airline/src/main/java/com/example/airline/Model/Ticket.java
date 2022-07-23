package com.example.airline.Model;

import javax.persistence.*;

@Entity
@Table (name = "Ticket")
public class Ticket {
    @Id
    @Column(name="TICKET_ID")
    private Long ticketId;
    @Column(name="dateOfPurchase")
    private Long dateOfPurchase;
    @Column(name="seatNumber")
    private String seatNumber;
    @Column(name="type")
    private String type;
    @Column(name="destination")
    private String destination;
    @Column(name="source")
    private String source;

    @OneToOne
    @JoinColumn (name = "PassengerID")
    private Passenger PassengerID;

    @OneToOne
    @JoinColumn (name = "FlightNumber")
    private Flight FlightNumber;


    public Ticket() {
    }

    public Ticket(Long ticketId, Long dateOfPurchase, String seatNumber, String type, String destination, String source, Passenger passengerID, Flight flightNumber) {
        this.ticketId = ticketId;
        this.dateOfPurchase = dateOfPurchase;
        this.seatNumber = seatNumber;
        this.type = type;
        this.destination = destination;
        this.source = source;
        PassengerID = passengerID;
        FlightNumber = flightNumber;
    }

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public Long getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(Long dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Passenger getPassengerID() {
        return PassengerID;
    }

    public void setPassengerID(Passenger passengerID) {
        PassengerID = passengerID;
    }

    public Flight getFlightNumber() {
        return FlightNumber;
    }

    public void setFlightNumber(Flight flightNumber) {
        FlightNumber = flightNumber;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId=" + ticketId +
                ", dateOfPurchase=" + dateOfPurchase +
                ", seatNumber='" + seatNumber + '\'' +
                ", type='" + type + '\'' +
                ", destination='" + destination + '\'' +
                ", source='" + source + '\'' +
                ", PassengerID=" + PassengerID +
                ", FlightNumber=" + FlightNumber +
                '}';
    }
}