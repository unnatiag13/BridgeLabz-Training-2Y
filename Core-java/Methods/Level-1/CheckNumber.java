import java.util.Scanner;
public class CheckNumber {

    public static int checkNumber(int n) {
        if(n>0) return 1;
        if(n==0) return 0;
        else return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        int result = checkNumber(num);
        if(result==0) System.out.println("Zero");
        else if(result>0) System.out.println("Positive Number");
        else System.out.println("Negative Number");

    }
}
