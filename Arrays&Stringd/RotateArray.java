import java.util.*;

public class RotateArray {
     public static void reverse(int[] nums,int start,int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void rotate(int[] nums ,int n, int d){
        d=d%n;
        reverse(nums,0,n-d-1);
        reverse(nums,n-d,n-1);
        reverse(nums,0,n-1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr ={1,2,3,4,5,6};
        int n = arr.length;
        int d = 2;
        rotate(arr,n,d);
        System.out.println(Arrays.toString(arr));

        
        sc.close();

    }
}
