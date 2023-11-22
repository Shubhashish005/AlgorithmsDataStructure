package org.string;

public class PermutationOfaString {

    public static void main(String[] args) {

        PermutationOfaString ps = new PermutationOfaString();
        String input = "ABC";
        ps.permute(input, 0, input.length()-1);
    }

    private void permute(String input, int start, int end) {
        if(start == end){
            System.out.println(input);
        }else{
            for(int i=start; i<=end; i++){
                input = swap(input, start, i);
                permute(input, start + 1, end);
                input = swap(input, start, i);
            }
        }
    }

    private String swap(String s, int start, int i) {
        char temp;
        char[] charArray = s.toCharArray();
        temp = charArray[start];
        charArray[start] = charArray[i];
        charArray[i] = temp;
        return String.valueOf(charArray);
    }


}
