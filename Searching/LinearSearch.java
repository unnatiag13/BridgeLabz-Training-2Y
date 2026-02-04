package Searching;
import java.util.*;
public class LinearSearch {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr ={1,2,3,4,5};
        int target = sc.nextInt();
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==target) System.out.println("Index of target element: " + i);
        }
        sc.close();
    }
}
