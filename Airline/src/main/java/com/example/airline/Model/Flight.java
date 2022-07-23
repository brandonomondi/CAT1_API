package com.example.airline.Model;

import javax.persistence.*;

@Entity
@Table(name = "Flight")

public class Flight {

    /// needs to be linked by relationship

    @Id
    @Column (name = "FlightNumber ")
    private long FlightNumber;

    @Column (name = "Date ")
    private long Date;

    @Column (name = "Time ")
    private int Time;

    @Column (name = "BoardingGate ")
    private String BoardinngGate;

    @Column (name = "Capacity ")
    private long Capacity;

    @Column (name = "Model ")
    private String Model;

    @ManyToOne
    @JoinColumn (name = "StaffID")
    private Staff staff;

    @OneToOne
    @JoinColumn (name = "Passenger")
    private Passenger passenger;

    @OneToOne
    @JoinColumn (name = "Ticket_ID")
    private Ticket Ticket;




   public Flight(){

   }

    public Flight(long flightNumber, long date, int time, String boardinngGate, long capacity, String model, Staff staff, Passenger passenger, com.example.airline.Model.Ticket ticket) {
        FlightNumber = flightNumber;
        Date = date;
        Time = time;
        BoardinngGate = boardinngGate;
        Capacity = capacity;
        Model = model;
        this.staff = staff;
        this.passenger = passenger;
        Ticket = ticket;
    }

    public long getFlightNumber() {
        return FlightNumber;
    }

    public void setFlightNumber(long flightNumber) {
        FlightNumber = flightNumber;
    }

    public long getDate() {
        return Date;
    }

    public void setDate(long date) {
        Date = date;
    }

    public int getTime() {
        return Time;
    }

    public void setTime(int time) {
        Time = time;
    }

    public String getBoardinngGate() {
        return BoardinngGate;
    }

    public void setBoardinngGate(String boardinngGate) {
        BoardinngGate = boardinngGate;
    }

    public long getCapacity() {
        return Capacity;
    }

    public void setCapacity(long capacity) {
        Capacity = capacity;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public com.example.airline.Model.Ticket getTicket() {
        return Ticket;
    }

    public void setTicket(com.example.airline.Model.Ticket ticket) {
        Ticket = ticket;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "FlightNumber=" + FlightNumber +
                ", Date=" + Date +
                ", Time=" + Time +
                ", BoardinngGate='" + BoardinngGate + '\'' +
                ", Capacity=" + Capacity +
                ", Model='" + Model + '\'' +
                ", staff=" + staff +
                ", passenger=" + passenger +
                ", Ticket=" + Ticket +
                '}';
    }
}
