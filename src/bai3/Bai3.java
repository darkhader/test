/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author Hiep Nguyen
 */
public class Bai3 {

    static int px, py, bx, by, gx, gy;
    static Scanner sc = new Scanner(System.in);

    static int[][] a = new int[10][10];
    static String move = "";

    public static void main(String[] args) {
        //  ThietkeMT();
        while (true) {
            veMT();
            break;
        }
    }

    private static void veMT() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                a[i][j] = 0;

                switch (a[i][j]) {
                    case 0:
                        System.out.print("*");
                        break;
                    default:
                        break;
                }

            }
            System.out.println("");
        }
    }

}
