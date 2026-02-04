package Searching;

// Problem:
// You are given a rotated sorted array. Write a program that performs Binary Search to find the
// index of the smallest element in the array (the rotation point).
// Approach:
// 1. Initialize left as 0 and right as n - 1.
// 2. Perform a binary search:
// ○ Find the middle element mid = (left + right) / 2.

// ○ If arr[mid] > arr[right], then the smallest element is in the right half, so
// update left = mid + 1.
// ○ If arr[mid] < arr[right], the smallest element is in the left half, so update
// right = mid.

// 3. Continue until left equals right, and then return arr[left] (the rotation point).

public class Binary01 {
    public static void main(String[] args) {
        int[] arr={3,4,5,1};
        int left =0 , right = arr.length-1;
        while(left<right){
            int mid = (left+right)/2;
            if(arr[mid]>arr[right]){
                left = mid+1;
            }else{
                right=mid;
            }
        }
        System.out.println("Rotation point index: "+left);
        System.out.println("Smallest element: " + arr[left]);
    }
}
