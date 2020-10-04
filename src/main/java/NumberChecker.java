public class NumberChecker {

    public String checkNumber(int input) {
        if (input > 0) {
            return "POSITIVE";
        } else if (input < 0) {
            return "NEGATIVE";
        } else {
            return "ZERO";
        }
    }
}
