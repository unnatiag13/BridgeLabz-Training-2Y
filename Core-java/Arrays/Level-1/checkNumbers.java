import java.util.Scanner;
public class checkNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for(int i=0;i<numbers.length;i++) numbers[i] = sc.nextInt();
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>0){
                if(numbers[i]%2==0) System.out.println(numbers[i] + " is even");
                else System.out.println(numbers[i]+" is odd.");
            }
            else if (numbers[i]==0) System.out.println("number is zero");
            else System.out.println("Number is negative");
        }
        if(numbers[0]==numbers[numbers.length-1])
         System.out.println("First and last numbers are equal");
        else if(numbers[0]>numbers[numbers.length-1])
         System.out.println("First number is greater than last number");
        else if(numbers[0] < numbers[numbers.length-1]) {
        System.out.println("First number is smaller than last number");}
    }
}
