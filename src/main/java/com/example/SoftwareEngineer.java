package com.example;

import java.util.Objects;

public class SoftwareEngineer {

    private String id;
    private String name;
    private String tech;

    public SoftwareEngineer() {
    }

    public SoftwareEngineer(String id, String name, String tech) {

        this.id = id;
        this.name = name;
        this.tech = tech;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SoftwareEngineer that = (SoftwareEngineer) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(tech, that.tech);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, tech);
    }
}
