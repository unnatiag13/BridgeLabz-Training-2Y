import java.util.Scanner;
public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        boolean areEqual=true;
        if(s1.length()!=s2.length()) System.out.println("Not equal");
        else{
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)!=s2.charAt(i)){
                    areEqual=false;
                }
            }
            System.out.println("Are both strings equal: "+areEqual+"\n using built-in function: "+s1.equals(s2));
        }
    }
}
