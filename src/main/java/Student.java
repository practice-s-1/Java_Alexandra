package main.java;

public abstract class Student { // Employee // Profesori, Admin, Elevi

    private String name;
    private String id;
    private String city;
    private String salary;
    int months;
    double extra;


    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.city = "Iasi";
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", city='" + city + '\'' +
                '}';
    }


    // overloading
    public double salaryPerYear(double salary, int months) {
        return salary * months;
    }

    public double salaryPerYear(double salary, int months, double extra) {
        return salary * months + extra;
    }

    public abstract void doYourJob(); //
}
