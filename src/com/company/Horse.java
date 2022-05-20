package com.company;

public class Horse extends AbstractAnymal {

    public Horse(String color, String gender, String nickName, int age, int weight) {
        super(color, gender, nickName, age, weight);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "color='" + color + '\'' +
                ", gender='" + gender + '\'' +
                ", nickName='" + nickName + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
