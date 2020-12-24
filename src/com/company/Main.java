package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("LeShawn", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75); // Using the method twice here by just adding an int.
        calculateScore(); // Third time method is used with no parameters.
        double centimeters = calcFeetAndInchesToCentimeters(6, 0);
        if(centimeters <0.0) {
            System.out.println("Invalid parameters");
        }
        calcFeetAndInchesToCentimeters(157);
    }

    // Exercise called "method overloading". Creating a unique method signature.
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    // Using the same method as above but we removed one of the
    // parameters, "playerName". "calculateScore(75)" ^
    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }
    // Third time using method with no parameters
    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }



    // Class assignment
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if((feet < 0) || (inches < 0) || (inches > 12)) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm ");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and "
        + remainingInches + " inches ");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}
