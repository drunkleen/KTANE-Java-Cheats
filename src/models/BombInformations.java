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
            if (userInput.equals("y") || userInput.equals("yes")) {
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
            if (userInput.equals("y") || userInput.equals("yes")) {
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
            if (userInput.equals("y") || userInput.equals("yes")) {
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
            if (userInput.equals("y") || userInput.equals("yes")) {
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
            if (userInput.equals("y") || userInput.equals("yes")) {
                parallelPort = true;
            } else {
                parallelPort = false;
            }
        }
        return carLabel;
    }

    public int getStrikes() {
        return (strikes == null) ? 0: strikes;
    }

    public void strikeUp() {
        strikes = (strikes == null) ? 1: strikes + 1;

    public void resetBombInformation() {
        batteryCount = null;
        frkLabel = null;
        carLabel = null;
        serialNumberOdd = null;
        vowelInSerialNumber = null;
        parallelPort = null;
        strikes = null;
    }
}



