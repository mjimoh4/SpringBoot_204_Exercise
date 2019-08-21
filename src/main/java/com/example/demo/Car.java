package com.example.demo;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Car
{
    @NotNull
    @Min(1)
    private long id;


    @NotNull
    @Size(min=3, max=20)
    private String make;

    @NotNull
    @Size(min=3, max=10)
    private String model;


    @NotNull
    //@Size(min=3, max=10)
    private int year;


    @NotNull
    @Size(min=3,max=15)
    private String color;



    @NotNull
    @Size(min=10, max=30)
    private String description;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
