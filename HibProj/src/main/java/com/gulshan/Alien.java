package com.gulshan;
import jakarta.persistence.*;

import java.util.List;

@Entity
//@Table(name="alien_table")
public class Alien {

    @Id
    private int aid;
    //@Column(name="alien_name")
    private String aname;
   // @Transient
    private String tech; //@Transient is used when we dont want some columns in the database and these columns are used only for processing realted stuff so we use transient annotation.

//    @OneToOne
//    private Laptop laptop; // this was for a single laptop

//    @OneToMany(mappedBy = "alien")
//    private List<Laptop> laptops;

    //@ManyToMany
    @OneToMany
    private List<Laptop> laptops; // an alien can haive multiple laptops thats why list of laptops


    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getTech() {
        return tech;
    }
    public void setTech(String tech) {
        this.tech = tech;
    }

//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }


    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", tech='" + tech + '\'' +
                ", laptop=" + laptops +
                '}';
    }
}

