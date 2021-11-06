package com.example.a4_11;

public class Country {
    private String name;
    private String capitalCity;
    private String anthem;
    private String population_size;
    private  String language;

    public Country(String name, String capitalCity, String anthem, String population_size,String language){
        this.name = name;
        this.capitalCity = capitalCity;
        this.anthem = anthem;
        this.population_size = population_size;
        this.language = language;
    }

    @Override
    public String toString() {
        return
                "Name: " + name + "\n\n\n\n" +
                "Capital City: " + capitalCity + "\n\n\n\n" +
                "Anthem: " + anthem + "\n\n\n\n" +
                "Population Size: " + population_size + "\n\n\n\n" +
                "Language: " + language + "\n\n\n\n";
    }
}


