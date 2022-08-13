/**
 * This is a Test Program
 *
 * @author Oliver
 * @date 8/7/2022 8:08 PM
 */
package com.company;

public class TestToString {

    public static void main(String[] args)
    {
        Person2 wang = new Person2("Wang", 22);
        System.out.printf(wang.toString());
    }
}

class Person2{

    private String name;
    private int age;

    public String toString(){
        return "Person information: " + name + " , " + age;
    }

    public Person2(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

}
