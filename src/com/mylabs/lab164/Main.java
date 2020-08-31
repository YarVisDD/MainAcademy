package com.mylabs.lab164;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arr={2,1,5,4,12,3,23,12,4,53,11};
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");

        }
        Arrays.sort(arr);
        System.out.println();
        System.out.println("Sorted array is: ");
        System.out.println(Arrays.toString(arr));
        int searchVal=3;
        int retVal=Arrays.binarySearch(arr,searchVal);
        System.out.println("The index of element 3 is :" + retVal);
    }
}
