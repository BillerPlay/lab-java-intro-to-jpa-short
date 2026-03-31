package com.ironhack.jpa.introtojpa.entities;

import com.ironhack.jpa.introtojpa.enums.CustomerStatus;
import jakarta.persistence.*;

@Entity
@Table(name="flights")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="flight_id")
    private Long flightId;

    @Column(name="flight_number", unique = true, nullable = false, length = 10)
    private String flightNumber;

    @Column(name="aircraft", nullable = false, length = 20)
    private String aircraft;

    @Column(name="total_aircraft_seats")
    private Integer totalAircraftSeats;

    @Column(name="flight_mileage")
    private Integer flightMileage;

    //  Required empty constructor by JPA
    public Flight() {}

    //  Parameterized constructor
    public Flight(String flightNumber, String aircraft, Integer totalAircraftSeats, Integer flightMileage ){
        this.flightNumber=flightNumber;
        this.aircraft=aircraft;
        this.totalAircraftSeats=totalAircraftSeats;
        this.flightMileage=flightMileage;
    }

    //  Getters and Setters
    public Long getFlightId() {
        return flightId;
    }

    public void setFlightId(Long flightId) {
        this.flightId = flightId;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    public Integer getTotalAircraftSeats() {
        return totalAircraftSeats;
    }

    public void setTotalAircraftSeats(Integer totalAircraftSeats) {
        this.totalAircraftSeats = totalAircraftSeats;
    }

    public Integer getFlightMileage() {
        return flightMileage;
    }

    public void setFlightMileage(Integer flightMileage) {
        this.flightMileage = flightMileage;
    }
}
