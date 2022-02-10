package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Employer extends JobField {

    public Employer(String value) {
        super(value);
    }

    // Custom toString, equals, and hashCode methods:

    //extending toString from JobField

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Employer employer = (Employer) o;
        return getId() == employer.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters: deleted after extending JobField class

}
