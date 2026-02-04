import java.util.Arrays;

public class AddOne {
    public static int[] add(int[] arr,int i) {
        if(arr[i]<9){
                arr[i] +=1;
                return arr;
        }
        else{
                arr[i]=0;
            }
        return arr;
    }
        
    public static void main(String[] args) {
        int[] arr = {9,9,9};
        int n= arr.length;
        // if(arr[n-1]<9) arr[n-1] +=1;
        // else{
        //     int i=n-1;
        //     while(arr[i]+1>9 && i>0){
        //         arr[i] =0;
        //         i--;
        //     }
        //     arr[i]++;
        // }
        // System.err.println(Arrays.toString(arr));
        for(int i=n-1;i>=0;i--){
            add(arr,i);
        }
        System.out.println(Arrays.toString(arr));

        
    }
}
