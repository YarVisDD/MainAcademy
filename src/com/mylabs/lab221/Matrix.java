package com.mylabs.lab221;

import java.util.Random;

public class Matrix {
    int mass[][]=new int[5][5];
    int mass1[][]=new int[5][5];
    int mass2[][]=new int[5][5];



    public void Add(){
        Random rand=new Random();
        for(int i=0;i<mass.length;i++){
            for(int j=0;j<mass.length;j++){
                mass[i][j]=rand.nextInt(10);
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<mass1.length;i++){
            for(int j=0;j<mass1.length;j++){
                mass1[i][j]=rand.nextInt(10);
            }
            System.out.println();
        }
    }
    public void Show(){
        for(int i=0;i<mass.length;i++){
            for(int j=0;j<mass.length;j++){
                System.out.print(mass[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<mass1.length;i++){
            for(int j=0;j<mass1.length;j++){
                System.out.print(mass1[i][j]+" ");
            }
            System.out.println();
        }

    }
    public void Additional(){

        for(int i=0;i<mass.length;i++){
            for(int j=0;j<mass1.length;j++){
                mass2[i][j]=mass[i][j]+mass1[i][j];
            }
            System.out.println();
        } for(int i=0;i<mass.length;i++){
            for(int j=0;j<mass1.length;j++){
                System.out.print(mass2[i][j]+" ");
            }
            System.out.println();
        }


    } public void MyMuliplication(){

        for(int i=0;i<mass.length;i++){
            for(int j=0;j<mass1.length;j++){
                mass2[i][j]=mass[i][j]*mass1[i][j];
            }
            System.out.println();
        } for(int i=0;i<mass.length;i++){
            for(int j=0;j<mass1.length;j++){
                System.out.print(mass2[i][j]+" ");
            }
            System.out.println();
        }


    }


    public static void main(String[] args) {
        Matrix mass1=new Matrix();
        mass1.Add();
        mass1.Show();
        System.out.println();
       mass1.Additional();
        System.out.println();
mass1.MyMuliplication();






    }
}
