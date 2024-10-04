package edu.neu.mgen.lab;


public class Part1Array {
    public static void main(String[] args) {
        int[] x = {2, 4, 6, 0, 8};
        int[] y = {1, 5, 3, 7, 9};
        int[] z = new int[5];
        for (int i = 0; i < 5; i++) {
            z[i] = Math.max(x[i], y[i]);
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(x[i]);
            if (i < 4) System.out.print(", ");
        }
        System.out.println(" }");

        System.out.print("Array y = { ");
        for (int i = 0; i < 5; i++) {
            System.out.print(y[i]);
            if (i < 4) System.out.print(", ");
        }
        System.out.println(" }");

        System.out.print("Array z = x + y = { ");
        for (int i = 0; i < 5; i++) {
            System.out.print(z[i]);
            if (i < 4) System.out.print(", ");
        }
        System.out.println(" }");


    }

}
