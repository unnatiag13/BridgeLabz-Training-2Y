import java.util.Scanner;
public class NullPointerEx{
    public static void generateException(){
        String text=null;
        System.out.println(text.length());
    }
    public static void handleException(){
        try{
            String text=null;
            System.out.println(text.length());
        } catch(NullPointerException e){
            System.out.println("NullPointerException caught "+e);
        }
    }
    public static void main(String[] args) {
        // generateException();
        handleException();
    }
}
