package javaSolutions;

import java.util.HashSet;

public class Pangram {
    public static String solution(String s){
        s = s.toLowerCase();
        s = s.replace(" ", "");

        HashSet<Character> elems = new HashSet<>();
        char[] alphs = s.toCharArray();
        int count = 26;

        for(char c : alphs){
            elems.add(c);
        }
        if (elems.size() == count){
            System.out.println("pangram");
            return "pangram";
        }
        System.out.println("not pangram");
        return "not pangram";
    }
    public static void main(String[] args){
        String s = "We promptly judged antique ivory buckles for the prize";
        Pangram.solution(s);
    }
}
