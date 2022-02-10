package org.launchcode.techjobs.oo;

public abstract class JobField {

    private int id;
    private static int nextId = 1;
    private String value;

    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

    public String toString() {
        return value;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        if (value.isEmpty()) {
            return "Data not available";
        }
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
