package Exercises;

import java.util.Random;

public class blackjackfun {

    public static void main(String[] args) {
        Random cardGen = new Random();

        int card_1 = cardGen.nextInt(13) + 1;
        int card_2 = cardGen.nextInt(13) + 1;

        System.out.println("Card 1: " + card_1);
        System.out.println("Card 2: " + card_2);
    }
}