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
                "name='" + name + "\n\n" +
                "capitalCity='" + capitalCity + "\n\n" +
                "anthem='" + anthem + "\n\n" +
                "population_size='" + population_size + "\n\n" +
                "language='" + language + "\n\n";
    }
}


