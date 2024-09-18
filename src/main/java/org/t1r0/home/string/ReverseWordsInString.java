package org.t1r0.home.string;

/**
 * Given an input string s, reverse the order of the words.
 * <p>
 * A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
 * <p>
 * Return a string of the words in reverse order concatenated by a single space.
 * <p>
 * Note that s may contain leading or trailing spaces or multiple spaces between two words.
 * The returned string should only have a single space separating the words. Do not include any extra spaces.
 */
public class ReverseWordsInString {

    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int end = s.length() - 1;
        int start;
        while (end >= 0) {
            if (s.charAt(end) == ' ') {
                end--;
                continue;
            }
            start = end;
            while (start >= 0 && s.charAt(start) != ' ') {
                start--;
            }
            sb.append(s, start + 1, end + 1);
            sb.append(" ");
            end = start;
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }
}
