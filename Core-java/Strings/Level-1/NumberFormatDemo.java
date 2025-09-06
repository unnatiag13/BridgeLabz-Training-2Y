import java.util.Scanner;
public class NumberFormatDemo {
    public static void generateException(String s) {
        System.out.println(Integer.parseInt(s));
    }
    public static void handleException(String s) {
        try{
            System.out.println(Integer.parseInt(s));
        } catch(NumberFormatException e){
            System.out.print("Number format exception caught: \n"+e);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        // generateException(s);
        handleException(s);
    }
}
