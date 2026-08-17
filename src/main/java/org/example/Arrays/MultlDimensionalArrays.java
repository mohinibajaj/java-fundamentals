package org.example.Arrays;
import java.util.Arrays;

public class MultlDimensionalArrays {

    public static void main(String[] args) {


//        int[][] arr = new int[][]; //this wont work
        //because Java needs to know at least the size of the first dimension when using new.


        int[][] arr = new int[2][3]; //This creates 2 rows × 3 columns:

        arr[0][0] = 2;
        arr[0][1] = 7;
        arr[0][2] = 4;
        arr[1][0] = 5;
        arr[1][1] = 1;
        arr[1][2] = 8;
        System.out.println(arr); // will print array object's reference, not its contents

        System.out.println(Arrays.deepToString(arr)); //import java.util.Arrays;

        System.out.println(  arr[0][1]  ); //o/p 7
        //or

        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(arr2);

        System.out.println(Arrays.deepToString(arr2));
    }
}
