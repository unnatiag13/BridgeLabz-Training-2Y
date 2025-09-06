import java.util.Scanner;
public class SubstringCompare {
    public static String createSubstr(String s1,int sidx,int eidx){
        String substr="";
        for(int i=sidx;i<eidx;i++){
            substr+=s1.charAt(i);
        }
        return substr;
    }
    public static boolean compareStrings(String s1, String s2){
        boolean equal=true;
        if(s1.length()!=s2.length()) return false;
        else{
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)!=s2.charAt(i)) equal =false;
            }
        }
        return equal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int strtidx = sc.nextInt();
        int endidx = sc.nextInt();
        String s1 = s.substring(strtidx,endidx);
        String s2 = createSubstr(s, strtidx, endidx);
        System.out.println("substring created by built-in function: "+s1 +
        "\nsubstring created by user-made method: "+ s2 +
        "\nAre they two equal: "+ compareStrings(s1, s2));

    }
}
