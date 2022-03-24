package com.pedrovbo.exercises;

import java.util.Random;
import java.util.Scanner;

/**
 * Crie um jogo de JoKenPo (Pedra-Papel-Tesoura)
 */
public class Exercise31 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random rand = new Random();

        int playerChoice, computerChoice;
        char choice;
        boolean game = true;
        System.out.println("##### JOKENPO GAME #####");

        while (game) {
            System.out.println("Make your choice:");
            System.out.println(" 1 - Rock");
            System.out.println(" 2 - Paper");
            System.out.println(" 3 - Scissors");
            playerChoice = reader.nextInt();
            computerChoice = rand.nextInt(3)+1;

            switch (playerChoice) {
                case 1:
                    System.out.println("You chose Rock!");
                    break;
                case 2:
                    System.out.println("You chose Paper!");
                    break;
                case 3:
                    System.out.println("You chose Scissors!");
                    break;

                default:
                    System.out.println("Invalid value!");
                    break;
            }

            switch (computerChoice) {
                case 1:
                    System.out.println("Opponent chose Rock!");
                    break;
                case 2:
                    System.out.println("Opponent chose Paper!");
                    break;
                case 3:
                    System.out.println("Opponent chose Scissors!");
                    break;

                default:
                    System.out.println("Invalid value!");
                    break;
            }

            if (playerChoice == computerChoice) {
                System.out.println("DRAW!");
            } else if ((playerChoice == 1 && computerChoice == 3)
                    || (playerChoice == 3 && computerChoice == 2)
                    || (playerChoice == 2 && computerChoice == 1)) {
                System.out.println("YOU WON!");
            } else 
                System.out.println("YOU LOST!");
            

            System.out.println("Keep playing? Y/N");
            choice = reader.next().toUpperCase().charAt(0);
            if(choice == 'Y')
                game = true;
            else if(choice == 'N')
                game = false;
            
        }

        System.out.println("##### GAME OVER #####");
        reader.close();
    }
}
