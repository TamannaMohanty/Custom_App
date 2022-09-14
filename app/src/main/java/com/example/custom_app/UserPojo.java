package com.example.custom_app;

public class UserPojo {

    int countryImage;
    String countryName;
    String capital;
    String population;

    public int getCountryImage() {
        return countryImage;
    }

    public void setCountryImage(int countryImage) {
        this.countryImage = countryImage;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    String description;

    public UserPojo(int countryImage, String countryName, String capital, String population, String description) {
        this.countryImage = countryImage;
        this.countryName = countryName;
        this.capital = capital;
        this.population = population;
        this.description = description;
    }




}
