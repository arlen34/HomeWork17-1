package com.company;

import java.util.Arrays;

public class Main {
    /**
     * Класс Cow (weight, age, gender, nickName)
     * Класс Sheep(weight, age, gender, nickName)
     * Класс Horse(weight, age, color, gender, nickName)
     * Класс Farm(address, cows, horses, sheep, OwnerName)
     * 2 Farm тузунуз.
     * 1-Farmда 3 sheep, 5 cows, 2 horses болсун.
     * 2-Farmда 1 sheep, 1 cow, 1 horse болсун. */
    public static void main(String[] args) {
        Farm farm1 = new Farm();
        farm1.setOwnerName("Arlen");
        farm1.setAdress("Bishkek");

        Farm farm2 = new Farm();
        farm2.setAdress("Talas");
        farm2.setOwnerName("Balancha");

        Cow cow1 = new Cow("white", "gen", "Cower", 7, 300);
        Cow cow2 = new Cow("white", "gen", "Cower", 7, 300);
        Cow cow3 = new Cow("white", "gen", "Cower", 7, 300);
        Cow cow4 = new Cow("white", "gen", "Cower", 7, 300);
        Cow cow5 = new Cow("white", "gen", "Cower", 7, 300);
        Cow cow6 = new Cow("white", "gen", "Cower", 7, 300);

        Sheep sheep1 = new Sheep("Black-white","gensheep","Sheeper",3,100);
        Sheep sheep2 = new Sheep("Black-white","gensheep","Sheeper",3,100);
        Sheep sheep3 = new Sheep("Black-white","gensheep","Sheeper",3,100);
        Sheep sheep4 = new Sheep("Black-white","gensheep","Sheeper",3,100);

        Horse horse1 = new Horse("Black","Gelding","Taitoru",4,700);
        Horse horse2 = new Horse("Black","Gelding","Taitoru",4,700);
        Horse horse3 = new Horse("Black","Gelding","Taitoru",4,700);

        farm1.cows = new Cow[]{cow1,cow2,cow3,cow4,cow5};
        farm1.sheep= new Sheep[]{sheep1,sheep2,sheep3};
        farm1.horses= new Horse[]{horse1,horse2};

        farm2.cows = new Cow[]{cow6};
        farm2.sheep = new Sheep[]{sheep4};
        farm2.horses = new Horse[]{horse3};

        System.out.println(farm1);
        System.out.println();
        System.out.println(farm2);
    }
}
