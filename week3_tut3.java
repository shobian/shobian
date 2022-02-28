package com.company;

import java.util.Scanner;

public class week3_tut3 {

    public static void main(String[] args) {
s
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the marks: ");
        int marks = scanner.nextInt();



        if (100 <= marks >= 80){
            System.out.println("A");
        } else if (marks >= 60) {
            System.out.println("B");
        }else if (marks >= 50) {
            System.out.println("C");
        }else if (marks >= 45) {
            System.out.println("D");
        }else if (marks >= 25) {
            System.out.println("E");
        } else {
            System.out.println("F");

        }
    }
}

