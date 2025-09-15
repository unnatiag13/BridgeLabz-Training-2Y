import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int m=num;
        int count =0;
        while(m!=0){
            count++;
            m/=10;
        }
        int[] arr = new int[count];
        System.out.print("Reversed number: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = num%10;
            num/=10;
            System.out.print(arr[i]);
        }
        
    }
}
