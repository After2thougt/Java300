/**
 * This is a Test Program
 *
 * @author Oliver
 * @date 8/12/2022 10:47 PM
 */
package com.company;

public class TestArrayCopy {

    public static void main(String[] args) {

        //testBasicCopy();

        String[] testArray = {"Apple", "Orange", "Peaches", "Lemon"};
        //removeElement(testArray, 2);

        extendRange(testArray);

    }

    // define a bigger range where combination the old array parameters
    private static String[] extendRange(String[] s1) {

        //String[] s1 = {"a", "b", "c"};
        String[] s2 = new String[s1.length+10];
        System.arraycopy(s1, 0, s2, 0, s1.length);
        for(String m:s2)
            System.out.println(m);

        return s2;
    }

    /**
     * delete parameter from array
     * @param s a array
     * @param index an index where you would like to delete an element
     * @return an array which has been deleted a specified index params.
     */

    private static String[] removeElement(String[] s, int index) {

        System.arraycopy(s, index+1, s, index, s.length-index-1);
        s[s.length - 1] =null;
        for(String m:s)
            System.out.println(m);
        return s;
    }

    public static void testBasicCopy(){
        String[] s1 = {"a", "b", "c", "d", "e"};

        System.arraycopy(s1,3,s1,3-1,s1.length-3);

        s1[s1.length - 1] = null;

        for(String m:s1)
            System.out.println(m);
    }
}
