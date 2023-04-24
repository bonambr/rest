package com.example.demo.entity;

import jakarta.persistence.*;
//TODO fix wildcard import

import java.util.Objects;

@Entity
@Table(name = "winnersbyseason", schema = "dbo", catalog = "f1Database")
public class TimelineEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "Season")
    private Long season;
    @Basic
    @Column(name = "Driver")
    private String driver;
    @Basic
    @Column(name = "Constructor_Chassis")
    private String constructorChassis;
    @Basic
    @Column(name = "Poles")
    private Long poles;
    @Basic
    @Column(name = "Wins")
    private Long wins;
    @Basic
    @Column(name = "Podiums")
    private Long podiums;
    @Basic
    @Column(name = "Points")
    private Double points;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getSeason() {
        return season;
    }

    public void setSeason(Long season) {
        this.season = season;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getConstructorChassis() {
        return constructorChassis;
    }

    public void setConstructorChassis(String constructorChassis) {
        this.constructorChassis = constructorChassis;
    }

    public Long getPoles() {
        return poles;
    }

    public void setPoles(Long poles) {
        this.poles = poles;
    }

    public Long getWins() {
        return wins;
    }

    public void setWins(Long wins) {
        this.wins = wins;
    }

    public Long getPodiums() {
        return podiums;
    }

    public void setPodiums(Long podiums) {
        this.podiums = podiums;
    }

    public Double getPoints() {
        return points;
    }

    public void setPoints(Double points) {
        this.points = points;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, season, driver, constructorChassis, poles, wins, podiums, points);
    }
}
