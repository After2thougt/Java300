/**
 * This is a Test Program
 *
 * @author Oliver
 * @date 8/7/2022 8:50 PM
 */
package com.company;

import java.util.Objects;

public class TestEquals {

    public static void main(String[] args)
    {
        Object obj;
        String str;

        User u1 = new User(110, "Wang");
        User u2 = new User(110,"Huang");

        System.out.println(u1 == u2);
        System.out.println("equals: " + u1.equals(u2));
        System.out.println("\n");

        String str1 = new String("aaa");
        String str2 = new String("aaa");
        System.out.println("equals: " + str1.equals(str2));
    }
}

class User{
    private int id;
    private String name;

    public User(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
