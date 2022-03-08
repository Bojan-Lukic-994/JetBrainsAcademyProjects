package bullscows;

import java.util.Scanner;

public class Gameplay {

    private static final Scanner SCANNER = new Scanner(System.in);

    private final CodeGenerator codeGenerator;
    private int bullCounter;
    private int cowCounter;
    private final int secretCodeLength;

    public Gameplay() {
        codeGenerator = new CodeGenerator();
        secretCodeLength = codeGenerator.getCodeLength();
        runGame();
    }

    public String inputAnswer() {
        String userCode = SCANNER.nextLine();
        while (userCode.length() != secretCodeLength) {
            userCode = SCANNER.nextLine();
        }
        return userCode;
    }

    private void runGame() {
        int turnCounter = 0;

        while (bullCounter < secretCodeLength) {
            cowCounter = 0;
            bullCounter = 0;
            turnCounter++;
            System.out.printf("Turn %s. Answer:\n", turnCounter);
            String userCode = inputAnswer();

            for (int i = 0; i < secretCodeLength; i++) {
                for (int j = 0; j < secretCodeLength; j++) {
                    if (userCode.charAt(i) == codeGenerator.getSecretCode().getCode().charAt(j)) {
                        cowCounter++;
                    }
                }
                if (userCode.charAt(i) == codeGenerator.getSecretCode().getCode().charAt(i)) {
                    bullCounter++;
                    cowCounter--;
                }
            }
            String grade = checkGrade();
            System.out.println(grade);
        }
        System.out.print("Congratulations! You guessed the secret code.");
    }

    private String checkGrade() {
        String grade = "Grade: ";
        String bull = bullCounter == 1 ? "bull" : "bulls";
        String cow = cowCounter == 1 ? "cow" : "cows";
        if (bullCounter > 0 && cowCounter > 0) {
            grade += bullCounter + " " + bull + " and " + cowCounter + " " + cow;
        } else if (bullCounter > 0) {
            grade += bullCounter + " " + bull;
        } else if (cowCounter > 0) {
            grade += cowCounter + " " + cow;
        } else {
            grade += "None";
        }
        return grade + '.';
    }
}