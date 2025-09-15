import java.util.Scanner;
public class LargestAndSecondLargest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int maxDigit=10;
        int i=0;
        int[] arr = new int[maxDigit];
        while(num!=0){
            arr[i++] = num%10;
            num/=10;
        }
        int largest = 0;
        int secondLargest = 0;

        for(int j=0;j<arr.length;j++){
            if(arr[j]>largest) largest=arr[j];
            if(arr[j]<largest && arr[j]>secondLargest) secondLargest = arr[j];
        }
        System.out.println("Largest: "+largest+"\nSecond Largest: "+secondLargest);

    }
}