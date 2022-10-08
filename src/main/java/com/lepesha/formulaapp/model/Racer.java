package com.lepesha.formulaapp.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Racer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

    @Column(nullable = false, updatable = true)
    private String name;

    @Column
    private String racerNumber;

    @Column
    private String power;

    @Column
    private String imageUrl;

    @Column
    private String racerCode;

    public Racer() {

    }

    public Racer(String name, String imageUrl, String racerNumber, String power, String racerCode) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.racerNumber = racerNumber;
        this.power = power;
        this.racerCode = racerCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRacerNumber() {
        return racerNumber;
    }

    public void setRacerNumber(String racerNumber) {
        this.racerNumber = racerNumber;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getRacerCode() {
        return racerCode;
    }

    public void setRacerCode(String racerCode) {
        this.racerCode = racerCode;
    }
}
