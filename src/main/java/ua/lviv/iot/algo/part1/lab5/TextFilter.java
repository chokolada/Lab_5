package ua.lviv.iot.algo.part1.lab5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextFilter {
    public boolean isSentenceEmphasized(String sentence) {
        Pattern emphasizePattern = Pattern.compile(".*!$");
        Matcher emphasizeMatcher = emphasizePattern.matcher(sentence);
        if (emphasizeMatcher.find()) {
            System.out.println("Sentence ends with '!'");
            return true;
        } else {
            System.out.println("Sentence doesn't end with '!'");
            return false;
        }
    }
    public int allConsonantsCounter(String sentence) {
        Pattern textPattern = Pattern.compile("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]");
        Matcher textMatcher = textPattern.matcher(sentence);
        int i = 0;
        while (textMatcher.find()) {
            i++;
        }
        System.out.println("Amount of consonants: " + i);
        return i;
    }
    public static void main(String[] args) {
        TextFilter textFiltered = new TextFilter();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text:");
        String text = scanner.nextLine();
        System.out.println(textFiltered.allConsonantsCounter(text));
        System.out.println(textFiltered.isSentenceEmphasized(text));
    }
}