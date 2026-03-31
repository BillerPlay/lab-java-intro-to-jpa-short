package com.ironhack.jpa.introtojpa.entities;

import com.ironhack.jpa.introtojpa.enums.CustomerStatus;
import jakarta.persistence.*;

@Entity
@Table(name="customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="customer_id")
    private Long customerId;

    @Column(name="customer_name", length = 50, nullable = false)
    private String customerName;

    @Enumerated(EnumType.STRING)
    @Column(name = "customer_status", nullable = false)
    private CustomerStatus customerStatus = CustomerStatus.None;

    @Column(name="total_customer_mileage", nullable = false)
    private Integer totalCustomerMileage=0;

//  Required empty constructor by JPA
    public Customer(){}

//  Parameterized constructor
    public Customer(String customerName, CustomerStatus customerStatus, Integer totalCustomerMileage){
        this.customerName=customerName;
        this.customerStatus=customerStatus;
        this.totalCustomerMileage=totalCustomerMileage;
    }
//  Getters and Setters
    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public CustomerStatus getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(CustomerStatus customerStatus) {
        this.customerStatus = customerStatus;
    }

    public Integer getTotalCustomerMileage() {
        return totalCustomerMileage;
    }

    public void setTotalCustomerMileage(Integer totalCustomerMileage) {
        this.totalCustomerMileage = totalCustomerMileage;
    }
}
