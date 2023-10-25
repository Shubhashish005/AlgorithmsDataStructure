package org.string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReplaceCasesOfCharacter {

    public static void main(String[] args) {

        String str = "hello world";
        Character c = 'l';
        String replacedString = replaceCharacter(str, c);
        System.out.println(replacedString);
    }

    private static boolean checkIfLowerCase(Character character) {
        return Character.isLowerCase(character);
    }

    private static String replaceCharacter(String str, Character c) {
        return Arrays.stream(str.split(" "))
                .map(s -> s.replace(c.toString(), checkIfLowerCase(c) ? String.valueOf(Character.toUpperCase(c)) : String.valueOf(Character.toLowerCase(c))))
                .collect(Collectors.joining());
    }
}
