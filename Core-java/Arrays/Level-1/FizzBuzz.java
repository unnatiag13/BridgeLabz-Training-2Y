import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= sc.nextInt();
        String arr[] = new String[n]; 
        if(n>0){
            for(int i=0;i<n;i++){
                if(i%5==0 && i%3==0) arr[i] = "FizzBuzz";
                else if(i%3==0) arr[i]="Fizz";
                else if(i%5==0) arr[i]="Buzz";
                
                else arr[i] = Integer.toString(i);
            }
            arr[0] = Integer.toString(0);
        }
        for(int i=0;i<arr.length;i++) System.out.print(arr[i] +" ");
        sc.close();
    }
}
