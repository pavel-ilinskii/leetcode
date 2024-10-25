package org.t1r0.home.queuestack;

/**
 * Given an encoded string, return its decoded string.
 * <p>
 * The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times.
 * Note that k is guaranteed to be a positive integer.
 * <p>
 * You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed,
 * etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].
 * <p>
 * The test cases are generated so that the length of the output will never exceed 105.
 */
public class DecodeString {

    int index = 0;

    String decodeString(String s) {
        StringBuilder result = new StringBuilder();
        while (index < s.length() && s.charAt(index) != ']') {
            if (!Character.isDigit(s.charAt(index)))
                result.append(s.charAt(index++));
            else {
                int k = 0;
                while (index < s.length() && Character.isDigit(s.charAt(index)))
                    k = k * 10 + s.charAt(index++) - '0';
                index++;
                String decodedString = decodeString(s);
                index++;
                while (k-- > 0) result.append(decodedString);
            }
        }
        return new String(result);
    }
}
