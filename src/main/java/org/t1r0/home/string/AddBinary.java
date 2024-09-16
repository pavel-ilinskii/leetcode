package org.t1r0.home.string;

/**
 * Given two binary strings a and b, return their sum as a binary string.
 */
public class AddBinary {

    public String addBinary(String a, String b) {
        if (a.length() < b.length()) return addBinary(b, a);

        boolean carry = false;
        char[] ansChar = new char[a.length()];
        char aChar;
        char bChar;

        for (int i = 0; i < a.length(); i++) {
            int n = a.length() - 1 - i;
            aChar = a.charAt(n);

            if (i >= b.length()) bChar = '0';
            else bChar = b.charAt(b.length() - 1 - i);

            if (aChar == '1' && bChar == '1') {
                if (carry) {
                    ansChar[n] = '1';
                } else {
                    ansChar[n] = '0';
                }
                carry = true;
            } else if (aChar == '0' && bChar == '0') {
                if (carry) {
                    ansChar[n] = '1';
                    carry = false;
                } else {
                    ansChar[n] = '0';
                }
            } else {
                if (carry) {
                    ansChar[n] = '0';
                } else {
                    ansChar[n] = '1';
                }
            }
        }

        if (carry) {
            return "1" + new String(ansChar);
        } else {
            return new String(ansChar);
        }
    }
}
