package com.example.Beginnerproject;

import org.springframework.stereotype.Component;

@Component //to create an obj of class Laptop in spring container
//@Component("lap1") // means- please name it as lap1 in spring container (and to search by name add @Qualifier)
public class Laptop {
    private int lid;
    private String brand;

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

    public void compile()
    {
        System.out.println("Compiling...");
    }
}
