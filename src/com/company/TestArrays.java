/**
 * This is a Test Program
 *
 * @author Oliver
 * @date 8/13/2022 6:25 PM
 */
package com.company;

import java.util.Arrays;

public class TestArrays {

    public static void main(String[] args) {

        int[] a  = {40,10,20,30};
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("After Sort: " + Arrays.toString(a));

    }

}
