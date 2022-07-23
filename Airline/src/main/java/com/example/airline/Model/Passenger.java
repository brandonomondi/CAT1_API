package com.example.airline.Model;

import javax.persistence.*;

@SuppressWarnings("JpaAttributeTypeInspection")
@Entity
@Table (name = "Passenger")

public class Passenger {

    @Id
    @Column (name = "PassengerID")
    private long PassengerID;

    @Column (name = "pName")
    private long name;

    @Column (name = "Gender")
    private String gender;

    @Column (name = "Age ")
    private long age;

    @Column (name = "PhoneNumber")
    private long PhoneNumber;

    @OneToMany
    @JoinColumn(name = "Flight")
    private Flight FlightNumber;

    @OneToOne
    @JoinColumn(name = "Ticket")
    private Ticket TicketID;


    public Passenger(){

    }

    public Passenger(long passengerID, long name, String gender, long age, long phoneNumber, Flight flightNumber, Ticket ticketID) {
        PassengerID = passengerID;
        this.name = name;
        this.gender = gender;
        this.age = age;
        PhoneNumber = phoneNumber;
        FlightNumber = flightNumber;
        TicketID = ticketID;
    }

    public long getPassengerID() {
        return PassengerID;
    }

    public void setPassengerID(long passengerID) {
        PassengerID = passengerID;
    }

    public long getName() {
        return name;
    }

    public void setName(long name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public long getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public Flight getFlightNumber() {
        return FlightNumber;
    }

    public void setFlightNumber(Flight flightNumber) {
        FlightNumber = flightNumber;
    }

    public Ticket getTicketID() {
        return TicketID;
    }

    public void setTicketID(Ticket ticketID) {
        TicketID = ticketID;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "PassengerID=" + PassengerID +
                ", name=" + name +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", PhoneNumber=" + PhoneNumber +
                ", FlightNumber=" + FlightNumber +
                ", TicketID=" + TicketID +
                '}';
    }
}