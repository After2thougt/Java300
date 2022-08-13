/**
 * This is a Test Program
 *
 * @author Oliver
 * @date 8/7/2022 9:36 PM
 */
package com.company;

public class TestEncapsulation {

    public static void main(String[] args)
    {
        Human Adam = new Human();
        //Adam.age = 100000;
        Adam.name = "Adam·WhoKnows";
        Adam.printName();
    }

}

class Human {

    String name;
    private int age;

    void printName() {
        System.out.println(name);
    }
}