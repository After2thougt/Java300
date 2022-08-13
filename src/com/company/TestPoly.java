/**
 * This is a Test Program
 *
 * @author Oliver
 * @date 8/8/2022 4:26 PM
 */
package com.company;

public class TestPoly {

    public static void main(String[] args)
    {
        /*Animal a  = new Animal();
        animalSounds(new Cat());

        Animal d = new Dog();
        animalSounds(d);*/


    }

    static void animalSounds(Animal a) {
        a.shout();
    }
}


class Animal{
    public void shout() {
        System.out.println("hey!");
    }
}

class Dog extends Animal{
    public void shout() {
        System.out.println("wang~");
    }
}

class Cat extends Animal {
    public void shout() {
        System.out.println("meow~");
    }
}
