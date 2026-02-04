import java.util.*;

public class moveZerosToEnd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        //taking new array
        // int[] arr2 = new int[n];
        // int i=0;
        // for(int x:arr){
        //     if(x!=0){
        //         arr2[i++] = x;
        //     }
        // }
        // System.out.println(Arrays.toString(arr2));

        //in that array
        int temp;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1]=temp;
            }
        }
        sc.close();
    }
}