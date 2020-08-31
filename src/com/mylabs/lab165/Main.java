package com.mylabs.lab165;

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = i;
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
    }}
