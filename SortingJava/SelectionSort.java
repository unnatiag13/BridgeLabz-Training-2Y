package SortingJava;
import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            int mini = i;
            for(int j=i;j<n;j++){
                if(arr[j]< arr[mini]) mini =j;
            }
            int temp =arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,6,7,1,3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
