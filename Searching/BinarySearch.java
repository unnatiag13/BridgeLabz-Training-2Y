package Searching;
public class BinarySearch {
    public static int binarySearch(int[] nums,int target){
        int start =0;
        int end = nums.length;
        while(start<end){
            int mid =(start+end)/2;
            if(target>nums[mid]){
                start = mid+1;
            }else if(target<nums[mid]){
                end = mid -1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8};
        int target = 8;
        System.out.println("index of target element: "+binarySearch(arr, target));
    }
}
