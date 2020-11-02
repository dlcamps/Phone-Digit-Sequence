package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    String choice;
    String menuChoice;
    ArrayList<String> choiceArray;
    Scanner scanner = new Scanner(System.in);
    String newLine = System.getProperty("line.separator");

    public static void main(String[] args) {
        new Main();
    }



    public Main() {

        while (true) {

            ArrayList<String> allCombos = new ArrayList<>();
            System.out.println(newLine);
            System.out.println("Please enter the digit sequence:");
            choice = scanner.next();
            choiceArray = Helpers.stringToArray(choice);

            for (int i = 0; i < choiceArray.size(); i++) {
                String currentDigitString = choiceArray.get(i);
                int currentDigit = Integer.parseInt(currentDigitString);
                ArrayList<String> tempArray = new ArrayList<>();
                ArrayList<String> digitLetters = Helpers.getLetters(currentDigit);

                if (currentDigit == 1 || currentDigit == 0) {
                    continue;
                }

                if (allCombos.isEmpty()) {
                    allCombos = digitLetters;
                    continue;
                }

                int appendLimit = allCombos.size();

                for (int j = 0; j < appendLimit; j++) {
                    for (int k = 0; k < digitLetters.size(); k++) {
                        String tempString = allCombos.get(j) + digitLetters.get(k);
                        tempArray.add(tempString);
                    }
                }

                allCombos = tempArray;
            }

            System.out.println(newLine);
            if (allCombos.isEmpty()) {
                System.out.println("There are no possible combinations with the provided digits.");
                System.out.println(newLine);
            } else {
                System.out.println("The possible combinations are: " + allCombos);
                System.out.println(newLine);
            }

            System.out.println("Enter '1' to do another combination, or '0' to quit: ");
            menuChoice = scanner.next();

            if (menuChoice.equals("1")) {
                continue;
            } else if (menuChoice.equals("0")) {
                break;
            }
        }
    }

}
