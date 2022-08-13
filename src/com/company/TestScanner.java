/**
 * This is a Test Program
 *
 * @author Oliver
 * @date 8/4/2022 10:43 PM
 */
package com.company;

public class TestScanner {

    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");

        System.out.println(name);
        System.out.println(age);
        System.out.println("How many days arrived on Earth: " + age * 365);
        System.out.println("How many days will I leave: " + (60 - age) * 365);*/


        //System.out.println((int)(6 * Math.random() ));

        TestScanner test = new TestScanner();
        test.add(1,2);


    }

    private int add(int a, int c)
    {
        int sum = a + c;
        System.out.println(sum);
        return sum;
    }
}
