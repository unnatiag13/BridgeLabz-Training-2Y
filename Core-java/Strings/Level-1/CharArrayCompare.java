import java.util.Arrays;
import java.util.Scanner;
public class CharArrayCompare {
    public static char[] toChArr(String s){
        char[] arr=new char[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i]=s.charAt(i);
        }
        return arr;
    }
    public static boolean compareCharArr(char[] a,char[] b){
        boolean equals = true;
        if(a.length!=b.length) return false;
        else{
            for(int i=0;i<a.length;i++){
                if(a[i]!=b[i]) equals=false;
            }
        }
        return equals;
    }
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        String s = sc.next();
        char[] carr =s.toCharArray();
        char[] uarr = toChArr(s);
        System.out.println("user-made char array: "+Arrays.toString(uarr)+"\nUsing Built-in method: "+Arrays.toString(carr)
        +"\nAre the two char arrays same : "+compareCharArr(carr, uarr));
    }
}
