package com.startjava.Lesson_2_3_4.wolf;

public class WolfTest {
    public static void main(String[] args) {
        Wolf myWolf = new Wolf();
        myWolf.setAge((byte) 5);
        myWolf.setName("Werewolf");
        myWolf.setWeight(20.0f);
        myWolf.setColor("grey");
        myWolf.setGender("male");

        System.out.println("Wolf name: " + myWolf.getName());
        System.out.println("Wolf age: " + myWolf.getAge());
        System.out.println("Wolf gender: " + myWolf.getGender());
        System.out.println("Wolf color: " + myWolf.getColor());
        System.out.println("Wolf weight: " + myWolf.getWeight());

        myWolf.go();
        myWolf.sit();
        myWolf.hunt();
        myWolf.howl();
    }
}