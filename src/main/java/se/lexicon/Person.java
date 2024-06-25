package se.lexicon;

import java.util.Arrays;

public class Person {
    // 1: Fields
    private final String personalNumber;
    private String name;
    private String email;
    private String phoneNumber;
    // add more fields as needed.
    private Car[] carsOwned; // null


    //2: Constructors

    public Person(String personalNumber, String name, String email, String phoneNumber) {
        validateStringParams(personalNumber, "Personal Number");
        this.personalNumber = personalNumber;
        setName(name);
        setEmail(email);
        setEmail(phoneNumber);
        this.carsOwned = new Car[0];
    }

    public Person(String personalNumber, String name, String phoneNumber) {
        this(personalNumber, name, null, phoneNumber);
    }

    //3: Setters & Getters Methods as needed

    public String getPersonalNumber() {
        return personalNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        validateStringParams(name, "Name");
        this.name = name;
    }

    public void setEmail(String email) {
        validateStringParams(email, "Email");
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        validateStringParams(phoneNumber, "Phone Number");
        this.phoneNumber = phoneNumber;
    }

    private void validateStringParams(String inputParam, String paramName) {
        if (inputParam == null || inputParam.trim().isEmpty()) {
            throw new IllegalArgumentException(paramName + " cannot be null or empty.");
        }
    }


    public void addOwnedCar(Car car) { // VW Id4
        if (car == null) {
            throw new IllegalArgumentException("Car cannot be null.");
        }

        carsOwned = Arrays.copyOf(carsOwned, carsOwned.length + 1);
        carsOwned[carsOwned.length - 1] = car;

        car.setOwner(this);

    }

    public void removeOwnedCar(Car car) {

        // Check if the provided car is not null
        if (car == null) {
            throw new IllegalArgumentException("Car cannot be null.");
        }

        // Find the index of the car in the array
        int index = -1;
        for (int i = 0; i < carsOwned.length; i++) {
            if (carsOwned[i].equals(car)) {
                index = i;
                break;
            }
        }

        // If the car is found, remove it
        if (index != -1) {
            // Create a new array excluding the car to be removed
            Car[] updatedCarsOwned = new Car[carsOwned.length - 1];

            // Copy elements before the removed car
            for (int i = 0; i < index; i++) {
                updatedCarsOwned[i] = carsOwned[i];
            }

            // Copy elements after the removed car
            for (int i = index + 1; i < carsOwned.length; i++) {
                updatedCarsOwned[i - 1] = carsOwned[i];
            }

            // Update the carsOwned array
            carsOwned = updatedCarsOwned;

            car.setOwner(null);
        } else {
            throw new IllegalArgumentException("Car not found in the list of owned cars.");
        }
    }

    // add more helper methods to manipulate cars as needed


    public String getPersonInfo(){
        return "Name: " + name + " , Email" + email; // concat more fields as needed
    }
}
