/**
 * This is a Test Program
 *
 * @author Oliver
 * @date 8/12/2022 4:48 PM
 */
package com.company;

public class TestInnerClass {

    public static void main(String[] args){

        // execute non-static
        Outer.Inner inner = new Outer().new Inner();
        inner.show();

        // execute static
        Outer.Inner2 inner2 = new Outer.Inner2();

        // anonymous inner class
        TestInnerClass.test01(new AA() {
            @Override
            public void aa() {

                System.out.println("TestInnerClass.main(...).new AA() {...}.aa()");

            }
        });

    }

    public static void test01(AA a){

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        // execute anonymous inner class
        a.aa();

    }
}

class Outer {
    private int age = 10;

    public void testOuter(){}

    // non-static inner class
    class Inner{
        int age = 20;
        public void show(){
            int age = 30;
            System.out.println("Outer class: " + Outer.this.age);
            System.out.println("Inner class: " + Inner.this.age);
            System.out.println("Method in Inner Class: " + age);
        }

    }

    // static inner class
    static class Inner2{
    }

}


interface AA{
    void aa();
}

