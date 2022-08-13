/**
 * This is a Test Program
 *
 * @author Oliver
 * @date 8/5/2022 6:23 PM
 */
package com.company;

public class TestRecursion {

    public static void main(String[] args)
    {

        long d1 = System.currentTimeMillis();
        System.out.printf("factorial result: %s%n", factorial(10));
        long d2 = System.currentTimeMillis();
        System.out.println(d2 + ":" + d1);
        System.out.printf("factorial last: %s%n",d2-d1);

        System.out.println("\n");
        factorialLoop(10);

    }

    /**
     * Calculates the factorial of n! = n * (n-1)!
     * @param n a number
     * @return factorial(n)
     */

    static long factorial(int n) {
        if (n == 1){ //递归头
            return 1;
        } else { // 递归体
            return n * factorial(n - 1);
        }
    }

    /**
     * Calculates the factorial of n! = n * (n-1)!
     * @param a a number
     * @return factorial(a)
     */

    static long factorialLoop(int a)
    {
        long d3 = System.currentTimeMillis();
        long result = 1;
        while (a > 1)
        {
            result *= a * (a - 1);
            a *= 2;
        }
        long d4 = System.currentTimeMillis();
        System.out.println("normal results: " + result );
        System.out.printf("normal: %s%n", d4 - d3 );
        System.out.println("\n");
        return result;
    }
}
