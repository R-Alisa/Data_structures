package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Data_task2 {

    public static void task2_1() {


        String sentenceA = "Mom";
        String sentenceB = "Was it a car or a cat I saw?";
        String sentenceC = "Madam, in Eden, I’m Adam.";
        String sentenceD = "Yo, banana boy!";

        sentenceA = sentenceA.toLowerCase();
        String lettersOnly = sentenceA.replaceAll("[\\W]", "");

        Stack stack = new Stack();

        for (int i = 0; i < sentenceA.length(); i++) {
            stack.push(sentenceA.charAt(i));
        }

        String reverseString = "";

        while (!stack.isEmpty()) {
            reverseString = reverseString + stack.pop();
        }

        if (sentenceA.equals(reverseString))
            System.out.println("The input String is a palindrome.");
        else
            System.out.println("The input String is not a palindrome.");

    }

    public static void task2_2() {


        String sentenceA = "Mom";
        String sentenceB = "Was it a car or a cat I saw?";
        String sentenceC = "Madam, in Eden, I’m Adam.";
        String sentenceD = "Yo, banana boy!";

        sentenceA = sentenceA.toLowerCase();
        String lettersOnly = sentenceA.replaceAll("[\\W]", "");

        //Stack stack = new Stack();

        Queue<Character> queue = new LinkedList<>();

        for (int i = sentenceA.length()-1; i>=0; i--){
            queue.add(sentenceA.charAt(i));
        }
        String reverseString = "";
        while(!queue.isEmpty()){
            reverseString=reverseString+queue.remove();
        }

        if (sentenceA.equals(reverseString))
            System.out.println("The input String is a palindrome.");
        else
            System.out.println("The input String is not a palindrome.");

    }
}




