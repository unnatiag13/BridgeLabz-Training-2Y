public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] arr = {7,-11,3,-1,12};
        int n= arr.length;
        // int maxSum =Integer.MIN_VALUE;
        // for(int i=0;i<n;i++){
        //     int sum=0;
        //     for(int j=i;j<n;j++){
        //         sum+=arr[j];
        //         if(sum>maxSum){
        //             maxSum = sum;
        //         }
        //     }
        // }
        // System.out.println(maxSum);

        //KADANE'S ALGORITHM

        int maxsum=0;
        int sum =0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum>maxsum) maxsum = sum;
            if(sum<0) sum =0; 
            
        }
        System.out.println(maxsum);

        // TO PRINT START AND END INDEX
     
    }
}
