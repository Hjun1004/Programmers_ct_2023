package com.ll.level0.p120823;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int countStar = 0;
        for(int i = 0 ; i < n ; i++){
            countStar++;
            for(int j = 0 ; j < countStar ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
