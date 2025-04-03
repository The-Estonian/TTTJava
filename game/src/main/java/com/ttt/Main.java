package com.ttt;

import java.io.IOException;
import java.util.Scanner;

import com.ttt.Grid.Grid;
import com.ttt.Helper.Helper;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        Helper.clear();
        Grid.printGrid();

        int playerTurn = 9;
        while (playerTurn > 0) {
            String currentPlayer;
            if (playerTurn % 2 == 1) {
                currentPlayer = "x";
            } else {
                currentPlayer = "o";
            }
            System.out.println("It's " + currentPlayer + " turn!");
            System.out.println("Choice");
            String input = scanner.nextLine();
            if (input.equals("x")) {
                break;
            } else if (input.equals("1")) {
                Helper.clear();
                Grid.placePlayer("1", currentPlayer);
                Grid.printGrid();
            } else if (input.equals("2")) {
                Helper.clear();
                Grid.placePlayer("2", currentPlayer);
                Grid.printGrid();
            } else if (input.equals("3")) {
                Helper.clear();
                Grid.placePlayer("3", currentPlayer);
                Grid.printGrid();
            } else if (input.equals("4")) {
                Helper.clear();
                Grid.placePlayer("4", currentPlayer);
                Grid.printGrid();
            } else if (input.equals("5")) {
                Helper.clear();
                Grid.placePlayer("5", currentPlayer);
                Grid.printGrid();
            } else if (input.equals("6")) {
                Helper.clear();
                Grid.placePlayer("6", currentPlayer);
                Grid.printGrid();
            } else if (input.equals("7")) {
                Helper.clear();
                Grid.placePlayer("7", currentPlayer);
                Grid.printGrid();
            } else if (input.equals("8")) {
                Helper.clear();
                Grid.placePlayer("8", currentPlayer);
                Grid.printGrid();
            } else if (input.equals("9")) {
                Helper.clear();
                Grid.placePlayer("9", currentPlayer);
                Grid.printGrid();
            } else {
                Helper.clear();
                Grid.printGrid();
            }
            playerTurn--;
        }
        scanner.close();
    }
}