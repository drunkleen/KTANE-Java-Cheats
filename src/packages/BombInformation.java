package packages;

import lombok.Data;

import java.util.Scanner;

@Data
public class BombInformation {
    private static Integer batteryCount = null;
    private static Boolean frkLabel = null;
    private static Boolean carLabel = null;
    private static Boolean serialNumberOdd = null;
    private static Boolean vowelInSerialNumber = null;
    private static Boolean parallelPort = null;
    private static Integer strikes = null;

    public int getBatteryCount() {
        if (batteryCount == null) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("How many batteries do you have? (0-10) ");
            batteryCount = scanner.nextInt();
            scanner.close();
        }
        return batteryCount;
    }

    public boolean getFrkLabel() {
        if (frkLabel == null) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("is there a lit indicator with label FRK (y/n)? ");
            String userInput = scanner.nextLine().toLowerCase();
            frkLabel = userInput.equals("y") || userInput.equals("yes");
            scanner.close();
        }
        return frkLabel;
    }

    public boolean getCarLabel() {
        if (carLabel == null) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("is there a lit indicator with label CAR (y/n)? ");
            String userInput = scanner.nextLine().toLowerCase();
            carLabel = userInput.equals("y") || userInput.equals("yes");
            scanner.close();
        }
        return carLabel;
    }

    public boolean getSerialNumberOdd() {
        if (serialNumberOdd == null) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("is the serial number odd (y/n)? ");
            String userInput = scanner.nextLine().toLowerCase();
            serialNumberOdd = userInput.equals("y") || userInput.equals("yes");
            scanner.close();
        }
        return serialNumberOdd;
    }

    public boolean getvowelInSerialNumber() {
        if (vowelInSerialNumber == null) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("is the serial number contains vowel (y/n)? ");
            String userInput = scanner.nextLine().toLowerCase();
            vowelInSerialNumber = userInput.equals("y") || userInput.equals("yes");
            scanner.close();
        }
        return vowelInSerialNumber;
    }

    public boolean getParallelPort() {
        if (parallelPort == null) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("is there any parallel ports (y/n)? ");
            String userInput = scanner.nextLine().toLowerCase();
            parallelPort = userInput.equals("y") || userInput.equals("yes");
            scanner.close();
        }
        return carLabel;
    }

    public int getStrikes() {
        return (strikes == null) ? 0 : strikes;
    }

    public void strikeUp() {
        strikes = (strikes == null) ? 1 : strikes + 1;
    }

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



