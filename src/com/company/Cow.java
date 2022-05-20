package com.company;

public class Cow extends AbstractAnymal {


    public Cow(String color, String gender, String nickName, int age, int weight) {
        super(color, gender, nickName, age, weight);
    }

    @Override
    public String toString() {
        return "Cow{" +
                "color='" + color + '\'' +
                ", gender='" + gender + '\'' +
                ", nickName='" + nickName + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
