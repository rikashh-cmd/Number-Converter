AI Mode conversation: send code accuratlyYou sent: iCD125_PRF_Week05_iCalc Number Converter System_Coursework (1) (5).pdf and said: send code accuratlyiCD125_PRF_Week05_iCalc Number Converter System_Coursework (1) (5).pdfsend code accuratlyjavaimport java.util.Scanner;

public class NumberConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(String.class.cast("").getClass().cast(System.in));

        // Main application loop
        while (true) {
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println("  _   _                      _                 _____                               _ ");
            System.out.println(" | \\ | |                    | |               / ____|                             | |");
            System.out.println(" |  \\| |_   _ _ __ ___   ___| |__   ___ _ __ | |     ___  _ ____   _____ _ __| |_ ___ _ __ ");
            System.out.println(" | . ` | | | | '_ ` _ \\ / _ \\ '_ \\ / _ \\ '__|| |    / _ \\| '_ \\ \\ / / _ \\ '__| __/ _ \\ '__|");
            System.out.println(" | |\\  | |_| | | | | | |  __/ |_) |  __/ |   | |___| (_) | | | \\ V /  __/ |  | ||  __/ |   ");
            System.out.println(" |_| \\_|\\__,_|_| |_| |_|\\___|_.__/ \\___|_|    \\_____\\___/|_| |_|\\_/ \\___|_|   \\__\\___|_|   ");
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println("\n\t[01] Decimal Converter");
            System.out.println("\t[02] Binary Converter");
            System.out.println("\t[03] Octal Converter");
            System.out.println("\t[04] Hexadecimal Converter");
            System.out.println("\t[05] Roman Number Converter\n");
            System.out.print("Enter Option -> ");

            String option = scanner.nextLine().trim();

            if (option.equals("01") || option.equals("1")) {
                // Decimal Converter
                while (true) {
                    System.out.println("\n+-------------------------------------------------------+");
                    System.out.println("|                   Decimal Converter                   |");
                    System.out.println("+-------------------------------------------------------+");
                    System.out.print("\nEnter a Decimal number: ");
                    String input = scanner.nextLine().trim();

                    // Validation: must be non-empty and digits only (positive)
                    boolean isValid = !input.isEmpty();
                    for (int i = 0; i < input.length(); i++) {
                        char c = input.charAt(i);
                        if (c < '0' || c > '9') {
                            isValid = false;
                            break;
                        }
                    }

                    if (!isValid) {
                        System.out.println("\tInvalid input...");
                        System.out.print("\nDo you want to input number again (Y/N) -> ");
                        String retry = scanner.nextLine().trim().toUpperCase();
                        if (retry.equals("Y")) {
                            continue;
                        } else {
                            break; // Back to homepage
                        }
                    }

                    // Convert String to long value
                    long decimalValue = 0;
                    for (int i = 0; i < input.length(); i++) {
                        decimalValue = decimalValue * 10 + (input.charAt(i) - '0');
                    }

                    // Binary conversion
                    String binaryStr = "";
                    long tempDec = decimalValue;
                    if (tempDec == 0) {
                        binaryStr = "0";
                    } else {
                        while (tempDec > 0) {
                            binaryStr = (tempDec % 2) + binaryStr;
                            tempDec /= 2;
                        }
                    }

                    // Octal conversion
                    String octalStr = "";
                    tempDec = decimalValue;
                    if (tempDec == 0) {
                        octalStr = "0";
                    } else {
                        while (tempDec > 0) {
                            octalStr = (tempDec % 8) + octalStr;
                            tempDec /= 8;
                        }
                    }

                    // Hexadecimal conversion
                    String hexStr = "";
                    tempDec = decimalValue;
                    char[] hexChars = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
                    if (tempDec == 0) {
                        hexStr = "0";
                    } else {
                        while (tempDec > 0) {
                            hexStr = hexChars[(int)(tempDec % 16)] + hexStr;
                            tempDec /= 16;
                        }
                    }

                    System.out.println("\n\tBinary number: " + binaryStr);
                    System.out.println("\tOctal number: " + octalStr);
                    System.out.println("\tHexadecimal number: " + hexStr);

                    System.out.print("\nDo you want to go to homepage (Y/N)-> ");
                    String choice = scanner.nextLine().trim().toUpperCase();
                    if (choice.equals("Y")) {
                        break;
                    } else {
                        System.exit(0);
                    }
                }

            } else if (option.equals("02") || option.equals("2")) {
                // Binary Converter
                while (true) {
                    System.out.println("\n+-------------------------------------------------------+");
                    System.out.println("|                    Binary Converter                   |");
                    System.out.println("+-------------------------------------------------------+");
                    System.out.print("\nEnter a Binary number: ");
                    String input = scanner.nextLine().trim();

                    boolean isValid = !input.isEmpty();
                    for (int i = 0; i < input.length(); i++) {
                        char c = input.charAt(i);
                        if (c != '0' && c != '1') {
                            isValid = false;
                            break;
                        }
                    }

                    if (!isValid) {
                        System.out.println("\tInvalid input...");
                        System.out.print("\nDo you want to input number again (Y/N) -> ");
                        String retry = scanner.nextLine().trim().toUpperCase();
                        if (retry.equals("Y")) {
                            continue;
                        } else {
                            break;
                        }
                    }

                    // Parse binary to decimal
                    long decimalValue = 0;
                    for (int i = 0; i < input.length(); i++) {
                        decimalValue = decimalValue * 2 + (input.charAt(i) - '0');
                    }

                    // Octal from decimal
                    String octalStr = "";
                    long tempDec = decimalValue;
                    if (tempDec == 0) {
                        octalStr = "0";
                    } else {
                        while (tempDec > 0) {
                            octalStr = (tempDec % 8) + octalStr;
                            tempDec /= 8;
                        }
                    }

                    // Hex from decimal
                    String hexStr = "";
                    tempDec = decimalValue;
                    char[] hexChars = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
                    if (tempDec == 0) {
                        hexStr = "0";
                    } else {
                        while (tempDec > 0) {
                            hexStr = hexChars[(int)(tempDec % 16)] + hexStr;
                            tempDec /= 16;
                        }
                    }

                    System.out.println("\n\tDecimal Number: " + decimalValue);
                    System.out.println("\tOctal number: " + octalStr);
                    System.out.println("\tHexadecimal number: " + hexStr);

                    System.out.print("\nDo you want to go to homepage (Y/N)-> ");
                    String choice = scanner.nextLine().trim().toUpperCase();
                    if (choice.equals("Y")) {
                        break;
                    } else {
                        System.exit(0);
                    }
                }

            } else if (option.equals("03") || option.equals("3")) {
                // Octal Converter
                while (true) {
                    System.out.println("\n+-------------------------------------------------------+");
                    System.out.println("|                     Octal Converter                   |");
                    System.out.println("+-------------------------------------------------------+");
                    System.out.print("\nEnter an Octal number: ");
                    String input = scanner.nextLine().trim();

                    boolean isValid = !input.isEmpty();
                    for (int i = 0; i < input.length(); i++) {
                        char c = input.charAt(i);
                        if (c < '0' || c > '7') {
                            isValid = false;
                            break;
                        }
                    }

                    if (!isValid) {
                        System.out.println("\tInvalid input...");
                        System.out.print("\nDo you want to input number again (Y/N) -> ");
                        String retry = scanner.nextLine().trim().toUpperCase();
                        if (retry.equals("Y")) {
                            continue;
                        } else {
Use code with caution.break;}}// Parse octal to decimallong decimalValue = 0;for (int i = 0; i < input.length(); i++) {decimalValue = decimalValue * 8 + (input.charAt(i) - '0');}// Binary from decimalString binaryStr = "";long tempDec = decimalValue;if (tempDec == 0) {binaryStr = "0";} else {while (tempDec > 0) {binaryStr = (tempDec % 2) + binaryStr;tempDec /= 2;}}// Hex from decimalString hexStr = "";tempDec = decimalValue;char[] hexChars = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};if (tempDec == 0) {hexStr = "0";} else {while (tempDec > 0) {hexStr = hexChars[(int)(tempDec % 16)] + hexStr;tempDec /= 16;}}System.out.println("\n\tDecimal Number: " + decimalValue);System.out.println("\tBinary Number: " + binaryStr);System.out.println("\tHexadecimal Number: " + hexStr);System.out.print("\nDo you want to go to homepage (Y/N)-> ");String choice = scanner.nextLine().trim().toUpperCase();if (choice.equals("Y")) {break;} else {System.exit(0);}}} else if (option.equals("04") || option.equals("4")) {// Hexadecimal Converterwhile (true) {System.out.println("\n+-------------------------------------------------------+");System.out.println("|                  HexaDecimal Converter                |");System.out.println("+-------------------------------------------------------+");System.out.print("\nEnter an HexaDecimal number: ");String input = scanner.nextLine().trim();boolean isValid = !input.isEmpty();for (int i = 0; i < input.length(); i++) {char c = input.charAt(i);boolean isDigit = (c >= '0' && c <= '9');boolean isUpperHex = (c >= 'A' && c <= 'F');boolean isLowerHex = (c >= 'a' && c <= 'f');if (!isDigit && !isUpperHex && !isLowerHex) {isValid = false;break;}}if (!isValid) {System.out.println("\tInvalid input...");System.out.print("\nDo you want to input number again (Y/N) -> ");String retry = scanner.nextLine().trim().toUpperCase();if (retry.equals("Y")) {continue;} else {break;}}// Parse Hex to decimallong decimalValue = 0;for (int i = 0; i < input.length(); i++) {char c = input.charAt(i);int value = 0;if (c >= '0' && c <= '9') {value = c - '0';} else if (c >= 'A' && c <= 'F') {value = c - 'A' + 10;} else if (c >= 'a' && c <= 'f') {value = c - 'a' + 10;}decimalValue = decimalValue * 16 + value;}// Binary from decimalString binaryStr = "";long tempDec = decimalValue;if (tempDec == 0) {binaryStr = "0";} else {while (tempDec > 0) {binaryStr = (tempDec % 2) + binaryStr;tempDec /= 2;}}// Octal from decimalString octalStr = "";tempDec = decimalValue;if (tempDec == 0) {octalStr = "0";} else {while (tempDec > 0) {octalStr = (tempDec % 8) + octalStr;tempDec /= 8;}}System.out.println("\n\tDecimal Number: " + decimalValue);System.out.println("\tBinary Number: " + binaryStr);System.out.println("\tOctal Number: " + octalStr);System.out.print("\nDo you want to go to homepage (Y/N)-> ");String choice = scanner.nextLine().trim().toUpperCase();if (choice.equals("Y")) {break;} else {System.exit(0);}}} else if (option.equals("05") || option.equals("5")) {// Roman Number Converterwhile (true) {System.out.println("\n+-------------------------------------------------------+");System.out.println("|                 Roman Number Converter                |");System.out.println("+-------------------------------------------------------+");System.out.println("\n\t[01] Decimal Number to Roman Number Converter");System.out.println("\t[02] Roman Number to Decimal Number Converter\n");System.out.print("Enter an option: ");String subOption = scanner.nextLine().trim();if (subOption.equals("01") || subOption.equals("1")) {while (true) {System.out.println("\n+-------------------------------------------------------+");System.out.println("|         Decimal Number to Roman Number Converter      |");System.out.println("+-------------------------------------------------------+");System.out.print("\nEnter an Decimal number: ");String input = scanner.nextLine().trim();boolean isValid = !input.isEmpty();for (int i = 0; i < input.length(); i++) {char c = input.charAt(i);if (c < '0' || c > '9') {isValid = false;break;}}if (!isValid) {System.out.println("\tInvalid input...");System.out.print("\nDo you want to input number again (Y/N) -> ");String retry = scanner.nextLine().trim().toUpperCase();if (retry.equals("Y")) {continue;} else {break;}}int decNum = 0;for (int i = 0; i < input.length(); i++) {decNum = decNum * 10 + (input.charAt(i) - '0');}if (decNum <= 0 || decNum > 3999) {System.out.println("\tInvalid range (Must be 1-3999)...");System.out.print("\nDo you want to input number again (Y/N) -> ");String retry = scanner.nextLine().trim().toUpperCase();if (retry.equals("Y")) {continue;} else {break;}}int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};String[] romanLetters = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};String romanStr = "";int temp = decNum;for (int i = 0; i < values.length; i++) {while (temp >= values[i]) {romanStr += romanLetters[i];temp -= values[i];}}System.out.println("\n\tRoman numeral: " + romanStr);break;}
