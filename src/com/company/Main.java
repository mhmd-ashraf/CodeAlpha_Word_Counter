package com.company;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the paragraph : ");
        String p = input.nextLine();
        int wordCounter = wordCount(p);
        System.out.println("Word Count : "+ wordCounter);
        input.close();
    }

    public static int wordCount(String text){
        String[] words = text.split("\\s+");
        return words.length;
    }
}
