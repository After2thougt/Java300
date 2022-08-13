/**
 * This is a Test Program
 *
 * @author Oliver
 * @date 8/5/2022 10:53 PM
 */
package com.company;

public class TestStudy {

    int id;
    String name;
    Computer stcomputer;

    void study(){
        System.out.println("I am studying ... My computer is " + stcomputer.brand);
    }

    void play(){
        System.out.println("I am playing now...");
    }

    public static void main(String[] args)
    {
        TestStudy student = new TestStudy();
        student.id = 1;
        student.name = "Wang";
        System.out.println(student);

        Computer c1 = new Computer();
        c1.brand = "ThinkPad";
        System.out.println(c1);

        student.stcomputer = c1;

        student.study();
        student.play();
    }
}

class Computer{

    String brand;

}
