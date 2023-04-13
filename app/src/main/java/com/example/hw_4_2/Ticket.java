package com.example.hw_4_2;

import java.io.Serializable;

public class Ticket implements Serializable {

    // поля сущности
    private String train;
    private String place;
    private String departureDate;
    private String departureTime;
    private String arrivalDate;
    private String arrivalTime;
    private String railwayCarriage;
    private String seat;
    private String passenger;
    private String price;

    // необходимый конструктор
    public Ticket(String train, String place, String departureDate, String departureTime,
                  String arrivalDate, String arrivalTime, String railwayCarriage, String seat, String passenger, String price){
        this.train = train;
        this.place = place;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.arrivalDate = arrivalDate;
        this.arrivalTime = arrivalTime;
        this.railwayCarriage = railwayCarriage;
        this.seat = seat;
        this.passenger = passenger;
        this.price = price;
    }

    // геттеры и сеттеры
    public String getTrain() { return train; }

    public void setTrain(String train) {
        this.train = train;
    }

    public String getPlace() { return place;}

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDepartureDate() { return departureDate;}

    public void setDepartureDate(String departureDate) { this.departureDate = departureDate; }

    public String getDepartureTime() { return departureTime;}

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalDate() { return arrivalDate;}

    public void setArrivalDate(String arrivalTime) { this.departureDate = arrivalDate; }

    public String getArrivalTime() { return arrivalTime;}

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getRailwayCarriage() { return railwayCarriage;}

    public void setRailwayCarriage(String railwayCarriage) { this.railwayCarriage = railwayCarriage; }

    public String getSeat() { return seat;}

    public void setSeat(String seat) { this.seat = seat; }
    public String getPassenger() {
        return passenger;
    }

    public void setPassenger(String passenger) {
        this.passenger = passenger;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
