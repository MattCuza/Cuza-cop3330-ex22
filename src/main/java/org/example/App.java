/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Matthew Cuza
 */
package org.example;
import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int first = sc.nextInt();

        System.out.println("Enter the second number");
        int second = sc.nextInt();

        System.out.println("Enter the third number");
        int third = sc.nextInt();
        int result = 0;
        if(first > third && first > second) {
            result = first;
        }
        else if(second > third && second > first){
            result = second;
        }
        else if(third > second && third > first){
            result = third;
        }
        if(third == first || first == second || second == third){
            result = 0;
        }
        if(result == 0){
            System.out.println("One of the numbers is the same");
        }
        else
        {
            System.out.println(result + " is the greatest");
        }
    }
}