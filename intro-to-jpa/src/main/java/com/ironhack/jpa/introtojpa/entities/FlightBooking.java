package com.ironhack.jpa.introtojpa.entities;

import jakarta.persistence.*;

@Entity
@Table(name="flight_bookings")
public class FlightBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
    private Integer bookingId;

    @Column(name = "customer_id", nullable = false)
    private Integer customerId;

    @Column(name = "flight_id", nullable = false)
    private Integer flightId;

    //  Adding foreign keys (information from Internet)
    @OneToOne
    @JoinColumn(name="customer_id", referencedColumnName = "customer_id")
    private Customer customer;

    @OneToOne
    @JoinColumn(name="flight_id", referencedColumnName = "flight_id")
    private Flight flight;

    //  Required empty constructor by JPA
    public FlightBooking() {}

    //  Getters and Setters
    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getFlightId() {
        return flightId;
    }

    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }
}
