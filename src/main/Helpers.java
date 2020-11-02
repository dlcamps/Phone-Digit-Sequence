package main;

import java.util.ArrayList;

public class Helpers {

    public static ArrayList<String> stringToArray(String inputString) {
        ArrayList<String> returnArray = new ArrayList<>();
        int stopIndex;

        for (int i = 0; i < inputString.length(); i++) {
            stopIndex = i + 1;
            String tempDigit = inputString.substring(i, stopIndex);
            returnArray.add(tempDigit);
        }

        return returnArray;
    }

    public static ArrayList<String> getLetters(int digit) {
        ArrayList<String> returnArray = new ArrayList<>();

        switch (digit) {
            case 0: case 1:
                break;

            case 2: returnArray.add("A");
                returnArray.add("B");
                returnArray.add("C");
                break;
            case 3: returnArray.add("D");
                returnArray.add("E");
                returnArray.add("F");
                break;
            case 4: returnArray.add("G");
                returnArray.add("H");
                returnArray.add("I");
                break;
            case 5: returnArray.add("J");
                returnArray.add("K");
                returnArray.add("L");
                break;
            case 6: returnArray.add("M");
                returnArray.add("N");
                returnArray.add("O");
                break;
            case 7: returnArray.add("P");
                returnArray.add("Q");
                returnArray.add("R");
                returnArray.add("S");
                break;
            case 8: returnArray.add("T");
                returnArray.add("U");
                returnArray.add("V");
                break;
            case 9: returnArray.add("W");
                returnArray.add("X");
                returnArray.add("Y");
                returnArray.add("Z");
                break;
        }
        return returnArray;
    }

}
