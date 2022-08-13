/**
 * This is a Test Program
 *
 * @author Oliver
 * @date 8/8/2022 4:01 PM
 */
package com.company;

public class TestPerson {

    public static void main(String[] args)
    {
        Person xiaowang = new Person();
        xiaowang.setName("Wang");
        xiaowang.setFlag(false);
        System.out.println(xiaowang.getName());
        System.out.println(xiaowang.isFlag());

    }
}
