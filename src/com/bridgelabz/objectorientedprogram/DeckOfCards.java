package com.bridgelabz.objectorientedprogram;

public class DeckOfCards {

    public static void main(String[] args) {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[][] array = new String[4][13];

        // Initialize the cards
        int n = suits.length * ranks.length;
        String[] deck = new String[n];
        for (int i= 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = ranks[i] + suits[j];
            }
        }

        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }
        // Shuffle the cards
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.println(array[i][j] = (deck[i + j * 4]));
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Player:" + (i + 1));
            for (int j = 0; j < 9; j++) {
                System.out.println(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
