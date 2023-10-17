package models;

import java.util.Scanner;

public class BombInformations {
    public static Integer batteryCount = null;
    public static Boolean frkLabel = null;
    public static Boolean carLabel = null;
    public static Boolean serialNumberOdd = null;
    public static Boolean vowelInSerialNumber = null;
    public static Boolean parallelPort = null;
    public static Integer strikes = null;

    public int getBatteryCount() {
        if (batteryCount == null) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("How many battery do you have (0-10)? ");
            batteryCount = scanner.nextInt();
        }
        return batteryCount;
    }

    public boolean getFrkLabel() {
        if (frkLabel == null) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("is there a lit indicator with label FRK (y/n)? ");
            String userInput = scanner.nextLine().toLowerCase();
            if (userInput == "y" || userInput == "yes") {
                frkLabel = true;
            } else {
                frkLabel = false;
            }
        }
        return frkLabel;
    }

    public boolean getCarLabel() {
        if (carLabel == null) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("is there a lit indicator with label CAR (y/n)? ");
            String userInput = scanner.nextLine().toLowerCase();
            if (userInput == "y" || userInput == "yes") {
                carLabel = true;
            } else {
                carLabel = false;
            }
        }
        return carLabel;
    }

    public boolean getSerialNumberOdd() {
        if (serialNumberOdd == null) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("is the serial number odd (y/n)? ");
            String userInput = scanner.nextLine().toLowerCase();
            if (userInput == "y" || userInput == "yes") {
                serialNumberOdd = true;
            } else {
                serialNumberOdd = false;
            }
        }
        return serialNumberOdd;
    }

    public boolean getvowelInSerialNumber() {
        if (vowelInSerialNumber == null) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("is the serial number contains vowel (y/n)? ");
            String userInput = scanner.nextLine().toLowerCase();
            if (userInput == "y" || userInput == "yes") {
                vowelInSerialNumber = true;
            } else {
                vowelInSerialNumber = false;
            }
        }
        return vowelInSerialNumber;
    }

    public boolean getParallelPort() {
        if (parallelPort == null) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("is there any parallel ports (y/n)? ");
            String userInput = scanner.nextLine().toLowerCase();
            if (userInput == "y" || userInput == "yes") {
                parallelPort = true;
            } else {
                parallelPort = false;
            }
        }
        return carLabel;
    }

    public int getStrikes() {
        if (strikes == null) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("How many strikes do you have (0-2)? ");
            strikes = scanner.nextInt();
        }
        if (strikes > 2) {
            return -1;
        }
        return strikes;
    }
}


