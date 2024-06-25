package se.lexicon;

import java.time.LocalDate;
import java.util.UUID;

public class Car {

    // ##Fields##: are variables that store data within an object
    // should be declared at the top of the class.
    private String registrationNumber;
    private String brand;
    private String model;
    private int year;
    // add more fields as needed


    // ##Constructors## should be declared after the fields.
    // Constructors are special methods in OOP used to initialize objects.
    // They called automatically when an object of a class is created.
    // They set up initial values for object fields.
    // Ensures all objects are created in a valid state.

    // default constructor
    /*public Car() {
        registrationNumber = null;
        brand = null;
        model = null;
        year = 0;
    }*/

    public Car(String brand, String model, int year) {
        this.registrationNumber = UUID.randomUUID().toString().substring(0, 8);
        setBrand(brand);
        setModel(model);
        this.year = year;
    }

    public Car(String brand, String model) {
        this(brand, model, LocalDate.now().getYear());
    }

    public Car(String registrationNumber, String brand, String model, int year) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // ##Methods##
    public String getCarInfo() {
        String result = "Car Info -> " + registrationNumber + " , Brand: " + brand + " , Model: " + model + " , Year: " + year;
        return result;
    }


    public String getRegistrationNumber(){
        return registrationNumber;
    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.trim().isEmpty()) {
            throw new IllegalArgumentException("Brand cannot be null or empty.");
        }
        this.brand = brand;
    }

    public void setModel(String model) {
        if (model == null || model.trim().isEmpty()) {
            throw new IllegalArgumentException("Model cannot be null or empty.");
        }
        this.model = model;
    }



}
