package com.idealab.androidobjectlite;

/**
 * Created by Ashkan on 14/10/10.
 */
public class Student {


    private int id;
    private String name;
    private double avg;

    public Student(int id, String name, double avg){

        this.id = id;
        this.name = name;
        this.avg = avg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }
}
