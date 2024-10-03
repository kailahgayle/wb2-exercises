package com.pluralsight;

public class HighScoreWins {

import java.util.Scanner;

    public class HighScoreWins {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Prompt the user for a game score
            System.out.println("Please enter a game score (format: ex:Home:Visitor|21:9): ");

            System.out.println("___________________________________________________________");
            String userInput = scanner.nextLine();

            // Split the input on the pipe (|) to get team names and scores
            String[] parts = userInput.split("\\|");
            String teamScores = parts[1]; // e.g., "28:14"

            // Split the team scores on the colon (:) to get individual scores
            String[] scores = teamScores.split(":");
            int teamAScore = Integer.parseInt(scores[0]);
            int teamBScore = Integer.parseInt(scores[1]);

            // Determine the winner
            String teamA = parts[0].split(":")[0];
            String teamB = parts[0].split(":")[1];


            // handle a tie
            String winner;

            if (teamAScore > teamBScore) {
                winner = teamA;
            } else if (teamAScore < teamBScore) {
                winner = teamB;
            } else {
                winner = "It's a tie!";
            }


            // Display the winner
            System.out.println("Winner: " + winner);

            // Close the scanner
            scanner.close();
        }
    }




}
