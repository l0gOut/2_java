package com.company;

public class Main {

    public static void main(String[] args) {

        int[][] mas = new int[6][7];
        for (int i = 0; i < mas.length; i++) {
            System.out.println();
            for (int j = 0; j < mas[i].length; j++) {

                mas[i][j] = (int)(100 - Math.random() * 200);
                System.out.print(mas[i][j] + " ");
            }
        }
        System.out.println();
        sort(mas);
    }
    public static void sort (int[][] a) {

        for (int i = 0; i < a.length; i++)
            for (int j = a[i].length - 1; j > 0; j--) {
                for (int k = 0; k < j; k++) {
                    if (a[i][k] < a[i][k + 1]) {
                        int temp = a[i][k];
                        a[i][k] = a[i][k + 1];
                        a[i][k + 1] = temp;
                    }
                }
            }
        for (int i = 0; i < a.length; i++) {
            System.out.println();
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(" " + a[i][j]);
            }
        }
    }
}
