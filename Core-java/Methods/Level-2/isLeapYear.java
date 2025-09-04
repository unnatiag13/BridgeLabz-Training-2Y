import java.util.Scanner;
public class isLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        boolean leap= isLeap(n);
        if(leap==true) System.out.println("Leap Year");
        else System.out.println("Not a Leap Year");
    }

    public static boolean isLeap(int n){
         boolean leap=true;
        if(n<1582) return false;
        else{
            if(n%4==0 && n%100!=0){
                leap=true;
            }
            else if(n%400==0){
                leap=true;
            }
            else {
                return false;
            }
        }
        return leap;
    }
}
