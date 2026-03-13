package Recursion;

public class lengthOfString {
    public static int length(String s){
        if(s==""){
        return 0;
    }
        return 1+length(s.substring(1));
    }
    public static void main(String[] args) {
        System.out.println(length("abcdefg"));
    }
}
