package com.company.entities.map;

import java.util.Objects;

public class Users {

    private String name;
    private Integer numberVotes;

    public Users() {
    }

    public Users(String name, Integer numberVotes) {
        this.name = name;
        this.numberVotes = numberVotes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberVotes() {
        return numberVotes;
    }

    public void setNumberVotes(Integer numberVotes) {
        this.numberVotes = numberVotes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return getName().equals(users.getName()) && getNumberVotes().equals(users.getNumberVotes());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getNumberVotes());
    }
}
