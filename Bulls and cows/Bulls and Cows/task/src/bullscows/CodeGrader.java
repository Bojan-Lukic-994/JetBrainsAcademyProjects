package bullscows;

public class CodeGrader {
    private int bulls;
    private int cows;
    private SecretCode secretCode;

    //constructor for class CodeGrader
    public CodeGrader(String secretCode) {
        this.bulls = 0;
        this.cows = 0;
        this.secretCode = new SecretCode(secretCode);
    }

    //method that grades the user input
    public void compare(String input) {

        //checks how many bulls are guessed
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == this.secretCode.getSecretCode().charAt(i)) {
                this.bulls++;
            }

            //checks how many cows are guessed
            if (input.charAt(i) != this.secretCode.getSecretCode().charAt(i)
                    && this.secretCode.getSecretCode().indexOf(input.charAt(i)) != -1) {
                this.cows++;
            }
        }
    }

    //method that prints out the results based on number of bulls and cows
    @Override
    public String toString() {
        if (this.bulls == 0 && this.cows == 0) {
            return "Grade: None. " + "The secret code is " + this.secretCode.getSecretCode();
        }

        if (this.bulls == 0) {
            return "Grade:  " + +this.cows + " cow(s). The secret code is " + this.secretCode.getSecretCode();
        }

        if (this.cows == 0) {
            return "Grade:  " + +this.bulls + " bull(s). The secret code is " + this.secretCode.getSecretCode();
        }

        return "Grade: " + this.bulls + " bull(s) and " + this.cows + " cow(s). The secret code is " + this.secretCode.getSecretCode();
    }
}
