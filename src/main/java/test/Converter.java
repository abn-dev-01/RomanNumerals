package test;

public class Converter {

    public static final String ROMAN_1 = "I";
    public static final String ROMAN_10 = "X";
    public static final String ROMAN_5 = "V";
    public static final String ROMAN_50 = "L";
    public static final String ROMAN_100 = "C";
    public static final String ROMAN_500 = "D";
    public static final String ROMAN_1000 = "M";

    public long romanToNumerals(String roman) {

        long result = 0;
        int i = 0;
        while (i < roman.length()) {
            String currentRoman = String.valueOf(roman.charAt(i));
            long firstNumeral = findNumeralDigit(currentRoman);

            if ((i + 1) < roman.length()) {
                String nextCharacter = String.valueOf(roman.charAt(i + 1));
                long currentNumeral = findNumeralDigit(nextCharacter);
                // next letter is same as current
                if (currentRoman.equalsIgnoreCase(nextCharacter)) {
                    i++;
                    result = result + firstNumeral + currentNumeral;
                } else {
                    // next letter is another
                    if (firstNumeral < currentNumeral) {
                        i++;
                        result = result + (currentNumeral - firstNumeral);
                    } else {
                        // just remember current, no i++ need here
                        result = result + firstNumeral;
                    }
                }
            } else {
                result = result + firstNumeral;
            }
            i++;
        }
        return result;
    }


    /**
     * @param romanDigit is already detected and correct value of Roman digit (i.e. I, III, IV, IX etc )
     * @return Numeral representation of the Roman digit.
     */
    public long findNumeralDigit(String romanDigit) {
        Integer result = 0;
        // easy
        if (ROMAN_1.equals(romanDigit)) {
            result = 1;
        } else if (ROMAN_5.equals(romanDigit)) {
            result = 5;
        } else if (ROMAN_10.equals(romanDigit)) {
            result = 10;
        } else if (ROMAN_50.equals(romanDigit)) {
            result = 50;
        } else if (ROMAN_100.equals(romanDigit)) {
            result = 100;
        } else if (ROMAN_500.equals(romanDigit)) {
            result = 500;
        } else if (ROMAN_1000.equals(romanDigit)) {
            result = 1000;
        }
        // complex
        return result;
    }
}
