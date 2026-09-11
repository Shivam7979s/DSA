class Solution {
    public boolean isNumber(String s) {
        boolean digit = false;
        boolean dot = false;
        boolean e = false;
        boolean digitAfterE = true;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Digit
            if (Character.isDigit(ch)) {

                digit = true;

                if (e) {
                    digitAfterE = true;
                }
            }

            // Decimal point
            else if (ch == '.') {

                // Dot cannot appear after e/E
                if (e) {
                    return false;
                }

                // Only one dot allowed
                if (dot) {
                    return false;
                }

                dot = true;
            }

            // e or E
            else if (ch == 'e' || ch == 'E') {

                // Only one e/E allowed
                if (e) {
                    return false;
                }

                // There must be a valid number before e/E
                if (!digit) {
                    return false;
                }

                e = true;
                digitAfterE = false;
            }

            // + or -
            else if (ch == '+' || ch == '-') {

                // Sign is allowed only at beginning
                // or immediately after e/E
                if (i != 0 && s.charAt(i - 1) != 'e'
                        && s.charAt(i - 1) != 'E') {
                    return false;
                }
            }

            // Anything else
            else {
                return false;
            }
        }

        return digit && digitAfterE;
    }
}