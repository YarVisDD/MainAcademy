package com.mylabs.lab242;

import com.mylabs.lab241.MyMath;

public class Calculation {
    int[]arr1={10,1,2,45,12,23,14,10};
    int[]arr2={1,4,23,5,-1,23,55,6,7};

    public static void main(String[] args) {
        Calculation calculation=new Calculation();
       int min= MyMath.findMin(calculation.arr1);
       int max=MyMath.findMax((calculation.arr2));
        System.out.println("Минимальный элемент массива - "+min);
        System.out.println("Максимальный элемент массива - "+max);
    }
}
