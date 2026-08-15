package com.gulshan;

import jakarta.persistence.*;

import java.util.List;

//@Embeddable // Is Used to mark a class as value object which dont have primary key allowing its field to be stored as part of another entity's table.
@Entity
@Cacheable
public class Laptop {

    @Id
    private int lid;
    private String brand;
    private String model;
    private int ram;
//
//    @ManyToMany(mappedBy = "laptops") //here ( mapedBy is used to avoid mapping laptop with alien )
//    private List<Alien> alien; //because a laptop can belong to multiple aliens hence we create  list

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

//    public List<Alien> getAlien() {
//        return alien;
//    }
//
//    public void setAlien(List<Alien> alien) {
//        this.alien = alien;
//    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                '}';
    }
}
