package org.t1r0.home.string;

public class ReverseWordsInStringIII {

    public String reverseWords(String s) {
        var words = s.split("\\s");
        var sb = new StringBuilder();
        for (String word : words) {
            for (int i = word.length() - 1; i >= 0; i--) {
                sb.append(word.charAt(i));
            }
            sb.append(" ");
        }
        return sb.substring(0, sb.length() - 1);
    }
}
