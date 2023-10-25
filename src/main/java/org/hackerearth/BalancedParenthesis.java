package org.hackerearth;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedParenthesis {

    public static void main(String[] args) {

        String input = "[()]{}{[()()]()}";
        boolean isBalanced = extracted(input);
        System.out.println(isBalanced);
    }

    private static boolean extracted(String input) {
        Map<Character, Character> stackMap = new LinkedHashMap<>();
        int i = -1;
        char[] charArray = input.toCharArray();
        Stack<Character> characterStack = new Stack<>();
        stackMap.put('(',')');
        stackMap.put('{','}');
        stackMap.put('[',']');
        for (Character ch : charArray) {

            if(characterStack.isEmpty() && !stackMap.containsKey(ch))
                return false;

            if(characterStack.isEmpty()){
                characterStack.push(ch);
                continue;
            }

            if(stackMap.get(characterStack.peek()) == ch){
                characterStack.pop();
            }else {
                if(stackMap.containsKey(ch)){
                    characterStack.push(ch);
                }else
                    return false;
            }

        }

        return characterStack.isEmpty() ;
    }
}

