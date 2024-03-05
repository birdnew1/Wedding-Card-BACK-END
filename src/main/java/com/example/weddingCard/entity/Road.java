package com.example.weddingCard.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "road")
public class Road {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "road_id")
    private Integer roadId;
    @ManyToOne
    @JoinColumn(name = "wedding_id")
    private Information weddingId;
    private String subway;
    private String bus;
    private String car;
    @Column(name = "rent_bus")
    private String rentBus;
    private String etc;

    public Integer getRoadId() {
        return roadId;
    }

    public void setRoadId(Integer roadId) {
        this.roadId = roadId;
    }

    public Information getWeddingId() {
        return weddingId;
    }

    public void setWeddingId(Information weddingId) {
        this.weddingId = weddingId;
    }

    public String getSubway() {
        return subway;
    }

    public void setSubway(String subway) {
        this.subway = subway;
    }

    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getRentBus() {
        return rentBus;
    }

    public void setRentBus(String rentBus) {
        this.rentBus = rentBus;
    }

    public String getEtc() {
        return etc;
    }

    public void setEtc(String etc) {
        this.etc = etc;
    }
}
