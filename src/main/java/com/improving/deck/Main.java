package com.improving.deck;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press enter to get your 7 cards");
        System.out.print(">");


        var deck = new Deck();
        var input = scanner.nextLine();
        for (int i = 0; i < 7; i++) {
            System.out.println(deck.draw());
        }
        System.out.println("Done");

    }
}
