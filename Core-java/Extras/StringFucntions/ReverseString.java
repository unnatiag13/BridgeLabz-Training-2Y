import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();

        String stringRev="";
        for(int i=s.length()-1;i>=0;i--){
            stringRev+=s.charAt(i);
        }
        s=stringRev;
        System.out.println("Reversed string : "+s);

    }
}
