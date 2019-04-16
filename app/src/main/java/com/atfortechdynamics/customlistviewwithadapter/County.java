package com.atfortechdynamics.customlistviewwithadapter;

public class County {
    private String name;
    private String code;
    private String population;

    public County(String name, String code, String population) {
        this.name = name;
        this.code = code;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }
}
