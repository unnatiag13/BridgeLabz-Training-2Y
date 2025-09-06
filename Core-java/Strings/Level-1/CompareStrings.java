import java.util.Scanner;
public class CompareStrings {
        public static boolean areEqual(String s1,String s2){
            boolean areEqual=true;
             for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)!=s2.charAt(i)){
                    areEqual=false;
                }
            }
            return areEqual;
        }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        if(s1.length()!=s2.length()) System.out.println("Not equal");
        else{
            System.out.println("Are both strings equal: "+areEqual(s1,s2)+"\n using built-in function: "+s1.equals(s2));
        }
    }
}
