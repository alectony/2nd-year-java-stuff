/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.Scanner;

/**
 *
 * @author CL2-PC
 */
public class Mavenproject2 {
            
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println( "Rock [1] - Paper [2] - Scissors [3]" );
        
        System.out.println( "Player 1's Move: ");
        int x = input.nextInt();
        System.out.println( "Player 2's Move: ");
        int y = input.nextInt();
        
        if(x == 1 && y == 2 || x == 2 && y == 3)
        {
            System.out.println("Player 2 Wins!");
        }

    }
}