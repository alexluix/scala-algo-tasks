package lp.algotasks.interviewbit.string;

import java.util.Stack;

/**
 * Reverse string
 *
 * [https://www.interviewbit.com]
 */
public class ReverseString {

    public String reverseWords(String a) {
        Stack<String> stack = new Stack<>();
        StringBuilder wordBuilder = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            boolean whitespace = Character.isWhitespace(c);
            if (!whitespace) {
                wordBuilder.append(c);
            }

            boolean endOfString = i == a.length() - 1;
            if ((whitespace || endOfString) && wordBuilder.length() > 0) {
                stack.push(wordBuilder.toString());
                wordBuilder = new StringBuilder();
            }
        }

        StringBuilder resultBuilder = new StringBuilder();
        while (!stack.empty()) {
            resultBuilder.append(stack.pop());
            if (!stack.empty()) {
                resultBuilder.append(' ');
            }
        }

        return resultBuilder.toString();
    }

}
