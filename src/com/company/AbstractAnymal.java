package com.company;

public abstract class AbstractAnymal {
   String color, gender, nickName;
   int age;
   int weight;

    public AbstractAnymal(String color, String gender, String nickName, int age, int weight) {
        this.color = color;
        this.gender = gender;
        this.nickName = nickName;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "AbstractAnymal{" +
                "color='" + color + '\'' +
                ", gender='" + gender + '\'' +
                ", nickName='" + nickName + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
