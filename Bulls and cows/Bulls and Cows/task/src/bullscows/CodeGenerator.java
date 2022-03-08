package bullscows;

import java.util.Random;
import java.util.Scanner;

public class CodeGenerator {
    private final static String CHARACTERS_ALLOWED = "0123456789abcdefghijklmnopqrstuvwxyz";

    private SecretCode secretCode;
    private int codeLength;
    private int scope;

    public CodeGenerator() {
        runCodeGenerator();
    }

    public SecretCode getSecretCode() {
        return secretCode;
    }

    public int getCodeLength() {
        return codeLength;
    }

    private void printScope() {
        StringBuilder message = new StringBuilder("The secret is prepared: ");
        message.append("*".repeat(Math.max(0, codeLength)));

        if (scope <= 10) {
            message.append(" (0-").append(CHARACTERS_ALLOWED.charAt(scope - 1)).append(").");
        } else if (scope <= 36) {
            message.append(" (0-9, a-").append(CHARACTERS_ALLOWED.charAt(scope - 1)).append(").");
        }

        message.append("\nOkay, let's start a game!");
        System.out.println(message);
    }

    private void runCodeGenerator() {
        codeLength = input();
        if (codeLength > 0 && codeLength <= 36) {
            System.out.println("Input the length of the secret code:");
        } else {
            System.out.println("Error");
            System.exit(0);
        }

        scope = input();
        if (scope > 0 && scope <= 36) {
            System.out.println("Input the number of possible symbols in the code:");
            if (scope < codeLength) {
                System.out.println("Error: it's not possible to generate a code with a length of " + codeLength
                        + " with " + scope + " unique symbols.");
                System.exit(0);
            }
        } else {
            System.out.println("Error - scope must be between 1 and 36 included.");
            System.exit(0);
        }

        secretCode = generateNumber();
        printScope();
    }

    private int input() {
        var input = new Scanner(System.in).nextLine();
        try {
            int value = Integer.parseInt(input);
            return value;
        } catch (Exception e) {
            System.out.println("Error - input not a number");
            System.exit(0);
            return 0;
        }
    }

    private SecretCode generateNumber() {
        Random random = new Random();
        StringBuilder secretCode = new StringBuilder();
        StringBuilder charScope = new StringBuilder(CHARACTERS_ALLOWED.substring(0, scope));

        for (int i = 0; i < codeLength; i++) {
            int number = random.nextInt(charScope.length());
            secretCode.append(charScope.charAt(number));
            charScope.deleteCharAt(number);
        }

        if (secretCode.length() < codeLength) {
            generateNumber();
        }
        return new SecretCode(secretCode.toString());
    }
}