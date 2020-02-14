package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private double height;
    private String hair;
    private boolean teeth;
    private int limbs;
    private boolean alive;


    public Person() {
        name = "";
        age = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setHeight(double expected) {
        height = expected;
    }

    public double getHeight() {
        return height;
    }

    public void setHair(String expected) {
        hair = expected;
    }

    public String getHair() {
        return hair;
    }

    public void setTeeth(boolean expected) {
        teeth = expected;
    }

    public boolean getTeeth() {
        return teeth;
    }

    public int getLimbs() {
        return limbs;
    }

    public void setLimbs(int expected) {
        limbs = expected;
    }

    public void setAlive(boolean expected) {
        alive = expected;
    }

    public boolean getAlive() {
        return alive;
    }
}
