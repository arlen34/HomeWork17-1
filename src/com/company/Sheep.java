package com.company;

public class Sheep extends AbstractAnymal {

    public Sheep(String color, String gender, String nickName, int age, int weight) {
        super(color, gender, nickName, age, weight);
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "color='" + color + '\'' +
                ", gender='" + gender + '\'' +
                ", nickName='" + nickName + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
