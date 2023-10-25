package org.string;

public class MoveHashesToFront {
    public static void main(String[] args) {

        String str = "Move#Hash#to#Front";
        String result  = moveHashToFront(str);
        System.out.println(result);
    }

    private static String moveHashToFront(String str) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '#')
                sb1.append(str.charAt(i));
            else
                sb2.append(str.charAt(i));
        }

        return sb1.append(sb2).toString();
    }
}
