package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double array[] = {3.5, -3.9, 1.6, 4.5, -22.8, 10.1, -12.6, 5.2, 3.6, -8.8, 34.5, -0.95, 7.5, -4.8, -9.4};
        int i = 0;
        for (i = 0; i < array.length; i++) ;


        double result = 0;
        for (double d : array) {
            result += d;
        }
        for (i = 0; i < 1; i++) {
            double k = result - i;
            if (i < 0) {
                break;

            }


            System.out.println("Среднее арифметическое " + (result + k) / array.length);
        }


    }

}


